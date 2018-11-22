package com.example.yoshino.imagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText giveuser;
    boolean isMargin = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giveuser =  findViewById(R.id.txt_username);
    }

    public void marginTOP(View view) {

        if (!isMargin) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) giveuser.getLayoutParams();
            // Set TextView layout margin 25 pixels to all side
            // Left Top Right Bottom Margin
            lp.setMargins(50, 100, 0, 0);
            // Apply the updated layout parameters to TextView
            giveuser.setLayoutParams(lp);
            isMargin = true;
        }

        else {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) giveuser.getLayoutParams();
            // Set TextView layout margin 25 pixels to all side
            // Left Top Right Bottom Margin
            lp.setMargins(0, 0, 0, 0);
            // Apply the updated layout parameters to TextView
            giveuser.setLayoutParams(lp);
            isMargin = false;

    }
    }
}
