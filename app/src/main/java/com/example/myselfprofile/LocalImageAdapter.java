package com.example.myselfprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfprofile.entity.LocalImages;

import java.util.ArrayList;
import java.util.List;

public class LocalImageAdapter extends RecyclerView.Adapter<LocalImageAdapter.Holder> {


    /*
    NIM             : 10118052
    Nama            : Bagus Syibro Malisi
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak

    3 Juni 2021 : Membuat adapter untuk fragment gallery, example from ufebri
     */

    private List<LocalImages> images;
    private Context context;

    LocalImageAdapter(ArrayList<LocalImages> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        context = parent.getContext();
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        LocalImages allData = images.get(position);
        holder.bind(allData);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        Holder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(LocalImages allData) {
            ImageView ivLocal = itemView.findViewById(R.id.iv_animal);
            ivLocal.setImageResource(allData.imageId);
        }
    }
}
