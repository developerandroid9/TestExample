package com.example.suneel.testexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class AdapterMileStone extends RecyclerView.Adapter<AdapterMileStone.MyViewHolder> {



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

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
