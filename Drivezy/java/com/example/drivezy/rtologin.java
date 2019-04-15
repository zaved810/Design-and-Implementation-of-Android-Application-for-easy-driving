package com.example.drivezy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rtologin extends AppCompatActivity {

    private Button login;
    private EditText password;
    private EditText user_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtologin);
        login= (Button)findViewById(R.id.RTOLOGIN);
        user_id=(EditText) findViewById(R.id.USERID);
        password=(EditText)findViewById(R.id.PASSWORD);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(user_id.getText().toString(),password.getText().toString());

            }
        });
    }
private  void validate(String username,String pass){

        if((username.equals("ayaz")) && (pass.equals("aa"))){
            Intent intent=new Intent(rtologin.this,rtosearch.class);
            startActivity(intent);
        }
        else{
           Toast toast= Toast.makeText(this, "id pass not valid", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
        }
}

}
