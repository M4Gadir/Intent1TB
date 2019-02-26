package com.magad.intent_1_tb.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.intent_1_tb.R;
import com.magad.intent_1_tb.adapter.RirstFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    RecyclerView rv;
    RirstFragment adupter;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        rv = v.findViewById(R.id.rv1);
        adupter = new RirstFragment(getActivity());
        rv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rv.setAdapter(adupter);

        return v;
    }

}
