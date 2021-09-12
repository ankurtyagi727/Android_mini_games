package com.example.hhhty.minigame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){

            case R.id.ak2:
                System.exit(0);
                break;
        }

        return onOptionsItemSelected(item);
    }

    public void first(View view) {
        Intent in1=new Intent(this,Main2Activity.class);
        startActivity(in1);
    }

    public void third(View view) {
        Intent in3=new Intent(this,Main3Activity.class);
        startActivity(in3);
    }

    public void second(View view) {
        Intent in2=new Intent(this,Main4Activity.class);
        startActivity(in2);
    }
}
