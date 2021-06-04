package com.example.myselfprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfprofile.entity.LocalImages;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    /*
    NIM             : 10118052
    Nama            : Bagus Syibro Malisi
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak

    2 Juni 2021 : Membuat fragment gallery_fragment untuk logic ketika bottomviewer diklik. juga membuat layout home untuk tampilan fragment
    2 Juni 2021 : Membuat fragment gallery serta logic untuk menampilkan gambarnya.
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        setupRecyclerView(view);
        return view;
    }

    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

        data.add(new LocalImages(R.drawable.galeri_11));
        data.add(new LocalImages(R.drawable.galeri_12));
        data.add(new LocalImages(R.drawable.galeri_22));
        data.add(new LocalImages(R.drawable.galeri_33));
        data.add(new LocalImages(R.drawable.galeri_88));
        data.add(new LocalImages(R.drawable.galeri_99));
//            data.add(new LocalImages(R.drawable.jawabanone));


        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        LocalImageAdapter adapter = new LocalImageAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}