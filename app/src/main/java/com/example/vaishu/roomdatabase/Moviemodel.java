package com.example.vaishu.roomdatabase;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.vaishu.roomdatabase.Roomdatabase.Favoritemovie;

import java.util.List;

/**
 * Created by Vaishu on 12-07-2018.
 */

public class Moviemodel extends ViewModel {
   MutableLiveData<List<Favoritemovie>> list1;
   public Moviemodel()
   {
       list1=new MutableLiveData<>();
   }
   // List<Favoritemovie> list;]

    public MutableLiveData<List<Favoritemovie>> getList()
    {
       // list1= new MutableLiveData<>();

        if(list1==null)
        {
            list1=new MutableLiveData<>();


        }
        return list1;
           }
    /*public List<Favoritemovie> getList() {
        return list;
    }*/

   public void setList(List<Favoritemovie> list) {

        list1.setValue(list);
    }


    }
