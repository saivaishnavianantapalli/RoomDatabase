package com.example.vaishu.roomdatabase.Roomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.lang.ref.SoftReference;

/**
 * Created by Vaishu on 10-07-2018.
 */
@Entity

public class Favoritemovie {
    @PrimaryKey(autoGenerate = true)
    int movieid;

    String movie_title;
    String movie_description;
    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    String movie_poster;
    double movie_rating;


    public String getMovie_description() {
        return movie_description;
    }

    public void setMovie_description(String movie_description) {
        this.movie_description = movie_description;
    }

    public String getMovie_poster() {
        return movie_poster;
    }

    public void setMovie_poster(String movie_poster) {
        this.movie_poster = movie_poster;
    }

    public double getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(double movie_rating) {
        this.movie_rating = movie_rating;
    }
}
