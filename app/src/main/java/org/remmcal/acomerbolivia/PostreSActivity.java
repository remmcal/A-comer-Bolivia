package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PostreSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);
    }

    public void postre1(View view)
    {
        Intent i=new Intent(getApplicationContext(),Postre1Activity.class);
        startActivity(i);
    }

    public void postre2(View view)
    {
        Intent a=new Intent(getApplicationContext(),Postre2Activity.class);
        startActivity(a);
    }


    public void postre3(View view)
    {
        Intent b=new Intent(getApplicationContext(),Postre3Activity.class);
        startActivity(b);
    }

    public void postre4(View view)
    {
        Intent c=new Intent(getApplicationContext(),Postre4Activity.class);
        startActivity(c);
    }

    public void postre5(View view)
    {
        Intent d=new Intent(getApplicationContext(),Postre5Activity.class);
        startActivity(d);
    }
    public void comida17(View view)
    {
        Intent d=new Intent(getApplicationContext(),Comida17Activity.class);
        startActivity(d);
    }

}
