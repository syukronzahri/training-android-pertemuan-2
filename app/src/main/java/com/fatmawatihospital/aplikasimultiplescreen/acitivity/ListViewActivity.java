package com.fatmawatihospital.aplikasimultiplescreen.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fatmawatihospital.aplikasimultiplescreen.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListViewActivity extends AppCompatActivity {

    String dataNamaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    @BindView(R.id.lvMakanan)
    ListView lvMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

        // untuk menghubungkan data dengan view -> adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataNamaMakanan);

        // isi adapter ke view
        lvMakanan.setAdapter(adapter);
    }
}
