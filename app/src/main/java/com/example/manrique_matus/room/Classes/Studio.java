package com.example.manrique_matus.room.Classes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "studio")
public class Studio {
    @PrimaryKey(autoGenerate = true)
    private int idStudio;

    @ColumnInfo(name = "name_studio")
    private String nameStudio;

    //Constructor

    public Studio() {
    }

    public Studio(int idStudio, String nameStudio) {
        this.idStudio = idStudio;
        this.nameStudio = nameStudio;
    }

    //Setters y Getters

    public int getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(int idStudio) {
        this.idStudio = idStudio;
    }

    public String getNameStudio() {
        return nameStudio;
    }

    public void setNameStudio(String nameStudio) {
        this.nameStudio = nameStudio;
    }
}
