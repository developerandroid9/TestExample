package com.example.suneel.testexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class AdapterMileStone extends RecyclerView.Adapter<AdapterMileStone.MyViewHolder> {

    private final int[] imageList = {
            R.mipmap.select_video,
            R.mipmap.select_image,
            R.mipmap.select_milestone,
            R.mipmap.select_video,
            R.mipmap.select_image,
            R.mipmap.select_milestone,
            R.mipmap.select_video,
            R.mipmap.select_image,
            R.mipmap.select_milestone,
            R.mipmap.select_milestone,

    };

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTV;
        private ImageView imageIV;

        public MyViewHolder(View view) {
            super(view);
            nameTV = (TextView) view.findViewById(R.id.nameTV);
            imageIV = (ImageView) view.findViewById(R.id.imageIV);

        }
    }


    public AdapterMileStone() {

    }

    @Override
    public AdapterMileStone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_milstone, parent, false);

        return new AdapterMileStone.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AdapterMileStone.MyViewHolder holder, int position) {
        holder.nameTV.setText("Milstone Name");
        holder.imageIV .setImageResource(imageList[position]);
    }

    @Override
    public int getItemCount() {
        return imageList.length;
    }
}
