package com.example.vk8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Context context = null;
    TextView text = null;

    BottleDispenser bottledispenser = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        text = (TextView) findViewById(R.id.textView);
    }

        public void addMoney(View v){
            bottledispenser.addMoney(text);
        }

        public void buyBottle(View v){
            bottledispenser.buyBottle(text);
        }

        public void returnMoney(View v){
            bottledispenser.returnMoney(text);
        }

        /*public void listBottles(View v){
            bottledispenser.listBottles(text);
        }*/

}