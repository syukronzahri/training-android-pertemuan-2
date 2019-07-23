package com.fatmawatihospital.aplikasimultiplescreen.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.fatmawatihospital.aplikasimultiplescreen.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.spinmakanan)
    Spinner spinmakanan;
    @BindView(R.id.imgmakanan)
    ImageView imgmakanan;
    @BindView(R.id.txtnamamakanan)
    TextView txtnamamakanan;

    String dataNamaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    int dataGambarMakanan[] = {R.drawable.rendang, R.drawable.ayam, R.drawable.sate, R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dataNamaMakanan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinmakanan.setAdapter(adapter);
        // aksi ketika spinner dipilih / diganti
        spinmakanan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                txtnamamakanan.setText(dataNamaMakanan[position]);
                imgmakanan.setImageResource(dataGambarMakanan[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
