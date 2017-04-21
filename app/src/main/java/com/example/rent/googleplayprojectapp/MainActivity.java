package com.example.rent.googleplayprojectapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView changeableText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyFlavorCheckInterface myFlavorCheckInterface = new MyFlavorCheckInterfaceImpl();
        changeableText = (TextView) findViewById(R.id.changeable_text);
        changeableText.setText(myFlavorCheckInterface.returnMyFlavorName());

        MyObfuscatedClass myObfuscatedClass = new MyObfuscatedClass();
        Log.e("Obfuscated", myObfuscatedClass.getText());
        MyNotObfuscatedClass myNotObfuscatedClass = new MyNotObfuscatedClass();
        Log.e("Obfuscated", myNotObfuscatedClass.getText());
    }
}
