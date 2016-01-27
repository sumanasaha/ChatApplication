package com.example.sumanasaha.chatapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sumanasaha on 25/01/16.
 */
public class VivzAdapter extends RecyclerView.Adapter<VivzAdapter.MyViewHolder>{
    private LayoutInflater inflater;
    ArrayList<String> data= new ArrayList<>();
    public VivzAdapter(Context context,ArrayList<String> data)
    {
        inflater = LayoutInflater.from(context);
        this.data=data;
    }

    public VivzAdapter() {
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= inflater.inflate(R.layout.custom_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        if(data.size()!=0) {
            holder.title.setText(data.get(position));
          //  holder.icon.setImageResource(current.iconId);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
       // ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.listText);
       //     icon= (ImageView) itemView.findViewById(R.id.listIcon);
        }
    }
}
