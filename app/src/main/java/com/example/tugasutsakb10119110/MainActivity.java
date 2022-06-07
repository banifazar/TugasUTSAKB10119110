package com.example.tugasutsakb10119110;
//        NIM: 10119110
//        NAMA: BANI FAZA RASYADAN
//        KELAS: IF-3
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasutsakb10119110.BottomNav.CatatanFragment;
import com.example.tugasutsakb10119110.BottomNav.InfoFragment;
import com.example.tugasutsakb10119110.BottomNav.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.botnav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
        new ProfileFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.profile:
                        selectedFragment = new ProfileFragment();
                        break;
                    case R.id.catatan:
                        selectedFragment = new CatatanFragment();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        selectedFragment).commit();

                return true;
            }
        });
    }



}

