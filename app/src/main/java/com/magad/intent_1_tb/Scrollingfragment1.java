package com.magad.intent_1_tb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Scrollingfragment1 extends AppCompatActivity {

    ImageView iv;
    TextView tv,tve,tvu,tvp;

    String[] emailComputer = {"IBM@gmail.com","LENOVO@gmail.com","ACER@gmail.com","ASUS@gmail.com"};
    int[] phoneComputer = {2091291287,2012917287,2016291287,2014291287};
    String[] UrlrandComputer = {"https://www.ibm.com/id-en/?ar=1","https://www.lenovo.com/id/in","https://store.acer.com/en-my","https://www.asus.com/id/"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollingfragment1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        iv = findViewById(R.id.gmbrdet);
        tv = findViewById(R.id.tvjudul);
        tve = findViewById(R.id.tvemail);
        tvu = findViewById(R.id.tvurl);
        tvp = findViewById(R.id.tvphne);
        setSupportActionBar(toolbar);

        final int position = getIntent().getIntExtra("position", 1);
        setTitle(getIntent().getStringExtra("a"));
        iv.setImageResource(getIntent().getIntExtra("b", 0));
        tv.setText(getIntent().getStringExtra("a"));
        tve.setText(emailComputer[position]);
        tvu.setText(UrlrandComputer[position]);
        tvp.setText(String.valueOf(phoneComputer[position]));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
