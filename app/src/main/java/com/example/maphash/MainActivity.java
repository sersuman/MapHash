package com.example.maphash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String[] countries = {"Nepal","Kathmandu","India","New Delhi",
    "USA","DC",
    "UK","London",
    "Canada","Ottawa"};
    private Map<String, String> dictionary;
    private ListView lstCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCountries = findViewById(R.id.lstCountries);

        dictionary = new HashMap<>();
        for (int i=0; i<countries.length; i+=2){
            dictionary.put(countries[i],countries[i+1]);
        }
        ArrayAdapter countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countries);

        lstCountries.setAdapter(countryAdapter);

    }
}
