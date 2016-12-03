package com.example.administrator.fcm_php_mysql;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.myapplicationdemo3.R;

/**
 * Created by Administrator on 11/9/2016.
 */

public class FcmActivity extends AppCompatActivity {
    TextView show, key;
    BroadcastReceiver mRegistrationBroadcastReceiver;
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.conten_demo_layout);

    }
}
