package com.example.habitsmostinspiringsuccess;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class AboutApp extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);

    }

    public void onClick1(View v){
        switch (v.getId()){

            case R.id.but1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+getString(R.string.developer_email)+"?subjrct="+getString(R.string.app_name))));
                break;
//            case R.id.but2:
//                String developerName = getString(R.string.developer_name);
//                try {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q="+developerName)));
//                } catch (android.content.ActivityNotFoundException anfe) {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q="+developerName)));
//                }
//                break;
            case R.id.but3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.website))));
                break;
        }
    }
}
