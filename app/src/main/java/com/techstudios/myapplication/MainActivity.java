package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] drdir = new int[5];
        drdir[0] = R.drawable.download;
        drdir[1] = R.drawable.download_1;
        drdir[2] = R.drawable.downpas;
        drdir[3] = R.drawable.downpas20;
        drdir[4] = R.drawable.shaik;
        String[] idkwhattodo = new String[5];
        idkwhattodo[0]= "poland";
        idkwhattodo[1] = "united kingdom";
        idkwhattodo[2] = "bangladesh";
        idkwhattodo[3] = "dominican republic";
        idkwhattodo[4] = "czech republic";
        Random generator= new Random();
        final int[] chosen = {1};

        txt = (EditText) findViewById(R.id.editTextText);
        btn = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(drdir[chosen[0]]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().toString().toLowerCase().equals(idkwhattodo[chosen[0]])) {
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    chosen[0] = generator.nextInt(4);
                    img.setImageResource(drdir[chosen[0]]);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Country!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
/*
Doubts:
Difficult to import drawables.
 */