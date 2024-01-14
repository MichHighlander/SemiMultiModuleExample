package com.example.demomultimodule;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.baselib.LibBroker;

public class ChosenLibActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LibBroker.getInstance().getLayoutView());
        LibBroker.getInstance().initLibTxtView(this);
    }
}
