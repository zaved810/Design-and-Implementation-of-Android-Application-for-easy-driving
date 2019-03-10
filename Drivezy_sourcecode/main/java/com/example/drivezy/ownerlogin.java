package com.example.drivezy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.icu.text.IDNA;
import android.support.annotation.NonNull;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ownerlogin extends AppCompatActivity {

    private Button login;
    private EditText password;
    private EditText user_id;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog Dialog;

    private int Counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ownerlogin);
        login = this.<Button>findViewById(R.id.OWNERLOGIN);
        user_id=(EditText) findViewById(R.id.USERID);
        password=(EditText)findViewById(R.id.PASSWORD);
        firebaseAuth=FirebaseAuth.getInstance();
        /* FirebaseUser user=firebaseAuth.getCurrentUser();
       if(user !=null){
            finish();
            startActivity(new Intent(ownerlogin.this, owpage1.class));
        }*/

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(user_id.getText().toString(), password.getText().toString());
            }

        }     );
    }

    private void validate(String username, String pass) {
        if(username.length()==0 || pass.length()==0) {
            Toast toast = Toast.makeText(ownerlogin.this, "field cant empty", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();

        }
        else{
            Dialog = new ProgressDialog(ownerlogin.this);


         Dialog.setMessage("Please Wait JAANEMAN ");
       Dialog.show();
            firebaseAuth.signInWithEmailAndPassword(username, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Dialog.dismiss();
                        startActivity(new Intent(ownerlogin.this, owpage1.class));

                        Toast toast = Toast.makeText(ownerlogin.this, "Login Sucessfull", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast.show();

                    } else {
                        Dialog.dismiss();
                        Counter--;
                        Toast toast = Toast.makeText(ownerlogin.this, "id pass not valid nd remaining attempts:" + Counter, Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast.show();



                        if (Counter == 0) {
                            login.setEnabled(false);

                        }
                    }


                }

            });
        }


    }
}


