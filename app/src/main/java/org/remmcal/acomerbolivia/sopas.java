package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class sopas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sopas);
    }

    public void sopa1(View view)
    {
        Intent i=new Intent(getApplicationContext(),sopa1.class);
        startActivity(i);
    }

    public void sopa2(View view)
    {
        Intent a=new Intent(getApplicationContext(),sopa2.class);
        startActivity(a);
    }


    public void sopa3(View view)
    {
        Intent b=new Intent(getApplicationContext(),sopa3.class);
        startActivity(b);
    }

    public void sopa4(View view)
    {
        Intent c=new Intent(getApplicationContext(),sopa4.class);
        startActivity(c);
    }

    public void sopa5(View view)
    {
        Intent d=new Intent(getApplicationContext(),sopa5.class);
        startActivity(d);
    }

    public void sopa6(View view)
    {
        Intent e=new Intent(getApplicationContext(),sopa6.class);
        startActivity(e);
    }

    public void sopa7(View view)
    {
        Intent f=new Intent(getApplicationContext(),sopa7.class);
        startActivity(f);
    }

}
