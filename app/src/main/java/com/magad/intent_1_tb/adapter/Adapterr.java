package com.magad.intent_1_tb.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.intent_1_tb.R;
import com.magad.intent_1_tb.ScrollingActivity2;

public class Adapterr extends RecyclerView.Adapter<Adapterf> {

    Context context;


    String[] nameCars = {"BMW","VolksWagen","Corvette","Toyota"};
    int[] logoCars = {R.drawable.bmw,R.drawable.volkswagen,R.drawable.corvette,R.drawable.toyota};

    public Adapterr(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Adapterf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.isinya, null);
        return new Adapterf(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterf adapterf, final int i) {
    adapterf.iv.setImageResource(logoCars[i]);
    adapterf.tv.setText(nameCars[i]);
    adapterf.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent u = new Intent(context, ScrollingActivity2.class);
            u.putExtra("image", logoCars[i]);
            u.putExtra("title", nameCars[i]);
            u.putExtra("position", i);
            context.startActivity(u);
        }
    });
    }

    @Override
    public int getItemCount() {
        return nameCars.length;
    }
}
