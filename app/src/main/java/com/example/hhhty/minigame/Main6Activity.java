package com.example.hhhty.minigame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    String[] newarray = {"select-age","0-10", "10-20", "20-80"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final Spinner spi = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter dataadaptor = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, newarray);
        dataadaptor.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spi.setAdapter(dataadaptor);

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spi.getSelectedItemId() == 0) {

                }
                if (spi.getSelectedItemId() == 1) {
                    Toast.makeText(getApplicationContext(), "age submitted 0-10", Toast.LENGTH_SHORT).show();

                }


                if (spi.getSelectedItemId() == 2) {
                    Toast.makeText(getApplicationContext(), "age submitted 10-20", Toast.LENGTH_SHORT).show();
                }

                if (spi.getSelectedItemId() == 3) {
                    Toast.makeText(getApplicationContext(), "age submitted above 20", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void play(View view) {
        Intent in5=new Intent(this,Main3Activity.class);
        startActivity(in5);
    }
}