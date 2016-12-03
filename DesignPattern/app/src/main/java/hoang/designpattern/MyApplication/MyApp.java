package hoang.designpattern.MyApplication;

import android.app.Application;

import hoang.designpattern.UsefulEx.ConnectivityReceiver;

/**
 * Created by Administrator on 12/2/2016.
 */

public class MyApp extends Application {
    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized MyApp getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
