package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class entradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entradas);
    }

    public void entrada1(View view)
    {
        Intent i=new Intent(getApplicationContext(),entrada1.class);
        startActivity(i);
    }

    public void entrada2(View view)
    {
        Intent a=new Intent(getApplicationContext(),entrada2.class);
        startActivity(a);
    }


    public void entrada3(View view)
    {
        Intent b=new Intent(getApplicationContext(),entrada3.class);
        startActivity(b);
    }

    public void entrada4(View view)
    {
        Intent c=new Intent(getApplicationContext(),entrada4.class);
        startActivity(c);
    }

    public void entrada5(View view)
    {
        Intent d=new Intent(getApplicationContext(),entrada5.class);
        startActivity(d);
    }

}
