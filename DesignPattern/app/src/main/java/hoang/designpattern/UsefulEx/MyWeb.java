package hoang.designpattern.UsefulEx;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/2/2016.
 */

public class MyWeb extends Fragment implements View.OnTouchListener, SensorEventListener {
    TextView textView;
    SensorManager sensorManager;
    Sensor light,gravity,pro,giatoc,hoichuyen,khiap;
    float light1, gra1, pro1, giatoc1,hoichuyen1,khiap1;

    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.webview, v, false);
        textView = (TextView) view.findViewById(R.id.tview);
        sensorManager = (SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> list=sensorManager.getSensorList(Sensor.TYPE_ALL);
        int i=1;
        for (Sensor s:list
             ) {
            Log.v("SENSOR",i+": "+s.getName());
            i++;
        }
        khiap1=hoichuyen1=light1 = gra1 = pro1 = giatoc1 = 0;
        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        gravity = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
        pro = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        giatoc = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        hoichuyen = sensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE);


        view.setOnTouchListener(this);
        sensorManager.registerListener((SensorEventListener) this, light, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener((SensorEventListener) this, gravity, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener((SensorEventListener) this, pro, SensorManager.SENSOR_DELAY_NORMAL);
//        sensorManager.registerListener((SensorEventListener) this, giatoc, SensorManager.SENSOR_DELAY_GAME);
        sensorManager.registerListener((SensorEventListener) this, hoichuyen, SensorManager.SENSOR_DELAY_NORMAL);


        return view;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        return true;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        switch (sensorEvent.sensor.getType()) {
            case Sensor.TYPE_LIGHT:
                light1 = sensorEvent.values[0];
                break;
            case Sensor.TYPE_GRAVITY:
                gra1 = sensorEvent.values[0];
                break;
            case Sensor.TYPE_PROXIMITY:
                pro1 = sensorEvent.values[0];
                break;
            case Sensor.TYPE_ACCELEROMETER:
                giatoc1=sensorEvent.values[0];
                break;
            case Sensor.TYPE_TEMPERATURE:
                hoichuyen1=sensorEvent.values[0];
                break;

        }
        textView.setText(
                "Light: " + light1 + "\n" +
                        "Gra: " + gra1 + "\n" +
                        "Pro: " + pro1 + "\n"+
                        "Giatoc: " + giatoc1 + "\n"+
                        "nhiet: " + hoichuyen1 + "\n"+
                        "xoay: " + khiap1 + "\n"

        );

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    public void onDestroy()
    {
        super.onDestroy();
//        sensorManager.unregisterListener((SensorEventListener) this);
    }
}
