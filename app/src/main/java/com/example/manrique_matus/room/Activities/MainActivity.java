package com.example.manrique_matus.room.Activities;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.manrique_matus.room.Adapter.MoviesAdapter;
import com.example.manrique_matus.room.Classes.AppDatabase;
import com.example.manrique_matus.room.Classes.Movie;
import com.example.manrique_matus.room.Threads.Thread;
import com.example.manrique_matus.room.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MoviesAdapter adapter;
    List<Movie> movies;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv=findViewById(R.id.rv);
        adapter=new MoviesAdapter(movies);
        rv.setLayoutManager(new LinearLayoutManager(this));

        AppDatabase db=AppDatabase.getAppDatabase(getApplicationContext());
        movies=db.moviesDAO().getAll();

        new Thread(movies,rv,adapter,db).execute();
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CreateMovie.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
