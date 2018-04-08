package com.example.diu.loginapppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ZikirActivity extends AppCompatActivity {

    int count;
    int counta=0;
    int countb=0;
    int countc=0;
    private Button btn;
    private Button save;
    private TextView write;
    private Button btna;
    private TextView writea;
    private Button btnc;
    private TextView writeb;
    private Button btnd;
    private TextView writec;
    private Button btnb;
    private Button btne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_zikir );


        btn=(Button) findViewById(R.id.btn);
        write=(TextView) findViewById(R.id.write);
        btna=(Button) findViewById(R.id.btna);
        writea=(TextView) findViewById(R.id.writea);
        btnc=(Button) findViewById(R.id.btnc);
        writeb=(TextView) findViewById(R.id.writeb);
        btnd=(Button) findViewById(R.id.btnd);
        writec=(TextView) findViewById(R.id.writec);
        btnb=(Button) findViewById(R.id.btnb);
        btne=(Button) findViewById(R.id.btne);
        save=(Button) findViewById(R.id.save);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                write.setText(" "+count +" times");
            }
        });
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counta ++;
                writea.setText(" "+counta +" times");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countb ++;
                writeb.setText(" "+countb +" times");
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countc ++;
                writec.setText(" "+countc +" times");
            }
        });
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                System.exit(0);
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                write.setText(String.valueOf(0));count=0;
                writea.setText(String.valueOf(0));counta=0;
                writeb.setText(String.valueOf(0));countb=0;
                writec.setText(String.valueOf(0));countc=0;


            }
        });
    }
}
