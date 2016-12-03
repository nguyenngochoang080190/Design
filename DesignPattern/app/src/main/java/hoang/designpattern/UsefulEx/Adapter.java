package hoang.designpattern.UsefulEx;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Adapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments;
    String[] titles;
    public Adapter(FragmentManager childFragmentManager, ArrayList<Fragment> fragments,String[] titles) {
        super(childFragmentManager);
        this.fragments=fragments;
        this.titles=titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        return titles[position];
    }
}
