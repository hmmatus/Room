package com.example.manrique_matus.room.Interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.manrique_matus.room.Classes.Movie;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface MoviesDAO {

    @Query("SELECT * FROM MOVIE")
    List<Movie> getAll();


    @Insert(onConflict = REPLACE)
    void insertMovie(Movie movie);

}
