package com.fatmawatihospital.aplikasimultiplescreen.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.fatmawatihospital.aplikasimultiplescreen.R;
import com.fatmawatihospital.aplikasimultiplescreen.adapter.CustomGridAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GridViewActivity extends AppCompatActivity {

    @BindView(R.id.gridMakanan)
    GridView gridMakanan;

    String dataNamaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    int dataGambarMakanan[] = {R.drawable.rendang, R.drawable.ayam, R.drawable.sate, R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        ButterKnife.bind(this);
        CustomGridAdapter adapter = new CustomGridAdapter(GridViewActivity.this, dataNamaMakanan, dataGambarMakanan);
        gridMakanan.setAdapter(adapter);
    }
}
