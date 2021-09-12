package com.example.hhhty.minigame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    Button obrock,obpaper,obscissor;
    ImageView obcpu,obuser;
    String userchoice, cpuchoice, result;
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        obrock=(Button) findViewById(R.id.rock);
        obpaper=(Button) findViewById(R.id.paper);
        obscissor=(Button) findViewById(R.id.scissor);

        obcpu=(ImageView) findViewById(R.id.cpu);
        obuser=(ImageView) findViewById(R.id.user);
        r=new Random();


        obrock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userchoice="rock";
                obuser.setImageResource(R.drawable.r);
                calculate();
            }
        });

        obpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userchoice="paper";
                obuser.setImageResource(R.drawable.p);
                calculate();
            }
        });

        obscissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userchoice="scissor";
                obuser.setImageResource(R.drawable.s);
                calculate();
            }
        });

    }


    public void calculate(){
        int c=r.nextInt(3);
        if(c==0)
        {
            cpuchoice="rock";
            obcpu.setImageResource(R.drawable.r);
        }
        if(c==1)
        {
            cpuchoice="paper";
            obcpu.setImageResource(R.drawable.p);

        }
        if(c==2){
            cpuchoice="scissor";
            obcpu.setImageResource(R.drawable.s);
        }

        if(userchoice.equals("rock")&&cpuchoice.equals("scissor")){
            result="you win";
        }
        if(userchoice.equals("rock")&&cpuchoice.equals("paper")){
            result="you lose";
        }
        if(userchoice.equals("rock")&&cpuchoice.equals("rock")){
            result="draw";
        }
        if(userchoice.equals("paper")&&cpuchoice.equals("rock")){
            result="you win";
        }
        if(userchoice.equals("paper")&&cpuchoice.equals("scissor")){
            result="you lose";
        }
        if(userchoice.equals("paper")&&cpuchoice.equals("paper")){
            result="draw";
        }
        if(userchoice.equals("scissor")&&cpuchoice.equals("scissor")){
            result="draw";
        }
        if(userchoice.equals("scissor")&&cpuchoice.equals("rock")){
            result="you lose";
        }
        if(userchoice.equals("scissor")&&cpuchoice.equals("paper")){
            result="you win";
        }
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
    }



}
