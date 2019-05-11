package com.kener.dell.sehirsimgeleri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Toolbar toolbar;
   ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    toolbar=(Toolbar) findViewById(R.id.toolbar);
    toolbar.setTitle(getResources().getString(R.string.app_name));
    setSupportActionBar(toolbar);

    listView=(ListView) findViewById(R.id.listView);


    final ArrayAdapter<String> mAdapter =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,
            getResources().getStringArray(R.array.countries));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("CountryName", mAdapter.getItem(i));
                startActivity(intent);

            }
        });

        listView.setAdapter(mAdapter);
    }
}
