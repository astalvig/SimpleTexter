package com.example.ashleystalvig.simpletexter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClickB1(View view) {
        Intent i = new Intent(getApplicationContext(), TextActivity.class);
        startActivity(i);
    }

    public void onClickB2(View view) {
        Intent i = new Intent(getApplicationContext(), TextActivity.class);
        startActivity(i);
    }

    public void onClickB3(View view) {
        Intent i = new Intent(getApplicationContext(), TextActivity.class);
        startActivity(i);
    }
}
