package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.intentpassingdata.R;

public class Activity_Object extends AppCompatActivity {
    public static String EXTRA_PERSON = " extra_person";
    public TextView tvObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);


    }
}
