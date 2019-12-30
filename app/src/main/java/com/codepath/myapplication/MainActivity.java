package com.codepath.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get new text
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //set new text if not empty
                if (TextUtils.isEmpty(newText))
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Kyle!");
                else
                    ((TextView) findViewById(R.id.textView)).setText(newText);
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text color
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                //background color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //text change
                ((TextView) findViewById(R.id.textView)).setText("Hello from Kyle!");
            }
        });
    }
}
