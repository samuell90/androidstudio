package umn.ac.id.uts_samuel_27881;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnUserlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPassword);
        btnUserlogin = findViewById(R.id.btnUserlogin);

        btnUserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(username.getText().toString().equals("uasmobile") && password.getText().toString().equals("uasmobilegenap"))
                {
                    Toast.makeText(getApplicationContext(), "Selamat Datang \nSamuel 00000027881", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Login.this, Music.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Password or Username", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}