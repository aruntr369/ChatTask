package com.arun.chattask;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapterr extends FragmentStatePagerAdapter {
    int noOftabs;
    public TabAdapterr(@NonNull FragmentManager fm,int noOftabs) {
        super(fm);
        this.noOftabs=noOftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            case 1:
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment;
            case 2:
                CallFragment callFragment = new CallFragment();
                return callFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return noOftabs;
    }
}
