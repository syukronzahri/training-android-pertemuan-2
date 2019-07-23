package com.fatmawatihospital.aplikasimultiplescreen.acitivity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fatmawatihospital.aplikasimultiplescreen.R;
import com.fatmawatihospital.aplikasimultiplescreen.adapter.CustomRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity {

    String dataNamaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    int dataGambarMakanan[] = {R.drawable.rendang, R.drawable.ayam, R.drawable.sate, R.drawable.bakso};
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(RecyclerViewActivity.this, dataNamaMakanan, dataGambarMakanan);
        recyclerView.setAdapter(adapter);

        // set jenis tampilan recycler
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
