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
    TextView disp_initial_value, display_final_answer;

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
        disp_initial_value = (TextView) findViewById(R.id.initial_value);
        disp_initial_value.setText("" + length );

    }

    private void displayFeet(double val) {
        display_final_answer = (TextView) findViewById(R.id.calculated_value);
        display_final_answer.setText(String.format(Locale.US, "%.1f",val));

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
