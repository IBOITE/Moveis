package com.ibo.mymoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Controller.MoviesAdapter;
import Model.Movie;

public class MainActivity extends AppCompatActivity {

    List<Movie> movieList=new ArrayList<>();
    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.reID);
        moviesAdapter=new MoviesAdapter(this,movieList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(moviesAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        MoviesData();

    }

    private void MoviesData() {
        Movie movie=new Movie("Birds of Pery","Action","2020",R.drawable.android);
        movieList.add(movie);
        Movie movie1=new Movie("Birds of Pery1","Action","2021",R.drawable.android);
        movieList.add(movie1);
        Movie movie2=new Movie("Birds of Pery2","Action","2022",R.drawable.android);
        movieList.add(movie2);
        Movie movie3=new Movie("Birds of Pery3","Action","2023",R.drawable.android);
        movieList.add(movie3);
        Movie movie4=new Movie("Birds of Pery4","Action","2024",R.drawable.android);
        movieList.add(movie4);
        Movie movie5=new Movie("Birds of Pery5","Action","2025",R.drawable.android);
        movieList.add(movie5);
        Movie movie6=new Movie("Birds of Pery6","Action","2026",R.drawable.android);
        movieList.add(movie6);
        Movie movie7=new Movie("Birds of Pery7","Action","2027",R.drawable.android);
        movieList.add(movie7);

        moviesAdapter.notifyDataSetChanged();
    }
}