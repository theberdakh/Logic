package com.example.logic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UnicodeSet;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {


    RadioGroup radioGroup;
    ImageView imageView;
    RadioButton one, two, three, four, five, six;
    TextView textView, hint, countdown;
    Button next;

    private CountDownTimer countDownTimer;
    private long timeLeftinMillisecunds = 300000;
    boolean timerRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CountDownTimer countDownTimer = new CountDownTimer(timeLeftinMillisecunds, 10000) {
            @Override
            public void onTick(long millisUntilFinished) {
                countdown.setText(String.valueOf((int) millisUntilFinished / 100000));
            }

            @Override
            public void onFinish() {



            }
        }.start();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //int[] question = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        radioGroup = findViewById(R.id.radioGroup);
        countdown = findViewById(R.id.countdown);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textview);
        hint = findViewById(R.id.hint);
        next = findViewById(R.id.next);
        imageView.setImageResource(R.drawable.photo1);
        final int[] question = {1};
        final int[] score = {0};


        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");


        next.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {

                question[0] = question[0] + 1;
                score[0] = score[0];


                switch (question[0]) {
                    case 2:


                        if (two.isChecked() == true) {
                            score[0] = score[0] + 1;
                        }
                        radioGroup.clearCheck();
                        imageView.setImageResource(R.drawable.photo2);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");


                        break;


                    case 3:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;

                        }
                        radioGroup.clearCheck();
                        imageView.setImageResource(R.drawable.photo3);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 4:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo4);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 5:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo5);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 6:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo6);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 7:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo7);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 8:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo8);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 9:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo9);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 10:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo10);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 11:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo11);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 12:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo12);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 13:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo13);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 14:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo14);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 15:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo15);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 16:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo16);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 17:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo17);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 18:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo18);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 19:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo19);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 20:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo20);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 21:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo21);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 22:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo22);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 23:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo23);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 24:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo24);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 25:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo25);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 26:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo26);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 27:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo27);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 28:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo28);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 29:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo29);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 30:
                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        imageView.setImageResource(R.drawable.photo30);
                        textView.setText(question[0] + "/30 /n Soraw belgisi ornında qaysı belgi turıwı kerek?");
                        break;
                    case 31:
                        radioGroup.setVisibility(View.INVISIBLE);

                        if (two.isChecked()) {
                            score[0] = score[0] + 1;
                        }
                        if (score[0] >= 0 && score[0] <= 10) {
                            imageView.setImageResource(R.drawable.photo31);
                            textView.setText("Siz " + score[0] + " sorawǵa durıs juwap berdińiz. Instagramdı azaytıp, kóbirek miyińizdi shınıqtırıń))");
                        } else if (score[0] > 10 && score[0] <= 20) {
                            imageView.setImageResource(R.drawable.photo32);
                            textView.setText("Siz " + score[0] + " sorawǵa durıs juwap berdińiz. Baqsa adam bolasız))");
                        } else if (score[0] > 20 && score[0] < 30) {
                            imageView.setImageResource(R.drawable.photo33);
                            textView.setText("Siz " + score[0] + " sorawǵa durıs juwap berdińiz. Logikalıq tárepten jaqsı potencialıńız bar. Dástúrlew menen shuǵıllanıp kórmeysizbe?");
                        } else if (score[0] == 30) {
                            imageView.setImageResource(R.drawable.photo34);
                            textView.setText("Iseniw qıyın, siz barlıq sorawǵa durıs juwap berdińiz. Yaki siz qattıǵa aqıllısız, yaki testtı ǵırram jollar menen sheshkensiz.?)");


                        }
                }
            }

            ;

        });


    }


}

