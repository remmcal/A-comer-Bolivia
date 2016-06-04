package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bebidas);
    }

    public void bebida1(View view)
    {
        Intent i=new Intent(getApplicationContext(),bebida1.class);
        startActivity(i);
    }

    public void bebida2(View view)
    {
        Intent a=new Intent(getApplicationContext(),bebida2.class);
        startActivity(a);
    }


    public void bebida3(View view)
    {
        Intent b=new Intent(getApplicationContext(),bebida3.class);
        startActivity(b);
    }

    public void bebida4(View view)
    {
        Intent c=new Intent(getApplicationContext(),bebida4.class);
        startActivity(c);
    }

    public void bebida5(View view)
    {
        Intent d=new Intent(getApplicationContext(),bebida5.class);
        startActivity(d);
    }

}
