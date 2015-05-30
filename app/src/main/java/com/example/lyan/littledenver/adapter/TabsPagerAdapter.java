package com.example.lyan.littledenver.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lyan.littledenver.GalleryFragment;
import com.example.lyan.littledenver.ProfileFragment;
import com.example.lyan.littledenver.TaskFragment;
import com.example.lyan.littledenver.TestFragment;

/**
 * Created by lyan on 29/05/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // Top Rated fragment activity
                return new TestFragment();
            case 1:
                // Games fragment activity
                return new TaskFragment();
            case 2:
                // Movies fragment activity
                return new GalleryFragment();
            case 3:
                // Movies fragment activity
                return new ProfileFragment();
        }
        return  null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
