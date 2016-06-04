package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entradas(View view)
    {
        Intent i=new Intent(getApplicationContext(),entradas.class);
        startActivity(i);
    }

    public void sopas(View view)
    {
        Intent a=new Intent(getApplicationContext(),sopas.class);
        startActivity(a);
    }


    public void segundos(View view)
    {
        Intent b=new Intent(getApplicationContext(),segundos.class);
        startActivity(b);
    }

    public void postres(View view)
    {
        Intent c=new Intent(getApplicationContext(),postres.class);
        startActivity(c);
    }

    public void bebidas(View view)
    {
        Intent d=new Intent(getApplicationContext(),bebidas.class);
        startActivity(d);
    }

    public void tips(View view)
    {
        Intent e=new Intent(getApplicationContext(),tips.class);
        startActivity(e);
    }

    public void descripcion(View view)
    {
        Intent j=new Intent(getApplicationContext(),descripcion.class);
        startActivity(j);
    }
}
