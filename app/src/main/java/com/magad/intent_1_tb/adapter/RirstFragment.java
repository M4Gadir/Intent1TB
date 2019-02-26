package com.magad.intent_1_tb.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.intent_1_tb.R;
import com.magad.intent_1_tb.Scrollingfragment1;
import com.magad.intent_1_tb.adapter.Isifsatu;

public class RirstFragment extends RecyclerView.Adapter<Isifsatu> {

    Context context;

    String[] brandComputer = {"IBM","LENOVO","ACER","ASUS"};
    int[] imagesComputer = {R.drawable.ibm,R.drawable.lenovo,R.drawable.acer,R.drawable.asus};


    public RirstFragment(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Isifsatu onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.isinya, null);

        return new Isifsatu(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull Isifsatu isifsatu, final int i) {
    isifsatu.tv.setText(brandComputer[i]);
    isifsatu.iv.setImageResource(imagesComputer[i]);
    isifsatu.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent o = new Intent(context, Scrollingfragment1.class);
            o.putExtra("a", brandComputer[i]);
            o.putExtra("b", imagesComputer[i]);
            o.putExtra("position", i);
            context.startActivity(o);
        }
    });
    }

    @Override
    public int getItemCount() {
        return brandComputer.length;
    }
}
