package com.example.keith.qrcodescanner;

/**
 * Created by Keith on 10/03/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Confirm extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
    }
    public void con(View v) {
        if (v.getId() == R.id.in)
        {
            //go to login class
            Intent intent = new Intent(Confirm.this, Start.class);
            startActivity(intent);
        }
    }

}
