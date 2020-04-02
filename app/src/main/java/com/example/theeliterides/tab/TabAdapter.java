package com.example.theeliterides.tab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFrag = new ArrayList<>();
    private List<String> mTitle = new ArrayList<>();

    public TabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    public void addFragment(Fragment fragment, String title){
        mFrag.add(fragment);
        mTitle.add(title);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFrag.get(position);
    }

    @Override
    public int getCount() {
        return mFrag.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
