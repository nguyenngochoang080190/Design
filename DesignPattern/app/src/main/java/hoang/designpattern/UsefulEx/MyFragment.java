package hoang.designpattern.UsefulEx;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/1/2016.
 */

public class MyFragment extends Fragment {
    TabLayout tab;
    ViewPager viewPager;
    ArrayList<Fragment> list;
    Adapter adapter;
    String[] titles;

    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.my_fragmet, v, false);
        tab = (TabLayout) view.findViewById(R.id.tab);
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        titles = getActivity().getResources().getStringArray(R.array.tabLayoutTitle);
        list = new ArrayList<>();
        list.add(new Bluetooth());

        list.add(new ClipBoard());
        list.add(new MyWeb());
        list.add(new Animation());
        list.add(new MediRecode());


        list.add(new Genues());
        list.add(new ImgeEffec());
        adapter = new Adapter(getChildFragmentManager(), list, titles);
        viewPager.setAdapter(adapter);
        viewPager.post(new Runnable() {
            @Override
            public void run() {
                tab.setupWithViewPager(viewPager);
            }
        });
        return view;
    }
}
