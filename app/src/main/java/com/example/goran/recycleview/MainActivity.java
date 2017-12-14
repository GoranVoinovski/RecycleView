package com.example.goran.recycleview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)RecyclerView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        CustomAdapter adapter = new CustomAdapter(this);

        adapter.setItems(generateList());


        myView.setHasFixedSize(true);
        myView.setLayoutManager(new LinearLayoutManager(this));
        myView.setAdapter(adapter);


    }



    ArrayList<Student> generateList() {

        ArrayList<Student> studenti = new ArrayList<>();


        for (int i = 0; i < 100; i++) {

            if (i%2==0){
                studenti.add(new Student("Goran  " + i, true));
            }else {
                studenti.add(new Student("Goran  " + i, false));
            }
        }
        return studenti;
    }
}
