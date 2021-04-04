package umn.ac.id.uts_samuel_27881;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnProfile, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnProfile = findViewById(R.id.btnProfile);

        btnLogin.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, Login.class));
                }

        });

        btnProfile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Profile.class));
            }

        });

    }


}