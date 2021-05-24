package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("info","Button preesed");
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInDollar =editText.getText().toString();
        Double amountInDollarDouble = Double.parseDouble(amountInDollar);


        Double amountInRupeesDouble = amountInDollarDouble * 73.13;
        String amountInRupees = String.format("%.2f", amountInRupeesDouble);
        Log.i("Amount in Rupees",amountInRupees);
        Toast.makeText(this,  amountInDollar + "$ is " + amountInRupees + "₹" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}