package com.example.vaishu.roomdatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaishu.roomdatabase.Roomdatabase.Favoritemovie;

import java.util.List;

/**
 * Created by Vaishu on 11-07-2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context c;
    List<Favoritemovie> list;
    public MyAdapter(MainActivity mainActivity, List<Favoritemovie> list) {
        c=mainActivity;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(c).inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.t1.setText(list.get(position).getMovie_title());
        holder.t2.setText(list.get(position).getMovie_description());
        holder.t3.setText(String.valueOf( list.get(position).getMovie_rating()));
        holder.t4.setText(list.get(position).getMovie_poster());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.movie_title);
            t2=itemView.findViewById(R.id.movie_description);
            t3=itemView.findViewById(R.id.rating);
            t4=itemView.findViewById(R.id.poster);
        }
    }
}
