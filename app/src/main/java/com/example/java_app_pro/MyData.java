package com.example.java_app_pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.NfcAdapter;

public class MyData {

    public int number;

    private Context context;

    public MyData(Context context){
            this.context = context;

    }

    public  void save(){
        String name = context.getResources().getString(R.string.MY_DATA);
        SharedPreferences sh = this.context.getSharedPreferences(name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 =  sh.edit();
        editor1.putInt("nameLis",300);
        editor1.apply();
    }
    public  int load(){
        String name = context.getResources().getString(R.string.MY_DATA);
        SharedPreferences sh = this.context.getSharedPreferences(name,Context.MODE_PRIVATE);
        int a = sh.getInt("nameLis",0);
        return  a;
    }
}
