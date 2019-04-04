package com.example.drivezy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class owpage11 extends AppCompatActivity {
    private Button document1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owpage11);
        document1= findViewById(R.id.DOCUMENT1);

        document1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImagesActivity();
            }

            private void openImagesActivity() {
                Intent intent = new Intent(owpage11.this,ImagesActivity.class);
                startActivity(intent);
            }
        });
    }
}
