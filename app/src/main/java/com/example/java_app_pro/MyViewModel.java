package com.example.java_app_pro;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends AndroidViewModel {
    SavedStateHandle handle;
    String name = getApplication().getResources().getString(R.string.MY_DATA);

    public MyViewModel(@NonNull Application application, SavedStateHandle handle) {
        super(application);
        this.handle = handle;
        if(!handle.contains("nameLis")){
            load();
        }
    }

    public LiveData<Integer> getShuzi(){
        return  handle.getLiveData("nameLis");
    }

    public void load(){
        SharedPreferences sh = getApplication().getSharedPreferences(name, Context.MODE_PRIVATE);
        int x = sh.getInt("nameLis",0);
        this.handle.set("nameLis",x);
    }

    /**
     *
     */
    public void save (){
        SharedPreferences sh = getApplication().getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sh.edit();
        editor.putInt("nameLis",getShuzi().getValue());
        editor.apply();

    }
    public void add (int x ){
        handle.set("nameLis",getShuzi().getValue()+ x);

    }
}
