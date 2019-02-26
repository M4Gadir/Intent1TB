package com.magad.intent_1_tb.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.intent_1_tb.R;

class Adapterf extends RecyclerView.ViewHolder {

    TextView tv;
    ImageView iv;
    public Adapterf(@NonNull View itemView, Context context) {
        super(itemView);
        tv = itemView.findViewById(R.id.tvd);
        iv = itemView.findViewById(R.id.ivd);
    }
}
