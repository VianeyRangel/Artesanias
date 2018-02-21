package com.utng.vgutierrez.artesanias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArtesanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artesany);
    }

    public void nextActivity1 (View view){
        Intent intent = new Intent(ArtesanyActivity.this, LocationActivity.class);
        startActivity(intent);
    }

    public void nextActivity2 (View view){
        Intent intent = new Intent(ArtesanyActivity.this, ReseniaActivity.class);
        startActivity(intent);
    }
}
