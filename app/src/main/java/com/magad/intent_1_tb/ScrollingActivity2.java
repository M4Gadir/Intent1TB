package com.magad.intent_1_tb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrollingActivity2 extends AppCompatActivity {

    ImageView iv;
    TextView tv,te,tu,tp;

    String[] emailCar = {"https://www.bmw.com/en/index.html","https://www.vw.com/","https://www.chevrolet.com/","https://www.toyota.com/"};
    int[] phoneCar = {238312423,25467524,324545654,124567754};
    String[] UrlrCar = {"bmw@gmail.com","vw@gmail.com","corvette@gmail.com","toyota@gmail.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        iv = findViewById(R.id.gmbrdet2);
        tv = findViewById(R.id.tvjudul2);
        te = findViewById(R.id.tvemail2);
        tu = findViewById(R.id.tvurl2);
        tp = findViewById(R.id.tvphne2);
        setSupportActionBar(toolbar);

        final int position = getIntent().getIntExtra("position", 1);
        setTitle(getIntent().getStringExtra("title"));
        iv.setImageResource(getIntent().getIntExtra("image", 0));
        tv.setText(getIntent().getStringExtra("title"));
        te.setText(emailCar[position]);
        tu.setText(UrlrCar[position]);
        tp.setText(String.valueOf(phoneCar[position]));

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
