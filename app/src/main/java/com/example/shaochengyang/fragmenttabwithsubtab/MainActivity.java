package com.example.shaochengyang.fragmenttabwithsubtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainActivity extends AppCompatActivity implements TabLayout.OnClickListener, TabLayout.OnTabSelectedListener {
    Toolbar toolbar;
    TabLayout tabLayout,tabLayout2;
    ViewPager viewPager,viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.pager);
        tabLayout2=findViewById(R.id.tabLayout2);


        setSupportActionBar(toolbar);

        tabLayout.addTab(tabLayout.newTab().setText("Main1"));
        tabLayout.addTab(tabLayout.newTab().setText("Main2"));
        tabLayout.addTab(tabLayout.newTab().setText("Main3"));
        tabLayout.setTabGravity(1);



        /*tabLayout2.setOnTabSelectedListener(this);*/
        tabLayout.setOnTabSelectedListener(this);

        MainPager mainPager = new MainPager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(mainPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tabLayout.setScrollPosition(position,0,true);
                tabLayout.setSelected(true);

                if(position==1) {

                    tabLayout2.removeAllTabs();
                    tabLayout2.addTab(tabLayout2.newTab().setText("Sub1"));
                    tabLayout2.addTab(tabLayout2.newTab().setText("Sub2"));
                    tabLayout2.addTab(tabLayout2.newTab().setText("Sub3"));



                }
                else{
                    tabLayout2.removeAllTabs();
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
