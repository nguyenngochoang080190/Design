package hoang.designpattern.UsefulEx;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import hoang.designpattern.R;
import hoang.designpattern.UsefulEx.CustomView.GPSTracker;

/**
 * Created by Administrator on 12/1/2016.
 */

public class main extends AppCompatActivity {
    GPSTracker gpsTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myacivity);
        gpsTracker=new GPSTracker(this);
        Location location=gpsTracker.getLocation();
        if(location!=null)
        {
            Log.v("HH",location.getLatitude()+"    "+location.getLongitude());
        }
    }

}