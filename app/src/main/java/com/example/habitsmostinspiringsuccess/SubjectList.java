package com.example.habitsmostinspiringsuccess;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SubjectList extends AppCompatActivity {

    ListView listView ;
    ArrayList<Data> arraylist = new ArrayList<>();
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);


        listView=(ListView)findViewById(R.id.list_viewid) ;

        String[] AndRody_Subject = {
                getString(R.string.TEXT1),
                getString(R.string.TEXT2),
                getString(R.string.TEXT3),
                getString(R.string.TEXT4),
                getString(R.string.TEXT6),
                getString(R.string.TEXT5),
                getString(R.string.TEXT7),
                getString(R.string.TEXT8),
                getString(R.string.TEXT9),
                getString(R.string.TEXT10),
                getString(R.string.TEXT11),
                getString(R.string.TEXT12),
                getString(R.string.TEXT13),
                getString(R.string.TEXT14),
                getString(R.string.TEXT15),
                getString(R.string.TEXT16),
                getString(R.string.TEXT17),
                getString(R.string.TEXT18),
                getString(R.string.TEXT19),
                getString(R.string.TEXT20),
                getString(R.string.TEXT21),
                getString(R.string.TEXT22),
                getString(R.string.TEXT23),
                getString(R.string.TEXT24),
                getString(R.string.TEXT25),
                getString(R.string.TEXT26),
                getString(R.string.TEXT27),
                getString(R.string.TEXT28),
                getString(R.string.TEXT29),
                getString(R.string.TEXT30),
                getString(R.string.TEXT31),
                getString(R.string.TEXT32),
                getString(R.string.TEXT33),
                getString(R.string.TEXT34),
                getString(R.string.TEXT35),
                getString(R.string.TEXT36)};

        Integer[] AndRody_Part = {
                R.string.TEXT01,
                R.string.TEXT02,
                R.string.TEXT03,
                R.string.TEXT04,
                R.string.TEXT05,
                R.string.TEXT06,
                R.string.TEXT07,
                R.string.TEXT08,
                R.string.TEXT09,
                R.string.TEXT010,
                R.string.TEXT111,
                R.string.TEXT112,
                R.string.TEXT113,
                R.string.TEXT114,
                R.string.TEXT115,
                R.string.TEXT116,
                R.string.TEXT117,
                R.string.TEXT118,
                R.string.TEXT119,
                R.string.TEXT220,
                R.string.TEXT221,
                R.string.TEXT222,
                R.string.TEXT223,
                R.string.TEXT224,
                R.string.TEXT225,
                R.string.TEXT226,
                R.string.TEXT227,
                R.string.TEXT228,
                R.string.TEXT229,
                R.string.TEXT330,
                R.string.TEXT331,
                R.string.TEXT332,
                R.string.TEXT333,
                R.string.TEXT334,
                R.string.TEXT335,
                R.string.TEXT336};

        Integer[] AndRody_image = {
                R.drawable.b1,
                R.drawable.b2,
                R.string.TEXT_3,
                R.string.TEXT_4,
                R.string.TEXT_5,
                R.string.TEXT_6,
                R.string.TEXT_7,
                R.string.TEXT_8,
                R.string.TEXT_9,
                R.string.TEXT_10,
                R.string.TEXT_11,
                R.string.TEXT_12,
                R.string.TEXT_13,
                R.string.TEXT_14,
                R.string.TEXT_15,
                R.string.TEXT_16,
                R.string.TEXT_17,
                R.string.TEXT_18,
                R.string.TEXT_19,
                R.string.TEXT_20,
                R.string.TEXT_21,
                R.string.TEXT_22,
                R.string.TEXT_23,
                R.string.TEXT_24,
                R.string.TEXT_25,
                R.string.TEXT_26,
                R.string.TEXT_27,
                R.string.TEXT_28,
                R.string.TEXT_29,
                R.string.TEXT_30,
                R.string.TEXT_31,
                R.string.TEXT_32,
                R.string.TEXT_33,
                R.string.TEXT_34,
                R.string.TEXT_35,
                R.string.TEXT_36};

        for (int i = 0; i <AndRody_Subject.length; i++) {
            Data abboudi = new Data(AndRody_Subject[i], AndRody_Part[i], AndRody_image[i]);
            arraylist.add(abboudi);
        }
        adapter = new ListAdapter(this, arraylist);

        listView.setAdapter(adapter);

    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the options menu from XML
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_serch, menu);
//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
//
//        SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener()
//        {
//            @Override
//            public boolean onQueryTextChange(String newText)
//            {
//                adapter.filter(newText);
//
//                return true;
//            }
//            @Override
//            public boolean onQueryTextSubmit(String query)
//            {
//                adapter.filter(query);
//
//                return true;
//            }
//        };
//        searchView.setOnQueryTextListener(textChangeListener);
//
//        return super.onCreateOptionsMenu(menu);
//    }
}
