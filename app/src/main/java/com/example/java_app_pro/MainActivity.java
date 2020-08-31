package com.example.java_app_pro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.content.Context.MODE_APPEND;

public class MainActivity extends AppCompatActivity {


//    private String[] names = new String[]{"B神", "基神", "曹神"};
//    private String[] says = new String[]{"无形被黑，最为致命", "大神好厉害~", "我将带头日狗~"};
//    private int[] imgIds = new int[]{R.mipmap.head_icon1, R.mipmap.head_icon2, R.mipmap.head_icon3};



//    String TAG = "myStart";

    BindingAdapter binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiajianfa);

        ViewModelProvider.

//        MyData myData = new MyData(getApplicationContext());
//
//        myData.save();
//
//        NavController controller = Navigation.findNavController(this,R.id.fragment2);
//
//        NavigationUI.setupActionBarWithNavController(this,controller);
//
//        @SuppressLint("WrongConstant")
//        SharedPreferences sh = getPreferences(MODE_APPEND);
//        SharedPreferences sh1;
//        sh1 = getSharedPreferences("my_data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor =  sh.edit();
//        SharedPreferences.Editor editor1 =  sh1.edit();
//        editor1.putInt("number",300);
//        editor1.apply();
//        editor.putInt("number",300);
//        editor.apply();        MyData myData = new MyData(getApplicationContext());
//
//        myData.save();
//
//        NavController controller = Navigation.findNavController(this,R.id.fragment2);
//
//        NavigationUI.setupActionBarWithNavController(this,controller);
//
//        @SuppressLint("WrongConstant")
//        SharedPreferences sh = getPreferences(MODE_APPEND);
//        SharedPreferences sh1;
//        sh1 = getSharedPreferences("my_data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor =  sh.edit();
//        SharedPreferences.Editor editor1 =  sh1.edit();
//        editor1.putInt("number",300);
//        editor1.apply();
//        editor.putInt("number",300);
//        editor.apply();



//        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
//        for (int i = 0; i < names.length; i++) {
//            Map<String, Object> showitem = new HashMap<String, Object>();
//            showitem.put("touxiang", imgIds[i]);
//            showitem.put("name", names[i]);
//            showitem.put("says", says[i]);
//            listitem.add(showitem);
//        }
//
//        //创建一个simpleAdapter
//        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.list_item,
//                new String[]{"touxiang", "name", "says"}, new int[]{R.id.imgtou, R.id.name, R.id.says});
//        ListView listView = (ListView) findViewById(R.id.list_test);
//        listView.setAdapter(myAdapter);
//        Log.d(TAG, "onCreate: ");
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController controller = Navigation.findNavController(this,R.id.fragment2);
//        return controller.navigateUp();
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
}