package com.example.drivezy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rtosearch extends AppCompatActivity implements View.OnClickListener  {
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtosearch);
        search= this.<Button>findViewById(R.id.SEARCH);
        search.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.SEARCH :
                Intent intent=new Intent(rtosearch.this,rtohome.class);
                startActivity(intent);
                break;



        }
    }
}
