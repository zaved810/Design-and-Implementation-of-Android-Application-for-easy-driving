package com.example.drivezy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button rto,owner,benificiary ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // Log.d("tag","In oncreate");
        //Log.e("tag","In oncreate");
        //Log.w("tag","In oncreate");
        //Log.i("tag","In oncreate");




   rto= this.<Button>findViewById(R.id.RTO);
      benificiary= this.<Button>findViewById(R.id.BENIFICIARY);
      owner= this.<Button>findViewById(R.id.OWNER);

      rto.setOnClickListener(this);
      benificiary.setOnClickListener(this);
      owner.setOnClickListener(this);

        //rto.setOnClickListener(new View.OnClickListener() {
          //  @Override
       //     public void onClick(View view) {
         //       Log.d("tag",  "someone click on rto");
          //  }
     //   });
       // owner.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   Log.d("tag",  "someone click on owner");
           // }
        //});
        //benificiary.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view) {
            //    Log.d("tag",  "someone click on benificiary");
         //   }
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private void addlogibButtonListner(){

        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","In onstart ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","In onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","In onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","In onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","In ondestroy");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.RTO :
                Intent intent=new Intent(MainActivity.this,rtologin.class);
                startActivity(intent);
                break;

            case R.id.OWNER:
                Intent intent1=new Intent(MainActivity.this,ownerlogin.class);
                startActivity(intent1);
                 break;

            case R.id.BENIFICIARY:
                Log.d("tag",  "someone click on benificiary");

                break;
        }

    }
}
