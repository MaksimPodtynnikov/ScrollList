package com.example.scrolllist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] texts = { "text01", "text02", "text03", "text04", "text05","text06","text07","text08","text09","text010","text011","text012","text013","text014"};

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