package com.example.keith.qrcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Keith on 02/03/2017.
 */
public class Start extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        Button button = (Button)findViewById(R.id.other);
        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        Intent intent = new Intent(Start.this, StaffStart.class);
                        startActivity(intent);
                        return true;
                    }
                }
        );
    }
    //onclick signin button
    public void signIn(View v) {
        if (v.getId() == R.id.in)
        {
            //go to login class
            Intent intent = new Intent(Start.this, MainActivity.class);
            startActivity(intent);
        }
    }
    //onclick signout button
    public void signOut(View v) {
        if (v.getId() == R.id.out)
        {
            //go to the register class
            Intent intent = new Intent(Start.this, MainActivity.class);
            startActivity(intent);
        }
    }

}
