package hoang.designpattern.UsefulEx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hoang.designpattern.R;
import hoang.designpattern.UsefulEx.CustomView.CustomView;

/**
 * Created by Administrator on 12/2/2016.
 */

public class Genues extends Fragment {
    CustomView customView;

    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.genues, v, false);
        customView = (CustomView) view.findViewById(R.id.custom);
        return view;
    }
}
