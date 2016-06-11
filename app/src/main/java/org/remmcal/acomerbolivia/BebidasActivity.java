package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BebidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
    }

    public void bebida1(View view)
    {
        Intent i=new Intent(getApplicationContext(),Bebida1Activity.class);
        startActivity(i);
    }

    public void bebida2(View view)
    {
        Intent a=new Intent(getApplicationContext(),Bebida2Activity.class);
        startActivity(a);
    }


    public void bebida3(View view)
    {
        Intent b=new Intent(getApplicationContext(),Bebida3Activity.class);
        startActivity(b);
    }

    public void bebida4(View view)
    {
        Intent c=new Intent(getApplicationContext(),Bebida4Activity.class);
        startActivity(c);
    }

    public void bebida5(View view)
    {
        Intent d=new Intent(getApplicationContext(),Bebida5Activity.class);
        startActivity(d);
    }

}
