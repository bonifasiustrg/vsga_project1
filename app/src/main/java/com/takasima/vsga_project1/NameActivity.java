package com.takasima.vsga_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        getSupportActionBar().setTitle("Penampil Nama");
        EditText fullName = findViewById(R.id.fullName);
        Button btnShow = findViewById(R.id.btn_show);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fullName != null){
                    String name = fullName.getText().toString();
                    Toast.makeText(NameActivity.this, "Hai, "+name, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}