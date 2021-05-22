package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e, d, y;
    Button b, c, f, g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = (EditText) findViewById(R.id.editText);
        d = (EditText) findViewById(R.id.editText2);
        y = (EditText) findViewById(R.id.editText3);
        b = (Button) findViewById(R.id.button);
        f = (Button) findViewById(R.id.button3);
        g = (Button) findViewById(R.id.button4);
        c = (Button) findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                String x = y.getText().toString();

                if(TextUtils.isEmpty(s)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
            }
                if (TextUtils.isEmpty(x)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }

                else{

                double n = Double.parseDouble(s);
                    double m = Double.parseDouble(x);
                d.setText(n+m+"");

        };
    }
            });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                String x = y.getText().toString();

                if(TextUtils.isEmpty(s)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                if (TextUtils.isEmpty(x)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m = Double.parseDouble(x);
                    d.setText(n-m+"");

                };
            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                String x = y.getText().toString();

                if(TextUtils.isEmpty(s)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                if (TextUtils.isEmpty(x)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m = Double.parseDouble(x);
                    d.setText(n*m+"");

                };
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                String x = y.getText().toString();

                if(TextUtils.isEmpty(s)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                if (TextUtils.isEmpty(x)){
                    Toast.makeText( MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m = Double.parseDouble(x);
                    d.setText(n/m+"");

                };
            }
        });




    }}