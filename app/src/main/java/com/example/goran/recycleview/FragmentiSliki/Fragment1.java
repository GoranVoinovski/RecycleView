package com.example.goran.recycleview.FragmentiSliki;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.goran.recycleview.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by goran on 15.12.17.
 */

public class Fragment1 extends Fragment {

    @BindView(R.id.slika)ImageView pic;
    private Unbinder mUnbind;
    String imageUrl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1,null);

        mUnbind = ButterKnife.bind(this, view);

      imageUrl =  getArguments().getString("imageUrl");

        Picasso.with(getActivity()).load(imageUrl).centerInside().fit().into(pic);

        return view;


    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbind.unbind();
    }
}
