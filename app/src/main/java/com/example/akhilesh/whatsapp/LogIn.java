package com.example.akhilesh.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    TextView textView5;
    TextView textView6;
    EditText editText;
    EditText editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_log_in);
        editText = findViewById (R.id.editText);
        editText2 = findViewById (R.id.editText2);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(button.isPressed ()){
                    Toast.makeText (LogIn.this, "you are welcome to WhatsApp", Toast.LENGTH_SHORT).show ();
                }
                else
                    Toast.makeText (LogIn.this, "you are not able to enter into WhatsApp", Toast.LENGTH_SHORT).show ();
            }
        });


    }
}
