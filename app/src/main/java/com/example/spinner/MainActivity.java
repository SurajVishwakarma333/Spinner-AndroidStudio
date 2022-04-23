package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //importing/Initialising Spinner. where Spinner = widget name and studentsSpinner = id name of Spinner
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding Spinner from .xml file to .java file
        studentsSpinner = findViewById(R.id.studentsSpinner);

        ArrayList<String> arrayCities = new ArrayList<>();
        arrayCities.add("Mumbai");
        arrayCities.add("Chennai");
        arrayCities.add("Hyderabad");
        arrayCities.add("Kolkata");
        arrayCities.add("Delhi");
        arrayCities.add("MP");
        arrayCities.add("UP");

        //Creating ArrayList to add the data in a list
        ArrayAdapter<String> adapterStudents = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrayCities);

        //Passing adapter content to Spinner.
        studentsSpinner.setAdapter(adapterStudents);

        //now let make setOnItemSelectedListener for when we click on any cities-name something should be happen.
        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayCities.get(i) + " Selected", Toast.LENGTH_SHORT).show();
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

/*
Steps :-
1.add Spinner in xml file.
2.import Spinner in java file
3.find Spinner by findViewById
4.create array list and add the data
5.create adapter to display the array list data
6.pass the data
8.create setOnItemSelectedListener to do something when we click on cities name.
 */














