package com.example.myselfprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

     /*
    NIM             : 10118052
    Nama            : Bagus Syibro Malisi
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak

    3 Juni 2021 : Membuat aktivity home sebagai tampilan utama dari aplikasi
    3 Juni 2021 : Mengganti warna primer, mengganti background semua fragment
    3 Juni 2021 : Merombak ulang activity home, di refactor untuk mengubah nama agar mempermudah dan merombak struktru fragment serta buttom navigation
    4 Juni 2021 : Menyusun ulang project dan merombak ulang file didalamnya, menghapus drawable file dan layout yang tidak dibutuhkan serta merapikan codingan

     */

    private BottomNavigationView navViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navViewHome = findViewById(R.id.nav_view);
        setupBottomNavigation(savedInstanceState);
    }

    public void buka_map(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/TK.+Hj.Hanifa/@-6.3492739,108.3561334,21z/data=!4m5!3m4!1s0x2e6ebf17c0481927:0x9b376f3467781324!8m2!3d-6.3491171!4d108.3562348?hl=id"));
        startActivity(map);
    }

    public void buka_ig(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bagus_syibro/"));
        startActivity(instagram);
    }
    public void buka_blog(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bagus.blogspot.com/"));
        startActivity(blog);
    }
    public void buka_email(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:syibrobagus@gmail.com"));
        startActivity(blog);
    }
    public void buka_dialog(View view) {
        com.example.myselfprofile.DialogFragment dialogFragment = new com.example.myselfprofile.DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }

    private void setupBottomNavigation(Bundle savedInstanceState) {
        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
                = item -> {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.account_menu:
                    fragment = new com.example.myselfprofile.AccountFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.gallery_menu:
                    fragment = new GalleryFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.daily_menu:
                    fragment = new com.example.myselfprofile.DailyFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.music_menu:
                    fragment = new MusicFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
            }
            return false;
        };
        navViewHome.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            navViewHome.setSelectedItemId(R.id.home_menu);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}