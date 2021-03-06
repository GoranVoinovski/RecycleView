package com.example.goran.recycleview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by goran on 7.12.17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Context context;
    List<Student> studentList = new ArrayList<>();

    public void setItems(List<Student>students){

        studentList = students;
    }

    public CustomAdapter(Context _context) {
        context = _context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);



        View view = inflater.inflate(R.layout.recycler__view_row, parent, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Student student = studentList.get(position);

        holder.mojtekst.setText(student.getsName());

        if (student.issOnline()){

            holder.mojtekst2.setText("Online");
            holder.mojtekst2.setTextColor(Color.GREEN);

        }else {
            holder.mojtekst2.setText("Offline");
            holder.mojtekst2.setTextColor(Color.RED);
        }

        Picasso.with(context).load("https://maxcdn.icons8.com/Share/icon/Users//user_male_circle_filled1600.png").centerInside().fit().into(holder.slika);


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.pic)ImageView slika;
        @BindView(R.id.textv)TextView mojtekst;
        @BindView(R.id.textv2)TextView mojtekst2;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }
}
