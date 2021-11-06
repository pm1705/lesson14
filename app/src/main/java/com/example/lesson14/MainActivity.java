package com.example.lesson14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] names= {"Pick a country","Israel","USA","China","Russia","England","Japan","Germany"};
    int[] flags = {R.drawable.globe, R.drawable.israel,R.drawable.usa,R.drawable.china,R.drawable.russia,R.drawable.england,R.drawable.japan,R.drawable.germany};
    String[] capitals = {"NOW","Jerusalem","Washington D.C","Beijing","Moskova","London","Tokyo","Berlin"};
    String[] info = {"Name: Israel\nCapital: Jerusalem\nAnthem: Tikva\nPopulation: 9.2M\nLanguages: Hebrew, Arabic",
                     "Name: USA\nCapital: Washington D.C\nAnthem: star spangled banner\nPopulation: 329M\nLanguages: English",
                     "Name: China \nCapital: Beijing\nAnthem: March of the volunteers\nPopulation: 1.4B \nLanguages: Chinese",
                     "Name: Russia\nCapital: Moskova\nAnthem: Anthem of the Russian Federation\nPopulation: 144M\nLanguages: Russian",
                     "Name: England\nCapital: London\nAnthem: God Save The Queen\nPopulation: 55M\nLanguages: English",
                     "Name: Japan\nCapital: Tokyo\nAnthem: Kimi Ga Yo\nPopulation: 125M\nLanguages: Japanese",
                     "Name: Germany\nCapital: Berlin\nAnthem: Deutschlandlied\nPopulation: 83M\nLanguages: German"};

    Spinner country_spinner;
    TextView country_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_spinner = (Spinner) findViewById(R.id.country_spinner);
        country_info = (TextView) findViewById(R.id.country_info);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),
                names, flags, capitals);
        country_spinner.setAdapter(customadp);

        country_spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 0) {
            country_info.setText(info[position - 1]);
        }
        else{
            country_info.setText("pick a country first");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}