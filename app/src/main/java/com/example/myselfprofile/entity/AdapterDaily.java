package com.example.myselfprofile.entity;

//import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfprofile.ModelDaily;
import com.example.myselfprofile.R;

import java.util.ArrayList;


public class AdapterDaily extends RecyclerView.Adapter<AdapterDaily.DailyViewHolder> {
/*
    NIM             : 10118052
    Nama            : Bagus Syibro Malisi
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak

    Membuat adapter untuk digunakan pada fragment daily
     */

    private ArrayList<ModelDaily> dataList;

    public AdapterDaily(ArrayList<ModelDaily> dataList) {
        this.dataList = dataList;
    }

    @Override
    public DailyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_daily, parent, false);
        return new DailyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(DailyViewHolder holder, int position) {
        holder.txtHari.setText(dataList.get(position).getHari());
        holder.txtKegiatan.setText(dataList.get(position).getKegiatan());
        holder.txtPelajaran.setText(dataList.get(position).getPelajaran());
        holder.txtGame.setText(dataList.get(position).getGame());
        holder.txtNote.setText(dataList.get(position).getNote());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtHari, txtKegiatan, txtPelajaran, txtGame, txtNote;

        public DailyViewHolder(View itemView) {
            super(itemView);
            txtHari = (TextView) itemView.findViewById(R.id.item_daily_activity);
//            txtKegiatan = (TextView) itemView.findViewById(R.id.kegiatan);
//            txtPelajaran = (TextView) itemView.findViewById(R.id.pelajaran);
//            txtGame = (TextView) itemView.findViewById(R.id.game);
//            txtNote = (TextView) itemView.findViewById(R.id.note);
        }
    }
}