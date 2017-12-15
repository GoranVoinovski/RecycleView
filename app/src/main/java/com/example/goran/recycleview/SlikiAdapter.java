package com.example.goran.recycleview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.goran.recycleview.FragmentiSliki.Fragment1;

import java.util.ArrayList;

/**
 * Created by goran on 15.12.17.
 */

public class SlikiAdapter extends FragmentPagerAdapter{

    ArrayList<ImageData> sliki = new ArrayList<>();

    public void addSliki(ArrayList<ImageData> hits){


        sliki = hits;


    }



    public SlikiAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            Bundle args = new Bundle();
            args.putString("imageUrl", sliki.get(position).getPreviewURL());
            Fragment1 fragment = new Fragment1();
            fragment.setArguments(args);
            return fragment;
    }

    @Override
    public int getCount() {
        return sliki.size();
    }

}
