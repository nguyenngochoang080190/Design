package hoang.designpattern.UsefulEx;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

import hoang.designpattern.MyApplication.MyApp;
import hoang.designpattern.R;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Bluetooth extends Fragment implements View.OnClickListener,ConnectivityReceiver.ConnectivityReceiverListener {
    Button b1, t, w1, w2;
    BluetoothAdapter adapter;
    Set<BluetoothDevice> list;
    NetworkInfo mobile, wifi;
    WifiManager wifiManager;
    ConnectivityManager connectivityManager;
    TextView textView;
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.bluetooth, v, false);
        textView=(TextView) view.findViewById(R.id.tv);
        b1 = (Button) view.findViewById(R.id.enable);
        t = (Button) view.findViewById(R.id.disable);
        w1 = (Button) view.findViewById(R.id.enablew);
        w2 = (Button) view.findViewById(R.id.disablew);
        b1.setOnClickListener(this);
        t.setOnClickListener(this);
        w1.setOnClickListener(this);
        w2.setOnClickListener(this);
        adapter = BluetoothAdapter.getDefaultAdapter();
        wifiManager = (WifiManager) getContext().getSystemService(Context.WIFI_SERVICE);
        connectivityManager = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (mobile.isConnectedOrConnecting()) {
            Log.v("HH", "Mobile connection");
        }
        if (wifi.isConnectedOrConnecting())
            Log.v("HH", "Wifi connection");
        if(!mobile.isConnectedOrConnecting()&&!wifi.isConnectedOrConnecting())
            Log.v("HH", "No connection");

        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.enable:
                Intent t = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivity(t);
                break;
            case R.id.disable:
                Intent t1 = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivity(t1);
                break;
            case R.id.enablew:
                wifiManager.setWifiEnabled(true);
                break;
            case R.id.disablew:
                wifiManager.setWifiEnabled(false);
                break;
        }

    }
    @Override
    public void onResume()
    {
        super.onResume();
        MyApp.getInstance().setConnectivityListener(this);
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        textView.setText(""+isConnected);
    }
}
