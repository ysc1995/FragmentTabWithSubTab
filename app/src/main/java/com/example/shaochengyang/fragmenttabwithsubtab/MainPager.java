package com.example.shaochengyang.fragmenttabwithsubtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPager extends FragmentPagerAdapter{
    int tabcount;
    public MainPager(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MainTab1 tab1 = new MainTab1();
                return tab1;
            case 1:
                MainTab2 tab2 = new MainTab2();
                return tab2;
            case 2:
                MainTab3 tab3 = new MainTab3();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
