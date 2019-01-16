package com.example.vaishu.roomdatabase.Roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Vaishu on 11-07-2018.
 */
@Database(entities = Favoritemovie.class,version = 1,exportSchema = false)
public abstract class Mydatabase extends RoomDatabase {
    public abstract Mydao mydao();
}
