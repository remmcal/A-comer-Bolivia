package org.remmcal.acomerbolivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class postres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postres);
    }

    public void postre1(View view)
    {
        Intent i=new Intent(getApplicationContext(),postre1.class);
        startActivity(i);
    }

    public void postre2(View view)
    {
        Intent a=new Intent(getApplicationContext(),postre2.class);
        startActivity(a);
    }


    public void postre3(View view)
    {
        Intent b=new Intent(getApplicationContext(),postre3.class);
        startActivity(b);
    }

    public void postre4(View view)
    {
        Intent c=new Intent(getApplicationContext(),postre4.class);
        startActivity(c);
    }

    public void postre5(View view)
    {
        Intent d=new Intent(getApplicationContext(),postre5.class);
        startActivity(d);
    }
    public void comida17(View view)
    {
        Intent d=new Intent(getApplicationContext(),comida17.class);
        startActivity(d);
    }

}
