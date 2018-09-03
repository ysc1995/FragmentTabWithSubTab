package com.example.shaochengyang.fragmenttabwithsubtab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainTab2 extends Fragment{

    TabLayout tabLayout2;
    ViewPager viewPager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.maintab2,container,false);

        tabLayout2 = view.findViewById(R.id.tabLayout2);
        viewPager2=view.findViewById(R.id.pager2);

        /*SubPager subPager = new SubPager(getFragmentManager(),tabLayout2.getTabCount());
        *//*viewPager2.setAdapter(subPager);*/


        return view;
    }
}
