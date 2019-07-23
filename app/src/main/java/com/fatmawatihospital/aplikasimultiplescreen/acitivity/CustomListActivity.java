package com.fatmawatihospital.aplikasimultiplescreen.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.fatmawatihospital.aplikasimultiplescreen.R;
import com.fatmawatihospital.aplikasimultiplescreen.adapter.CustomListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomListActivity extends AppCompatActivity {

    @BindView(R.id.lvMakanan)
    ListView lvMakanan;

    String dataNamaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    int dataGambarMakanan[] = {R.drawable.rendang, R.drawable.ayam, R.drawable.sate, R.drawable.bakso};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        ButterKnife.bind(this);
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataNamaMakanan);
//        lvMakanan.setAdapter(adapter);

        CustomListAdapter adapter = new CustomListAdapter(CustomListActivity.this, dataNamaMakanan, dataGambarMakanan);
        lvMakanan.setAdapter(adapter
        );
    }
}
