package com.example.vaishu.roomdatabase;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.vaishu.roomdatabase.Roomdatabase.Favoritemovie;
import com.example.vaishu.roomdatabase.Roomdatabase.Mydatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView r;
    Mydatabase mydatabase;
    MyAdapter ad;
    Moviemodel mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.recycle);
        mydatabase= Room.databaseBuilder(this,Mydatabase.class,"moviedb").allowMainThreadQueries().build();
        mm= ViewModelProviders.of(this).get(Moviemodel.class);
        List<Favoritemovie> list=new ArrayList<>();
        list=mydatabase.mydao().getAllData();
        mm.setList(list);
        Observer<List<Favoritemovie>> observer=new Observer<List<Favoritemovie>>() {
            @Override
            public void onChanged(@Nullable List<Favoritemovie> favoritemovies) {
                ad=new MyAdapter(MainActivity.this,favoritemovies);
                r.setAdapter(ad);
            }
        };
       mm.getList().observe(this,observer);
        r.setLayoutManager(new LinearLayoutManager(this));
        //r.setAdapter(ad);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mm.getList().setValue(mydatabase.mydao().getAllData());
    }

    public void fab(View view) {
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }
}
