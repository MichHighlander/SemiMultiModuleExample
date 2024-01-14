package com.example.demomultimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.baselib.LibBroker;
import com.example.baselib.LibType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.hello_txt);
        // Load and instantiate a class dynamically
        try {
            LibBroker.getInstance().createAgent(LibType.findLibTypeByBuildType(BuildConfig.BUILD_TYPE), getApplication());
            txt.setText(LibBroker.getInstance().talk());
        } catch (Exception e) {
            Log.e("MainActivity", "", e);
        }
    }
}

