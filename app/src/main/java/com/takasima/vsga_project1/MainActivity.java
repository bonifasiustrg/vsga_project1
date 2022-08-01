package com.takasima.vsga_project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Profil");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater pengisiMenu = getMenuInflater();
        pengisiMenu.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intentPindah;
        if (item.getItemId() == R.id.m_name) {
                intentPindah = new Intent(this, NameActivity.class);
        }else if (item.getItemId() == R.id.m_calculator) {
                intentPindah = new Intent(this, CalculatorActivity.class);
        }else {
                intentPindah = new Intent(this, ListOfCountry.class);
        }

        startActivity(intentPindah);
        return true;
    }
}