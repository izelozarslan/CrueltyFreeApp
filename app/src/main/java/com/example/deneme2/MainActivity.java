package com.example.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.my_list);
        List<String> mylist = new ArrayList<>();
        mylist.add("Essence"); mylist.add("Nyx"); mylist.add("Note");
        mylist.add("Eyüp Sabri Tuncer"); mylist.add("Otacı"); mylist.add("Tresan");
        mylist.add("Flormar"); mylist.add("Bebak"); mylist.add("Sleepy");
        mylist.add("Frosch"); mylist.add("Abtira"); mylist.add("Anne Nature"); mylist.add("Alba Botanica");
        mylist.add("Arkonem"); mylist.add("Blade"); mylist.add("Bershka"); mylist.add("Carrefour Eco Planet");
        mylist.add("Dalan d’olive"); mylist.add("Dermoskin"); mylist.add("Duru");
        mylist.add("Eklips"); mylist.add("H&M"); mylist.add("Kalyon");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mylist);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_mag_icon);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here...");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);


    }
}