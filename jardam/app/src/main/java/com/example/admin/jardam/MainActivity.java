package com.example.admin.jardam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void find(View view){
        Intent intent = new Intent(this, find.class);
        startActivity(intent);
    }
    public void lose(View view){
        Intent intent = new Intent(this, lose.class);
        startActivity(intent);
    }
    public void loseMan(View view){
        Intent intent = new Intent(this, lose.class);
        startActivity(intent);
    }
}
