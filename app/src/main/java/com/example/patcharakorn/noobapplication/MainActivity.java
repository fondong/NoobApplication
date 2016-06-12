package com.example.patcharakorn.noobapplication;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    TextView text;
    boolean switchClick = false;
    EditText editText;
    String i;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        text = (TextView) findViewById(R.id.tv1);
        editText = (EditText) findViewById(R.id.editText);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switchClick = !switchClick;
                if (switchClick) {
                    text.setText(getResources().getString(R.string.pundor));

                } else {
                    text.setText(getResources().getString(R.string.fondong));

                }
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("i",editText.getText().toString());

                startActivity(intent);




            }
        });

    };
}