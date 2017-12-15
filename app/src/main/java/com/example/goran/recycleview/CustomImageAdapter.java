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

public class CustomImageAdapter extends RecyclerView.Adapter<CustomImageAdapter.ViewHolder> {
    Context context;
    List<ImageData> imageDataList = new ArrayList<>();
    OnRecycleViewImageClickListener onRecycleViewImageClickListener;

    public void setItems(List<ImageData>images){

        imageDataList = images;
    }

    public CustomImageAdapter(Context _context, OnRecycleViewImageClickListener _onRecycleViewImageClickListener) {
        context = _context;
        onRecycleViewImageClickListener = _onRecycleViewImageClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);



        View view = inflater.inflate(R.layout.image_layout, parent, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final ImageData oneImage = imageDataList.get(position);

        holder.tekstTag.setText(oneImage.getTags());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRecycleViewImageClickListener.onRowClick(oneImage,position);
            }
        });

        Picasso.with(context).load(oneImage.getPreviewURL()).centerInside().fit().into(holder.img);


    }

    @Override
    public int getItemCount() {
        return imageDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.slika)ImageView img;
        @BindView(R.id.tagslika)TextView tekstTag;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }
}
