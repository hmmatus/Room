package com.example.manrique_matus.room.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.manrique_matus.room.Classes.AppDatabase;
import com.example.manrique_matus.room.Classes.Movie;
import com.example.manrique_matus.room.Interfaces.MoviesDAO;
import com.example.manrique_matus.room.R;

import java.util.List;

public class CreateMovie extends AppCompatActivity {
    EditText name,studio,category;
    Button btn;
    List<Movie> movies;
    String sname,sstudio,scat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_movie);

        btn=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        studio=findViewById(R.id.studio);
        category=findViewById(R.id.category);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sname=name.getText().toString();
                sstudio=studio.getText().toString();
                scat=category.getText().toString();
                AppDatabase db= AppDatabase.getAppDatabase(getApplicationContext());
                db.moviesDAO().insertMovie(new Movie(sname,sstudio,scat));
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
