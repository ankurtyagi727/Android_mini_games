package com.example.hhhty.minigame;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    int count = 0;
    int current = 0;
    RadioButton rb0;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
   RadioButton rb4;
    TextView l;

    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rb0=(RadioButton) findViewById(R.id.radio1);
        rb1=(RadioButton) findViewById(R.id.radio2);
        rb2=(RadioButton) findViewById(R.id.radio3);
        rb3=(RadioButton) findViewById(R.id.radio4);
        rb4=(RadioButton) findViewById(R.id.radio5);
        l=(TextView) findViewById(R.id.text1);

        set();

    }

    boolean check() {
        if (current == 0) {
            return (rb0.isChecked());
        }
        if (current == 1) {
            return (rb2.isChecked());
        }
        if (current == 2) {
            return (rb3.isChecked());
        }
        if (current == 3) {
            return (rb2.isChecked());
        }
        if (current == 4) {
            return (rb3.isChecked());
        }
        if (current == 5) {
            return (rb2.isChecked());
        }
        if (current == 6) {
            return (rb0.isChecked());
        }
        if (current == 7) {
            return (rb3.isChecked());
        }
        if (current == 8) {
            return (rb1.isChecked());
        }
        if (current == 9) {
            return (rb3.isChecked());
        }
        return false;
    }

    void set() {
        rb4.setChecked(true);
        if (current == 0) {
            l.setText("Que1: How many planets are there in solar system");
            rb0.setText("8");
            rb1.setText("9");
            rb2.setText("7");
            rb3.setText("10");
        }
        if (current == 1) {
            l.setText("Que2: Who is the current governer of RBI");
            rb0.setText("shinzo abe");
            rb1.setText("raghu ram");
            rb2.setText("urjit patel");
            rb3.setText("rajnath singh");
        }
        if (current == 2) {
            l.setText("Que3: Who has the most grandslams win");
            rb0.setText("rafael nadal");
            rb1.setText("serena williams");
            rb2.setText("novak djokovic");
            rb3.setText("roger federere");
        }
        if (current == 3) {
            l.setText("Que4: Who has fastest fifty in t20 cricket");
            rb0.setText("Ross Taylor");
            rb1.setText("Willams kane");
            rb2.setText("David miller");
            rb3.setText("Scott will");
        }
        if (current == 4) {
            l.setText("Que5: Who is the founder of Tesla lmt");
            rb0.setText("rubin taker");
            rb1.setText("benedict tesla");
            rb2.setText("Nicolas tesla");
            rb3.setText("Eon Musk");
        }
        if (current == 5) {
            l.setText("Que6: What is the name of current defense minister of india");
            rb0.setText("k venkatesh");
            rb1.setText("smriti irani");
            rb2.setText("nirmala sitharaman");
            rb3.setText("manohar paikar");
        }
        if (current == 6) {
            l.setText("Que7: Who invented telephone ");
            rb0.setText("graham bell");
            rb1.setText("oliver wright");
            rb2.setText("Jay cutler");
            rb3.setText("wilber wright");
        }
        if (current == 7) {
            l.setText("Que8: Who is the founder of Amazon");
            rb0.setText("williamson martin");
            rb1.setText("teresa take");
            rb2.setText("Jack ma");
            rb3.setText("Jeff bezos");
        }
        if (current == 8) {
            l.setText("Que9:What is name of author of Harry potter ");
            rb0.setText("Vishnu sharma");
            rb1.setText("JK rowling");
            rb2.setText("KD spoling");
            rb3.setText("Charles Dickens");
        }
        if (current == 9) {
            l.setText("Que10:Which of these is the fastest car");
            rb0.setText("Tesla ax20");
            rb1.setText("ducatti max");
            rb2.setText("Ferrari tz");
            rb3.setText("Venom");
        }
    }

    public void Submit(View view) {
        if (check())
        {
            Toast.makeText(getApplicationContext(),"Correct answer",Toast.LENGTH_SHORT).show();
            count=count+1;
        }
        else{
            Toast.makeText(getApplicationContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
        }
        if(current==9)
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Your score is" +count+"\n Return Home?? ");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }


            );

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();

        }
        current++;
        set();

    }
}