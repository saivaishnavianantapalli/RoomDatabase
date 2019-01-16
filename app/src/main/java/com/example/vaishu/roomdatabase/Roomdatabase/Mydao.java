package com.example.vaishu.roomdatabase.Roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Vaishu on 10-07-2018.
 */
@Dao

public interface Mydao {
    @Query("select * from Favoritemovie")
    List<Favoritemovie> getAllData();
    @Insert
    void insetData(Favoritemovie fm);
    @Update
    void updateData(Favoritemovie fm);
    @Delete
    void deleteData(Favoritemovie fm);
}
