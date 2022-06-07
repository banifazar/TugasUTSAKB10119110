package com.example.tugasutsakb10119110.ViewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tugasutsakb10119110.MainActivity;
import com.example.tugasutsakb10119110.R;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(ViewPagerActivity.this, MainActivity.class);
        startActivity(intent);
    }

}