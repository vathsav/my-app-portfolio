package com.vathsav.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button objects
        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        Button btnFootball = (Button) findViewById(R.id.btnFootball);
        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        Button btnBuild  = (Button) findViewById(R.id.btnBuild);
        Button btnReader = (Button) findViewById(R.id.btnReader);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);

        // Add onClick listeners
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my Spotify app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my Football scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my own super cool app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
