package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SegundosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundos);
    }

    public void comida1(View view)
    {
        Intent i=new Intent(getApplicationContext(),Comida1Activity.class);
        startActivity(i);
    }

    public void comida2(View view)
    {
        Intent a=new Intent(getApplicationContext(),Comida2Activity.class);
        startActivity(a);
    }


    public void comida3(View view)
    {
        Intent b=new Intent(getApplicationContext(),Comida3Activity.class);
        startActivity(b);
    }

    public void comida4(View view)
    {
        Intent c=new Intent(getApplicationContext(),Comida4Activity.class);
        startActivity(c);
    }

    public void comida5(View view)
    {
        Intent d=new Intent(getApplicationContext(),Comida5Activity.class);
        startActivity(d);
    }

    public void comida6(View view)
    {
        Intent e=new Intent(getApplicationContext(),Comida6Activity.class);
        startActivity(e);
    }



    public void comida8(View view)
    {
        Intent g=new Intent(getApplicationContext(),Comida8Activity.class);
        startActivity(g);
    }

    public void comida13(View view)
    {
        Intent m=new Intent(getApplicationContext(),Comida13Activity.class);
        startActivity(m);
    }

    public void comida16(View view)
    {
        Intent o=new Intent(getApplicationContext(),Comida16Activity.class);
        startActivity(o);
    }

    public void comida17(View view)
    {
        Intent p=new Intent(getApplicationContext(),Comida17Activity.class);
        startActivity(p);
    }

    public void comida18(View view)
    {
        Intent q=new Intent(getApplicationContext(),Comida18Activity.class);
        startActivity(q);
    }

    public void comida19(View view)
    {
        Intent r=new Intent(getApplicationContext(),Comida19Activity.class);
        startActivity(r);
    }

    public void comida20(View view)
    {
        Intent s=new Intent(getApplicationContext(),Comida20Activity.class);
        startActivity(s);
    }

    public void comida21(View view)
    {
        Intent t=new Intent(getApplicationContext(),Comida21Activity.class);
        startActivity(t);
    }
}
