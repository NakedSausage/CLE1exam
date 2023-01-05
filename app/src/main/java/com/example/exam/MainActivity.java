package com.example.Exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exam.Earrings;
import com.example.exam.Necklace;
import com.example.exam.R;
import com.example.exam.Rings;
import com.example.exam.bracelet;
import com.example.exam.reference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView card1,card2,card3,card4;
    public Button copy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        copy = (Button) findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openpost();
            }
        });
        card1 = (CardView) findViewById(R.id.BraceletCard);
        card2 = (CardView) findViewById(R.id.EarringsCard);
        card3 = (CardView) findViewById(R.id.RingsCard);
        card4 = (CardView) findViewById(R.id.NecklaceCard);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }
    public void openpost(){
        Intent intent = new Intent(this, reference.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.BraceletCard:
                i = new Intent(this, bracelet.class);
                startActivity(i);
                break;
            case R.id.EarringsCard:
                i = new Intent(this, Earrings.class);
                startActivity(i);
                break;
            case R.id.RingsCard:
                i = new Intent(this, Rings.class);
                startActivity(i);
                break;
            case R.id.NecklaceCard:
                i = new Intent(this, Necklace.class);
                startActivity(i);
                break;


        }

    }
}