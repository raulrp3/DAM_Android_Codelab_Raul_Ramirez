package com.example.codelabmaterialdesign;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView githubProfileText;
    TextView telephone;
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
                loadPage(R.id.github_profile);
            }
        });

        telephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "tel:" + telephone.getText().toString().trim();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(phone));
                startActivity(intent);
            }
        });
    }

    private void initUI(){

        githubProfileText = findViewById(R.id.github_profile);
        telephone = findViewById(R.id.telephone);
    }

    private void loadPage(int id){
        Intent intent = new Intent(AboutActivity.this,WebActivity.class);
        switch (id){
            case R.id.github_profile:{
                String url = "https://github.com/raulrp3";
                intent.putExtra("url",url);
            }
            break;
        }
        startActivity(intent);
    }
}
