package com.example.goran.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainImagesActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)RecyclerView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        CustomImageAdapter adapter = new CustomImageAdapter(this);

        adapter.setItems(generateList());


        myView.setHasFixedSize(true);
        myView.setLayoutManager(new LinearLayoutManager(this));
        myView.setAdapter(adapter);
    }



    ArrayList<ImageData> generateList() {

        ArrayList<ImageData> imageArrayList = new ArrayList<>();


        imageArrayList.add(new ImageData("https://cdn.pixabay.com/photo/2017/12/11/17/15/lantern-3012749_150.jpg"));
        imageArrayList.add(new ImageData("https://cdn.pixabay.com/photo/2017/12/11/17/15/lantern-3012749_150.jpg"));
        imageArrayList.add(new ImageData("https://cdn.pixabay.com/photo/2017/12/11/17/15/lantern-3012749_150.jpg"));
        imageArrayList.add(new ImageData("https://cdn.pixabay.com/photo/2017/12/11/17/15/lantern-3012749_150.jpg"));


        return imageArrayList;
    }
}
