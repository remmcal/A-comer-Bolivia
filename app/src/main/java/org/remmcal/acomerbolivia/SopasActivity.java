package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SopasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopas);
    }

    public void sopa1(View view)
    {
        Intent i=new Intent(getApplicationContext(),Sopa1Activity.class);
        startActivity(i);
    }

    public void sopa2(View view)
    {
        Intent a=new Intent(getApplicationContext(),Sopa2Activity.class);
        startActivity(a);
    }


    public void sopa3(View view)
    {
        Intent b=new Intent(getApplicationContext(),Sopa3Activity.class);
        startActivity(b);
    }

    public void sopa4(View view)
    {
        Intent c=new Intent(getApplicationContext(),Sopa4Activity.class);
        startActivity(c);
    }

    public void sopa5(View view)
    {
        Intent d=new Intent(getApplicationContext(),Sopa5Activity.class);
        startActivity(d);
    }

    public void sopa6(View view)
    {
        Intent e=new Intent(getApplicationContext(),Sopa6Activity.class);
        startActivity(e);
    }

    public void sopa7(View view)
    {
        Intent f=new Intent(getApplicationContext(),Sopa7Activity.class);
        startActivity(f);
    }

}
