package com.example.vaishu.roomdatabase;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vaishu.roomdatabase.Roomdatabase.Favoritemovie;
import com.example.vaishu.roomdatabase.Roomdatabase.Mydatabase;

public class SecondActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    String s1,s2,s4;
    double rat;
    Mydatabase mydatabase;
    Moviemodel mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1=findViewById(R.id.titleed1);
        e2=findViewById(R.id.desed2);
        e3=findViewById(R.id.ratted3);
        e4=findViewById(R.id.postered4);
        mydatabase= Room.databaseBuilder(this,Mydatabase.class,"moviedb").allowMainThreadQueries().build();
        mm= ViewModelProviders.of(this).get(Moviemodel.class);
    }
    public void submit(View view) {
        //TODO:Implement code to  write data to database
        s1=e1.getText().toString();
        s2=e2.getText().toString();
//        rat= Double.parseDouble(e3.getText().toString());
        s4=e4.getText().toString();
        if(s1!=null){
            Favoritemovie fm=new Favoritemovie();
            fm.setMovie_title(s1);
            fm.setMovie_description(s2);
         //   fm.setMovie_rating(rat);
            fm.setMovie_poster(s4);
            mydatabase.mydao().insetData(fm);
            Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Enter movie title", Toast.LENGTH_SHORT).show();
        }

    }


}
