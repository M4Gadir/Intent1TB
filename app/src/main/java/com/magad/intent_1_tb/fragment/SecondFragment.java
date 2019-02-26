package com.magad.intent_1_tb.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.intent_1_tb.R;
import com.magad.intent_1_tb.adapter.Adapterr;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    RecyclerView rv;
    Adapterr adapter;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        rv = v.findViewById(R.id.rv2);
        rv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        adapter = new Adapterr(getActivity());
        rv.setAdapter(adapter);
        return v;
    }

}
