package com.example.sane.madassignment;

import android.os.UserManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Username, Password;
        Button Login;

        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String struser = Username.getText().toString();
                String strpass = Password.getText().toString();


                if (struser.equals("")||strpass.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter Username or password", Toast.LENGTH_SHORT).show();
                }
                else if (struser.equals(strpass))
                {
                    Toast.makeText(MainActivity.this, "Username and Password are same", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Sum ting wong", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
