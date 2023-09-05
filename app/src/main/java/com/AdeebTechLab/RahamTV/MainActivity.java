package com.AdeebTechLab.RahamTV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21;

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
        b15 = findViewById(R.id.button15);
        b16 = findViewById(R.id.button16);
        b17 = findViewById(R.id.button17);
        b18 = findViewById(R.id.button18);
        b19 = findViewById(R.id.button19);
        b20 = findViewById(R.id.button20);
        b21 = findViewById(R.id.button21);






        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlz_ie7euyG6jAaMZtS3U0Rv";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlzNst8BdPchvgkRaUk18yZg";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlyRJS9ztUfUjCMo_jr-zEq-";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vly1DLgbqupoy0gzFOm03m1B";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlyNYCryJ3Iiy75-ILr-_Fse";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlyrr2xgbG60hbmLp07QDsSi";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlyLGRiyIrYC6xdnYFxkTqi0";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlx7bfEM2-JG1WzHJcrxLMsd";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlxr7PhTYjDuOeWTjDgyMyTS";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlwlVSpx9RMhi6XwdcH-mtU_";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlyqqtqWG9X0UDbHPrlzu46c";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlwYasJd8xB9_SUXCSRLEhgC";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlxqoj3YjPhzO3znmDujWWR0";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlzyPH00edgjRRaSUET0DYiM";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlyNJcIuBYxNA3Zd63DbBbyR";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlywAbxXhTZ0QCANDidh2ZMk";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9Vlw-0cajVFA4lTf86rz9exXo";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);

            }
        });


        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://m.youtube.com/playlist?list=PLAko-gSS9VlzlcsLUrF7Beev50SJwCbwD";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/RahamTV";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/raham.tv/";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "mailto:rehamtvchannel@gmail.com";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });







    }
}