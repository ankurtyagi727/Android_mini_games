
package com.example.hhhty.minigame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class Main4Activity extends AppCompatActivity {


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);


        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("*");
        b6.setText("5");
        b7.setText("7");
        b8.setText("8");
        b9.setText("6");


    }


    public void one(View view) {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b2.getText().toString().equals("*")) {
                    b2.setText(b1.getText());
                    b1.setText("*");
                }
                if (b4.getText().toString().equals("*")) {
                    b4.setText(b1.getText());
                    b1.setText("*");
                }
                check();
            }
        });

    }


    public void two(View view) {

        b2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b1.getText().toString().equals("*")) {
                    b1.setText(b2.getText());
                    b2.setText("*");
                }
                if (b3.getText().toString().equals("*")) {
                    b3.setText(b2.getText());
                    b2.setText("*");
                }
                if (b5.getText().toString().equals("*")) {
                    b5.setText(b2.getText()
                    );
                    b2.setText("*");
                }
                check();
            }
        });

    }

    public void three(View view) {

        b3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b6.getText().toString().equals("*")) {
                    b6.setText(b3.getText());
                    b3.setText("*");
                }
                if (b2.getText().toString().equals("*")) {
                    b2.setText(b3.getText());
                    b3.setText("*");
                }
                check();
            }
        });

    }

    public void four(View view) {

        b4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b1.getText().toString().equals("*")) {
                    b1.setText(b4.getText());
                    b4.setText("*");
                }
                if (b5.getText().toString().equals("*")) {
                    b5.setText(b4.getText());
                    b4.setText("*");
                }
                if (b7.getText().toString().equals("*")) {
                    b7.setText(b4.getText());
                    b4.setText("*");
                }
                check();
            }
        });
    }

    public void five(View view) {

        b5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b2.getText().toString().equals("*")) {
                    b2.setText(b5.getText());
                    b5.setText("*");
                }
                if (b4.getText().toString().equals("*")) {
                    b4.setText(b5.getText());
                    b5.setText("*");
                }
                if (b6.getText().toString().equals("*")) {
                    b6.setText(b5.getText());
                    b5.setText("*");
                }
                if (b8.getText().toString().equals("*")) {
                    b8.setText(b5.getText());
                    b5.setText("*");
                }
                check();
            }

        });
    }

    public void six(View view) {

        b6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b3.getText().toString().equals("*")) {
                    b3.setText(b6.getText());
                    b6.setText("*");
                }
                if (b5.getText().toString().equals("*")) {
                    b5.setText(b6.getText());
                    b6.setText("*");
                }
                if (b9.getText().toString().equals("*")) {
                    b9.setText(b6.getText());
                    b6.setText("*");
                }
                check();
            }
        });
    }

    public void seven(View view) {

        b7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b4.getText().toString().equals("*")) {
                    b4.setText(b7.getText());
                    b7.setText("*");
                }
                if (b8.getText().toString().equals("*")) {
                    b8.setText(b7.getText());
                    b7.setText("*");
                }
                check();

            }
        });
    }

    public void eight(View view) {
        b8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b7.getText().toString().equals("*")) {
                    b7.setText(b8.getText());
                    b8.setText("*");
                }
                if (b9.getText().toString().equals("*")) {
                    b9.setText(b8.getText());
                    b8.setText("*");
                }
                if (b5.getText().toString().equals("*")) {
                    b5.setText(b8.getText());
                    b8.setText("*");
                }
                check();
            }
        });
    }

    public void nine(View view) {

        b9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (b8.getText().toString().equals("*")) {
                    b8.setText(b9.getText());
                    b9.setText("*");
                }
                if (b6.getText().toString().equals("*")) {
                    b6.setText(b9.getText());
                    b9.setText("*");
                }
                check();

            }
        });
    }

    public void check() {

        if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText()
                .equals("3") && b4.getText().equals("4") && b5.getText().equals("5")
                && b6.getText().equals("6") && b7.getText().equals("7") && b8.getText()
                .equals("8") && b9.getText().equals("*")) {

            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("CONGRATULATIONS YOU WON ");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Home", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                                Intent inn=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(inn);
                        }
                    }


            );

            builder1.setNegativeButton(
                    "Exit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                           finish();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();

        }

    }
}