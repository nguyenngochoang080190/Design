package hoang.designpattern.UsefulEx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/2/2016.
 */

public class MyMap extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.activity_main, v, false);

        return view;
    }

}
