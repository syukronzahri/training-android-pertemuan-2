package com.fatmawatihospital.aplikasimultiplescreen.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fatmawatihospital.aplikasimultiplescreen.R;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.RecyclerViewActivity;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder> {

    RecyclerViewActivity recyclerViewActivity;
    String[] dataNamaMakanan;
    int[] dataGambarMakanan;

    public CustomRecyclerAdapter(RecyclerViewActivity recyclerViewActivity, String[] dataNamaMakanan, int[] dataGambarMakanan) {
        this.recyclerViewActivity = recyclerViewActivity;
        this.dataNamaMakanan = dataNamaMakanan;
        this.dataGambarMakanan = dataGambarMakanan;
    }

    // todo 2.1 set view
    @NonNull
    @Override
    public CustomRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = (LayoutInflater) recyclerViewActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.tampilanrecyclerview, null);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    // todo 2.3 set data ke view
    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.txtNamaMakanan.setText(dataNamaMakanan[i]);
        myViewHolder.imgMakanan.setImageResource(dataGambarMakanan[i]);
    }

    // set jumlah data yang akan ditampilkan
    @Override
    public int getItemCount() {
        return dataGambarMakanan.length;
    }

    // todo 2.2 binding atau inisialisasi
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMakanan;
        TextView txtNamaMakanan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMakanan = itemView.findViewById(R.id.imgmakanan);
            txtNamaMakanan = itemView.findViewById(R.id.txtnamamakanan);
        }
    }
}
