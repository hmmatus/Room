package com.example.manrique_matus.room.Classes;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "movie")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    private int idMovie;

    @ColumnInfo(name = "nom_movie")
    private String nomMovie;

    @ColumnInfo(name = "desc_movie")
    private String descMovie;


    @ColumnInfo(name = "nom_category")
    private String nomCategory;

    @ColumnInfo(name = "nom_studio")
    private String nomEstudio;


    //Constructores
    public Movie() {
    }

    public Movie(String nomMovie, String nomCategory, String nomStudio) {
        this.nomMovie = nomMovie;
        this.nomCategory = nomCategory;
        this.nomEstudio = nomStudio;
    }

    //Setters y Getters

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNomMovie() {
        return nomMovie;
    }

    public void setNomMovie(String nomMovie) {
        this.nomMovie = nomMovie;
    }

    public String getDescMovie() {
        return descMovie;
    }

    public void setDescMovie(String descMovie) {
        this.descMovie = descMovie;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public String getNomEstudio() {
        return nomEstudio;
    }

    public void setNomEstudio(String nomEstudio) {
        this.nomEstudio = nomEstudio;
    }


}


