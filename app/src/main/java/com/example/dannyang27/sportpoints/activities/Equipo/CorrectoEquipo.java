package com.example.dannyang27.sportpoints.activities.Equipo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dannyang27.sportpoints.R;

public class CorrectoEquipo extends AppCompatActivity {

    private ImageView img;
    private TextView correcto_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra_correcto);

        img = (ImageView) findViewById(R.id.imageView);
        correcto_txt = (TextView) findViewById(R.id.correcto_txt);
    }

    @Override
    public void onBackPressed() {
        Intent intent= getIntent();
        setResult(RESULT_OK, intent);
        finish();
    }
}