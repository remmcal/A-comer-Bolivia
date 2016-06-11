package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EntradasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);
    }

    public void entrada1(View view)
    {
        Intent i=new Intent(getApplicationContext(),Entrada1Activity.class);
        startActivity(i);
    }

    public void entrada2(View view)
    {
        Intent a=new Intent(getApplicationContext(),Entrada2Activity.class);
        startActivity(a);
    }


    public void entrada3(View view)
    {
        Intent b=new Intent(getApplicationContext(),Entrada3Activity.class);
        startActivity(b);
    }

    public void entrada4(View view)
    {
        Intent c=new Intent(getApplicationContext(),Entrada4Activity.class);
        startActivity(c);
    }

    public void entrada5(View view)
    {
        Intent d=new Intent(getApplicationContext(),Entrada5Activity.class);
        startActivity(d);
    }

}
