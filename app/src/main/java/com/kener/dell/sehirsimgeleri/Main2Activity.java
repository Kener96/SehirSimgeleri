package com.kener.dell.sehirsimgeleri;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView simge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        mtoolbar=(Toolbar) findViewById(R.id.mtoolbar);
        simge = (ImageView) findViewById(R.id.imageView);
         Bundle bundle=getIntent().getExtras();// bundle sayfalar arası geçişi sağlar
        if(bundle != null){
            mtoolbar.setTitle(bundle.getString("CountryName"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("İzmir")){
                simge.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this,R.drawable.izmir_simge));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("İstanbul")){
                simge.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this,R.drawable.istanbul_simge));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Aydın")){
                simge.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this,R.drawable.aydin_simge));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Denizli")){
                simge.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this,R.drawable.denizli_simge));
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("Isparta")){
                simge.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this,R.drawable.isparta_simge));
            }



        }


    }
}
