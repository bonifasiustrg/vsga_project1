package com.takasima.vsga_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListOfCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_country);

        String[] listCountry = getResources().getStringArray(R.array.arrCountry);
        ListView lvCountry = findViewById(R.id.lv_country);
        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListOfCountry.this, listCountry[i]+" is Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}