package com.example.diu.loginapppractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private Button signUp;
    private EditText userName,email,phone,password;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        database = new Database(this);
        findView();
        signUp();

    }

    private void findView() {
        userName=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        password=(EditText)findViewById(R.id.password);
        signUp=(Button)findViewById(R.id.signUp);


    }





    public void insertUserInfromation(){
        User user=new User();
        user.setUsername(userName.getText().toString());
        user.setEmail(email.getText().toString());
        user.setPhone(phone.getText().toString());
        user.setPassword(password.getText().toString());
        if(database.insertUserInfo(user)>0){
            Toast.makeText(this, "Sign Up Successfully", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Sign Up Failled", Toast.LENGTH_SHORT).show();
        }

    }

    public void signUpOnClick(){
        if(!userName.equals("")&&!email.equals("")&&!phone.equals("")&&!password.equals("")){
            insertUserInfromation();
        }
        else{
            Toast.makeText(this, "Please provide information", Toast.LENGTH_SHORT).show();
        }
    }

    public void signUp(){
        signUp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        signUpOnClick();
                    }
                }
        );
    }
}
