package com.muzafferatmaca.todicex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView oncePlayerRemaningTextView, secondPlayerRemaningTextView, oncePlayerWait, secondPlayerWait;
    Button oncePlayerButton, secondPlayerButton;
    ImageView oncePlayerImageview, secondPlayerImageView;
    int onceRemaningNumber = 3;
    int secondRemaningNumber = 3;
    int oncePlayerRandomNumber;
    int secondPlayerRandomNumber;
    int onceplayerRandomNumberTotal;
    int secondPlayerRandomNumberTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        define();
        actionPlayer();


    }

    public void define() {
        oncePlayerRemaningTextView = findViewById(R.id.oncePlayerRemaningTextView);
        secondPlayerRemaningTextView = findViewById(R.id.secondPlayerRemaningTextView);
        oncePlayerWait = findViewById(R.id.oncePlayerWait);
        secondPlayerWait = findViewById(R.id.secondPlayerWait);
        oncePlayerButton = findViewById(R.id.oncePlayerButton);
        secondPlayerButton = findViewById(R.id.secondPlayerButton);
        oncePlayerImageview = findViewById(R.id.oncePlayerImageView);
        secondPlayerImageView = findViewById(R.id.secondPlayerImageView);
    }

    public void actionPlayer() {

        oncePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                oncePlayerRandomNumber = random.nextInt(7-1)+1;

                onceplayerRandomNumberTotal += oncePlayerRandomNumber;

                actionResult();
                oncePlayerRemaningTextView.setText("Remaning : " + onceRemaningNumber);

                if (onceRemaningNumber == 0) {

                    oncePlayerButton.setVisibility(View.INVISIBLE);
                    oncePlayerWait.setVisibility(View.VISIBLE);
                }



                // System.out.println("randomtotal : "+onceplayerRandomNumberTotal);
               // System.out.println("randomnumber : "+oncePlayerRandomNumber);

                if (oncePlayerRandomNumber == 1){
                    oncePlayerImageview.setImageResource(R.drawable.siyahbir);
                }else if (oncePlayerRandomNumber == 2){
                    oncePlayerImageview.setImageResource(R.drawable.siyahiki);
                }else if (oncePlayerRandomNumber == 3){
                    oncePlayerImageview.setImageResource(R.drawable.siyahuc);
                }else if (oncePlayerRandomNumber == 4){
                    oncePlayerImageview.setImageResource(R.drawable.siyahdort);
                }else if (oncePlayerRandomNumber == 5){
                    oncePlayerImageview.setImageResource(R.drawable.siyahbes);
                }else if (oncePlayerRandomNumber == 6){
                    oncePlayerImageview.setImageResource(R.drawable.siyahalti);
                }




            }
        });

        secondPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                secondPlayerRandomNumber = random.nextInt(7-1)+1;

                secondPlayerRandomNumberTotal += secondPlayerRandomNumber;

                actionResult();
                secondPlayerRemaningTextView.setText("Remaning : " + secondRemaningNumber);

                if (secondRemaningNumber == 0) {

                    secondPlayerButton.setVisibility(View.INVISIBLE);
                    secondPlayerWait.setVisibility(View.VISIBLE);

                }



               // System.out.println("randomnumbertwo"+secondPlayerRandomNumber);

                if (secondPlayerRandomNumber == 1){
                    secondPlayerImageView.setImageResource(R.drawable.beyazbir);
                }else if (secondPlayerRandomNumber == 2){
                    secondPlayerImageView.setImageResource(R.drawable.beyaziki);
                }else if (secondPlayerRandomNumber == 3){
                    secondPlayerImageView.setImageResource(R.drawable.beyazuc);
                }else if (secondPlayerRandomNumber == 4){
                    secondPlayerImageView.setImageResource(R.drawable.beyazdort);
                }else if (secondPlayerRandomNumber == 5){
                    secondPlayerImageView.setImageResource(R.drawable.beyazbes);
                }else if (secondPlayerRandomNumber == 6){
                    secondPlayerImageView.setImageResource(R.drawable.beyazalti);
                }
            }
        });


    }


    public void actionResult() {

        if (oncePlayerButton.isPressed()) {
            onceRemaningNumber--;
        }
        if (secondPlayerButton.isPressed()) {
            secondRemaningNumber--;
        }

        if (onceRemaningNumber == 0 && secondRemaningNumber == 0) {

            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("onceplayer",onceplayerRandomNumberTotal);
            intent.putExtra("secondplayer",secondPlayerRandomNumberTotal);

            System.out.println("randomtotal : "+onceplayerRandomNumberTotal);
            System.out.println("randomtotaltwo : "+secondPlayerRandomNumberTotal);
            startActivity(intent);
            finish();

        }


    }


}