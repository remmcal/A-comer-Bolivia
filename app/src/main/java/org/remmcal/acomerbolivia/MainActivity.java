package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entradas(View view)
    {
        Intent i=new Intent(getApplicationContext(),EntradasActivity.class);
        startActivity(i);
    }

    public void sopas(View view)
    {
        Intent a=new Intent(getApplicationContext(),SopasActivity.class);
        startActivity(a);
    }


    public void segundos(View view)
    {
        Intent b=new Intent(getApplicationContext(),SegundosActivity.class);
        startActivity(b);
    }

    public void postres(View view)
    {
        Intent c=new Intent(getApplicationContext(),PostreSActivity.class);
        startActivity(c);
    }

    public void bebidas(View view)
    {
        Intent d=new Intent(getApplicationContext(),BebidasActivity.class);
        startActivity(d);
    }

    public void tips(View view)
    {
        Intent e=new Intent(getApplicationContext(),TipsActivity.class);
        startActivity(e);
    }

    public void descripcion(View view)
    {
        Intent j=new Intent(getApplicationContext(),DescripcionActivity.class);
        startActivity(j);
    }
}
