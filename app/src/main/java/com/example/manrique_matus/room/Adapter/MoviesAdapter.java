package com.example.manrique_matus.room.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manrique_matus.room.Classes.Movie;
import com.example.manrique_matus.room.R;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    private List<Movie> movies;

    public static class MoviesViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView name,cat,studio;

        public MoviesViewHolder(View itemView){
            super(itemView);
            cardView=itemView.findViewById(R.id.cardview);
            name=itemView.findViewById(R.id.nomMov);
            cat=itemView.findViewById(R.id.nomCat);
            studio=itemView.findViewById(R.id.nomStudio);
        }
    }

    public MoviesAdapter(List<Movie> movies){this.movies=movies;}

    @Override
    public MoviesAdapter.MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new MoviesViewHolder(v));
    }

    @Override
    public void onBindViewHolder(MoviesAdapter.MoviesViewHolder holder, int position) {
        holder.name.setText(movies.get(position).getNomMovie());
        holder.cat.setText(movies.get(position).getNomCategory());
        holder.studio.setText(movies.get(position).getNomEstudio());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
