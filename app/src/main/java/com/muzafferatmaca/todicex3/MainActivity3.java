package com.muzafferatmaca.todicex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView oncePlayerResultTextView,secondPlayerResultTextView;
    Button playButton,exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        define();
        actionButton();
    }

    public void define(){

        oncePlayerResultTextView = findViewById(R.id.oncePlayerResultTextView);
        secondPlayerResultTextView = findViewById(R.id.secondPlayerResultTextVeiew);
        playButton = findViewById(R.id.playButton);
        exitButton = findViewById(R.id.exitButton);

    }

    public void actionButton(){

        int oncePlayer = getIntent().getIntExtra("onceplayer",0);
        int secondPlayer = getIntent().getIntExtra("secondplayer",0);

        if (oncePlayer<secondPlayer){
            oncePlayerResultTextView.setText("Lose : "+oncePlayer);
        }else if (oncePlayer>secondPlayer){
            oncePlayerResultTextView.setText("Win : "+oncePlayer);
        }else if (oncePlayer==secondPlayer){
            oncePlayerResultTextView.setText("Draw : "+oncePlayer);
        }

        if (secondPlayer<oncePlayer){
            secondPlayerResultTextView.setText("Lose : "+secondPlayer);
        }else if (secondPlayer>oncePlayer){
            secondPlayerResultTextView.setText("Win : "+secondPlayer);
        }else if (secondPlayer==oncePlayer){
            secondPlayerResultTextView.setText("Draw : "+secondPlayer);
        }

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
                finish();

            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });


    }

}