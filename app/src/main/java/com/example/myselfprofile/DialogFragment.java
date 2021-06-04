package com.example.myselfprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

        /*
        NIM             : 10118052
        Nama            : Bagus Syibro Malisi
        Kelas           : IF2
        Matakuliah      : Aplikasi Komputasi Bergerak

        2 Juni 2021 : Membuat fragment dialog fragment
         */
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater,container,savedInstanceState);
            View view = inflater.inflate(R.layout.dialog_version, container, false);
            return view;
        }



}

