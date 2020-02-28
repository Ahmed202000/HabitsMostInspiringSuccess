package com.example.habitsmostinspiringsuccess;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.id_close:

                onBackPressed();

                break;
            case R.id.id_share:

                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"تحميل تطبيق إلخ .. ");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id= ");
                sendIntent.setType("img/plain");
                startActivity(Intent.createChooser(sendIntent,"اختار التطبيق الذي مشاركة النص معه :"));

                break;
            case R.id.id_1:

                startActivity(new Intent(getApplicationContext(),SubjectList.class));

                break;
            case R.id.id_2:

                startActivity(new Intent(getApplicationContext(),AbutMuqidim.class));

                break;
            case R.id.id_3:

                startActivity(new Intent(getApplicationContext(),AboutApp.class));

                break;
            case R.id.id_4:

                final String appPackageName = getPackageName();
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageName)));
                }

                break;
        }

    }
    public void onBackPressed(){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("إغلاق التطبيق");
        alert.setMessage("هل انتا متاكد من الخروج");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alert.show();
    }
}
