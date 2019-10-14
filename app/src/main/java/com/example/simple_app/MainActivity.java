package com.example.simple_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    TextView dt, ft;
    EditText edT;
    int length = 150;
    double val = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void displayText(View view) {
        // edT = (EditText) findViewById(R.id.edit_text);

        display(length);
    }

    private void display(int length) {
        dt = (TextView) findViewById(R.id.edit_text);
        dt.setText("" + length);

    }

    private void displayFeet(double val) {
        ft = (TextView) findViewById(R.id.display_text);
        ft.setText(String.format(Locale.US, "%.1f", val));

    }


    public void increment(View view) {
        length += 1;
        display(length);
        double val = (double)length/30;
        displayFeet(val);

    }

    public void decrement(View view) {
        length -= 1;
        display(length);
        double val = (double)length/30;
        displayFeet(val);
    }
/*
    public void length_in_feet(View view) {
        double val = (double)length/30;
        displayFeet(val);
    }
*/
    public void reset_all(View view) {
        display(150);
        displayFeet(5.0);
        length=150;
        val=0.0;
    }
}
