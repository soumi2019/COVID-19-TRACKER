package com.developer.arsltech.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    private Button get_started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        get_started=(Button)findViewById(R.id.getstarted);

        get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getStarted = new Intent(StartPage.this,HomeActivity.class);
                startActivity(getStarted);
            }
        });
    }
}
