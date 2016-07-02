package com.example.android.booksearchapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.searchButton);
        b1.setOnClickListener(myhandler);
    }

    View.OnClickListener myhandler = new View.OnClickListener() {
        public void onClick(View v) {
            EditText requestSearch = (EditText) findViewById(R.id.searchField);
            String request = requestSearch.getText().toString();

            Log.v("buttonCheck", "The request is " + request);

            Intent bIntent = new Intent(MainActivity.this, ResultActivity.class);
            bIntent.putExtra("request", request);
            startActivity(bIntent);
        }
    };
}

