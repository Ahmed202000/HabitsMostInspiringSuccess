package com.example.habitsmostinspiringsuccess;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SnigleItem extends AppCompatActivity {

//    SeekBar seek;
//    int MAX = 60; // Highest value for img size
//    int MIN = 20; // Lowest value for img size
//    int PLUS =1; //Provide the img size for each step

    ImageView img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snigle_item);


        TextView title =findViewById(R.id.title_id);
        img_1 =findViewById(R.id.img_1);
        img_2 =findViewById(R.id.img_1);
        img_3 =findViewById(R.id.img_3);
        img_4 =findViewById(R.id.img_4);
        img_5 =findViewById(R.id.img_5);
        img_6 =findViewById(R.id.img_6);
        img_7 =findViewById(R.id.img_7);
        img_8 =findViewById(R.id.img_8);


        title.setText(getIntent().getExtras().getString("subjectt"));
        img_1.setImageResource(getIntent().getExtras().getInt("image"));

//        seek = (SeekBar) findViewById(R.id.seeeekbar);
//        seek.setMax((MAX-MIN)/PLUS);
//        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                img.setImageResource(MIN + (progress * PLUS));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });


    }
}
