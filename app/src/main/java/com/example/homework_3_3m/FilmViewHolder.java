package com.example.homework_3_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFilmName;
    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFilmName = itemView.findViewById(R.id.tv_film_name);
    }
    public void onBind (String film) {
        tvFilmName.setText(film);
    }
}
