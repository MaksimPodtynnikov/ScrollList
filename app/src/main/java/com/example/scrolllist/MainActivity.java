package com.example.scrolllist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] texts = { "text1", "text2", "text3", "text5", "text5","text6","text7","text8","text9","text10","text11","text12","text13","text14"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView countriesList = findViewById(R.id.textList);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, texts);
        countriesList.setAdapter(adapter);
    }
}