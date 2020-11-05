package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Convert(View view){
        EditText Currency = (EditText)findViewById(R.id.currencyConverter);
        String str1 = Currency.getText().toString();
        Double Cur = Double.parseDouble(str1);
        double res = Cur * 73;
        String Ans = Double.toString(res);
        Log.i("Answer",Ans);
        Toast toast = Toast.makeText(getApplicationContext(), "INR"+Ans, Toast.LENGTH_SHORT);
        toast.show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}