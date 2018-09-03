package com.example.shaochengyang.fragmenttabwithsubtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SubPager extends FragmentPagerAdapter{
    int tabcount;
    public SubPager(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SubTab1 tab1 = new SubTab1();
                return tab1;
            case 1:
                SubTab2 tab2 = new SubTab2();
                return tab2;
            case 2:
                SubTab3 tab3 = new SubTab3();
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
