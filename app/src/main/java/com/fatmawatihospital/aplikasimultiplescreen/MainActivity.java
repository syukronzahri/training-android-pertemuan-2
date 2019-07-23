package com.fatmawatihospital.aplikasimultiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.fatmawatihospital.aplikasimultiplescreen.acitivity.CustomListActivity;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.GridViewActivity;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.ListViewActivity;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.RecyclerViewActivity;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.SpinnerActivity;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.WebActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    // todo 1 deklarasi variable scr global
    // cara konvensional
    Button
            btnListView,
            btnRecyclerView,
            btnCustomList;

    // cara modern
    @BindView(R.id.btnSpinner)
    Button btnSpinner;
    @BindView(R.id.btnGridView)
    Button btnGridView;
    @BindView(R.id.btnWeb)
    Button btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //todo 2 inisialisasi binding id

        btnRecyclerView = findViewById(R.id.btnRecyclerView);
        btnListView = findViewById(R.id.btnListView);
        btnCustomList = findViewById(R.id.btnCustomList);

        // todo 3 aksi ketika masing-masing button diklik

        // cara tradisional
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });

        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });

        btnCustomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, CustomListActivity.class));
            }
        });
    }

    @OnClick({R.id.btnSpinner, R.id.btnGridView, R.id.btnWeb})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnSpinner:
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                break;
            case R.id.btnGridView:
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, GridViewActivity.class));
                break;
            case R.id.btnWeb:
                // perpindahan halaman
                startActivity(new Intent(MainActivity.this, WebActivity.class));
                break;
        }
    }
}
