package com.example.manrique_matus.room.Classes;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "category")
public class Category {

    @PrimaryKey(autoGenerate = true)
    private int idCategory;

    @ColumnInfo(name = "nom_category")
    private String nomCategory;

    //Constructores
    public Category() {
    }

    public Category(int idCategory, String nomCategory) {
        this.idCategory = idCategory;
        this.nomCategory = nomCategory;
    }

    //Setters y Getters

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }
}
