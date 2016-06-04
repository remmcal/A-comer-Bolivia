package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class segundos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundos);
    }

    public void comida1(View view)
    {
        Intent i=new Intent(getApplicationContext(),comida1.class);
        startActivity(i);
    }

    public void comida2(View view)
    {
        Intent a=new Intent(getApplicationContext(),comida2.class);
        startActivity(a);
    }


    public void comida3(View view)
    {
        Intent b=new Intent(getApplicationContext(),comida3.class);
        startActivity(b);
    }

    public void comida4(View view)
    {
        Intent c=new Intent(getApplicationContext(),comida4.class);
        startActivity(c);
    }

    public void comida5(View view)
    {
        Intent d=new Intent(getApplicationContext(),comida5.class);
        startActivity(d);
    }

    public void comida6(View view)
    {
        Intent e=new Intent(getApplicationContext(),comida6.class);
        startActivity(e);
    }



    public void comida8(View view)
    {
        Intent g=new Intent(getApplicationContext(),comida8.class);
        startActivity(g);
    }

    public void comida13(View view)
    {
        Intent m=new Intent(getApplicationContext(),comida13.class);
        startActivity(m);
    }

    public void comida16(View view)
    {
        Intent o=new Intent(getApplicationContext(),comida16.class);
        startActivity(o);
    }

    public void comida17(View view)
    {
        Intent p=new Intent(getApplicationContext(),comida17.class);
        startActivity(p);
    }

    public void comida18(View view)
    {
        Intent q=new Intent(getApplicationContext(),comida18.class);
        startActivity(q);
    }

    public void comida19(View view)
    {
        Intent r=new Intent(getApplicationContext(),comida19.class);
        startActivity(r);
    }

    public void comida20(View view)
    {
        Intent s=new Intent(getApplicationContext(),comida20.class);
        startActivity(s);
    }

    public void comida21(View view)
    {
        Intent t=new Intent(getApplicationContext(),comida21.class);
        startActivity(t);
    }
}
