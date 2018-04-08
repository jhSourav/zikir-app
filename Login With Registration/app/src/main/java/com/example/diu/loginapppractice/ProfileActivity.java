package com.example.diu.loginapppractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private Button ayatul;
    private Button durud;
    private Button hadis;
    private Button duah;
    private Button zikir;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ayatul=(Button) findViewById(R.id.ayatul);
        zikir=(Button) findViewById(R.id.zikir);
        hadis=(Button) findViewById(R.id.hadis);
        duah=(Button) findViewById(R.id.duah);
        durud=(Button) findViewById(R.id.durud);
        about=(Button) findViewById(R.id.about);


        zikir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ProfileActivity.this, AyatulActivity.class);
                startActivity(intent);
            }
        });

        ayatul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ProfileActivity.this, AyatulActivity.class);
                startActivity(intent);
            }
        });

        duah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ProfileActivity.this, HashorActivity.class);
                startActivity(intent);
            }
        });

        durud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ProfileActivity.this, DurudActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menubar,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if (id==R.id.menu){
            Toast.makeText( this, "clicked",Toast.LENGTH_SHORT ).show();
            startActivity(new Intent( this,AboutActivity.class ) );
        }
        return super.onOptionsItemSelected( item );
    }
}
