package com.magad.intent_1_tb.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.magad.intent_1_tb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    TextInputEditText edt,edtdua,edttiga;

    Button btn,btndua,btntiga;


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third, container, false);
        btn = v.findViewById(R.id.button1);
        btndua = v.findViewById(R.id.button2);
        btntiga = v.findViewById(R.id.button3);
        edt = v.findViewById(R.id.edt1);
        edtdua = v.findViewById(R.id.edt2);
        edttiga = v.findViewById(R.id.edt3);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", String.valueOf(edt.getText()),null)));
            }
        });
        btndua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jadi tadi saya ngikutin langsung memakai button dan di masukin ke start activity
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + edtdua.getText())));
            }
        });
        btntiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (getView().getId()) {
                    case R.id.button3:
                        if (edttiga.getText().toString().trim().length() == 0) {
                            edttiga.setError("antum lupa mengisi url disini");
                        }else{
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www" + String.valueOf(edttiga.getText()))));
                        }
                        break;
                }
            }
        });

        return v;
    }



}
