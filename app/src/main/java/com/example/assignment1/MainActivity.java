package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView T,T1;
    Button B,B1;
    double count=0;
    int s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T=(TextView)findViewById(R.id.t2);
        T1=(TextView)findViewById(R.id.t3);
        B=(Button)findViewById(R.id.b1);
        B1=(Button)findViewById(R.id.b2);
    }

        public void sow(View v) {
            //final Toast toast = Toast.makeText(this, "it's raning money", Toast.LENGTH_LONG());
            Toast.makeText(this,"it's raining money...",Toast.LENGTH_LONG).show();
        }

        public void make(View v) {
            count=count+1000;
          //  s=DecimalFormat(count);
        //    NumberFormat f=new DecimalFormat("#,###.00");
         //   String n=f.format(f);
         /*   NumberFormat f=NumberFormat.getCurrencyInstance();
            f.setMaximumFractionDigits(2);
            f.setCurrency(Currency.getInstance("Rs"));
            T.setText(String _(f);*/
         NumberFormat format=NumberFormat.getCurrencyInstance();
            Locale loc = new Locale("", "in");

            NumberFormat indiacurrency = NumberFormat.getCurrencyInstance(loc);
            String result = indiacurrency.format(count);
            //System.out.print(result);
            T.setText(result);
            if(count>=10000)
            {
                T.setTextColor(Color.parseColor("#000000"));
            }
            if(count>=20000&&count<50000) {
                T.setTextColor(Color.parseColor("#FFFF00"));
            }
            if(count>50000)
            {
                T1.setText("yeah..! bro,getting richer");
            }
        }

    }

