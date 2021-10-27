package com.example.app_mid_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void but_click(View view){
        EditText edn=(EditText)findViewById(R.id.editTextNumber);
        EditText edn2=(EditText)findViewById(R.id.editTextNumber2);
        EditText edn3=(EditText)findViewById(R.id.editTextNumber3);
        EditText edn4=(EditText)findViewById(R.id.editTextNumber4);
        TextView tv=(TextView)findViewById(R.id.textView9);
        tv.setText(""+
                (
                        Float.parseFloat(edn.getText().toString())+Math.ceil
                                (
                                        (
                                                Float.parseFloat(edn4.getText().toString())/Float.parseFloat(edn2.getText().toString())
                                        )*10/10-1
                                )*Float.parseFloat(edn3.getText().toString())
                ));
    }
}