package com.example.demomultimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
            LibBroker.getInstance().createAgent(LibType.findLibTypeByFlavor(BuildConfig.FLAVOR), getApplication());
//            Log.d("MainAcitivty", "BuildConfig.API_URL" + BuildConfig.API_URL);
            txt.setText(LibBroker.getInstance().talk());

            Button libLayoutBtn = findViewById(R.id.lib_layout_btn);
            libLayoutBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ChosenLibActivity.class);

                    // Optional: Pass data to the second activity
                    // Start the second activity
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            Log.e("MainActivity", "", e);
        }
    }
}

