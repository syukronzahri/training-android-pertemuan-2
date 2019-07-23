package com.fatmawatihospital.aplikasimultiplescreen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fatmawatihospital.aplikasimultiplescreen.R;
import com.fatmawatihospital.aplikasimultiplescreen.acitivity.CustomListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomListAdapter extends BaseAdapter {

    CustomListActivity customListActivity;
    String[] dataNamaMakanan;
    int[] dataGambarMakanan;

    public CustomListAdapter(CustomListActivity customListActivity, String[] dataNamaMakanan, int[] dataGambarMakanan) {
        this.customListActivity = customListActivity;
        this.dataGambarMakanan = dataGambarMakanan;
        this.dataNamaMakanan = dataNamaMakanan;
    }

    @Override
    public int getCount() {
        return dataGambarMakanan.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // layanan yang membuat suatu tampilan dalam bentuk pop up
        LayoutInflater inflater = (LayoutInflater) customListActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.tampilancustomlist, null);
        ViewHolder holder = new ViewHolder(convertView);
        holder.txtnamamakanan.setText(dataNamaMakanan[position]);
        holder.imgmakanan.setImageResource(dataGambarMakanan[position]);
        return convertView;
    }

    static
    class ViewHolder {
        @BindView(R.id.imgmakanan)
        ImageView imgmakanan;
        @BindView(R.id.txtnamamakanan)
        TextView txtnamamakanan;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
