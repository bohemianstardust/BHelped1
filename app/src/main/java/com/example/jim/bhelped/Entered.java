package com.example.jim.bhelped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entered extends AppCompatActivity
{
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entered);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openCafe();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openExpresos();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openContactos();
            }
        });
    }
    public void openCafe()
    {
        Intent intent = new Intent(this, Cafe.class);
        startActivity(intent);
    }

    public void openExpresos()
    {
        Intent intent = new Intent(this, Expresos.class);
        startActivity(intent);
    }

    public void openContactos()
    {
        Intent intent = new Intent(this, Contactos.class);
        startActivity(intent);
    }
}
