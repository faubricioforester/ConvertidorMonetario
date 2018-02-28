package com.example.faubricio.convertidormonetario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final int DOLAR_VALUE_COLONES = 568;

    public void convertirClicked(View view){
        EditText valueEditText = findViewById(R.id.valueEditText);
        int value = Integer.parseInt(valueEditText.getText().toString());

        RadioGroup radioGroup = findViewById(R.id.radioGroupOptions);
        RadioButton dcRadioButton = findViewById(R.id.radioButtonDC);
        RadioButton cdRadioButton = findViewById(R.id.radioButtonCD);
        TextView resultsTextView  = findViewById(R.id.textViewResult);


        float result;
        if (dcRadioButton.isChecked()){
            result = value * DOLAR_VALUE_COLONES;
        } else{
            result = value / DOLAR_VALUE_COLONES;

        }

        resultsTextView.setText(String.valueOf(result));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
