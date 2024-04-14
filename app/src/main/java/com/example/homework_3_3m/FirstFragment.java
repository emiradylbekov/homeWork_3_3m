package com.example.homework_3_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView rvFilms;
    private ArrayList<String> filmList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFilms = requireActivity().findViewById(R.id.rv_films);
        loadData();
        FilmAdapter filmAdapter = new FilmAdapter(filmList);
        rvFilms.setAdapter(filmAdapter);
    }
    private void loadData () {
        filmList.add("Один дома");
        filmList.add("Мстители");
        filmList.add("Терминатор");
        filmList.add("Час пик");
        filmList.add("Железный человек");
        filmList.add("Человек паук");
        filmList.add("Форсаж");
        filmList.add("Перевозчик");
        filmList.add("Неудержимые");
        filmList.add("Великий Гетсби");
        filmList.add("Титаник");
        filmList.add("Лига справедливости");
    }
}