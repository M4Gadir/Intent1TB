package com.magad.intent_1_tb;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.magad.intent_1_tb.fragment.FirstFragment;
import com.magad.intent_1_tb.fragment.SecondFragment;
import com.magad.intent_1_tb.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinfrag);

        ArrayAdapter<CharSequence> adapters = ArrayAdapter.createFromResource(this, R.array.intentr, android.R.layout.simple_spinner_item);
        adapters.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setOnItemSelectedListener(this);
        sp.setAdapter(adapters);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager fm;
        fm = getSupportFragmentManager();
        switch (position) {
            case 0:
                fm.beginTransaction().add(R.id.wadah, new FirstFragment()).addToBackStack("").commit();
                break;
            case 1:
                fm.beginTransaction().replace(R.id.wadah, new SecondFragment()).hide(new FirstFragment()).addToBackStack("").commit();
                break;
            case 2:
                fm.beginTransaction().replace(R.id.wadah, new ThirdFragment()).hide(new SecondFragment()).addToBackStack("").commit();
                break;
        }
    }

        @Override
        public void onNothingSelected (AdapterView < ? > parent){

        }


}
