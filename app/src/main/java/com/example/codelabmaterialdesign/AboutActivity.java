package com.example.codelabmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView githubProfileText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = findViewById(R.id.toolbar_about);
        setSupportActionBar(toolbar);

        initUI();

        githubProfileText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/raulrp3";
                Intent intent = new Intent(AboutActivity.this,WebActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
    }

    private void initUI(){
        githubProfileText = findViewById(R.id.github_profile);
    }
}
