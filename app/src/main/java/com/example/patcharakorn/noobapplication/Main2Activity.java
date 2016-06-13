package com.example.patcharakorn.noobapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class Main2Activity extends AppCompatActivity {
    Button button2, button3;
    EditText editText;
    String inp;
    TextView tv2;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        inp = intent.getStringExtra("i");
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        editText = (EditText) findViewById(R.id.editText);
        tv2 = (TextView) findViewById(R.id.tv2);

        tv2.setText(inp);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivityForResult(i, 123);


            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 123){
            if(resultCode == RESULT_OK){
                finish();
            }
            if(resultCode == RESULT_CANCELED){
                button3.setText("Fondong cute");
            }
        }
    }
}
