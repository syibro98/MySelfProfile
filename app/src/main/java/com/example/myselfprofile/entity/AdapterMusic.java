package com.example.myselfprofile.entity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfprofile.OurData;
import com.example.myselfprofile.R;

public class AdapterMusic extends RecyclerView.Adapter {
    /*
    NIM             : 10118052
    Nama            : Bagus Syibro Malisi
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak

    Membuat adapter untuk digunakan pada fragment music
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.title_music.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.item_music_text);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(OurData.title_music[position]);
        }



        @Override
        public void onClick(View v) {

        }
    }

}
