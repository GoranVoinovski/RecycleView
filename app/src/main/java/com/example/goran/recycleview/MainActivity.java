package com.example.goran.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)RecyclerView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        CustomAdapter adapter = new CustomAdapter();
        myView.setHasFixedSize(true);
        myView.setLayoutManager(new LinearLayoutManager(this));
        myView.setAdapter(adapter);


    }

    public void generateList() {



      return;
    }
}
