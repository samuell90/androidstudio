package umn.ac.id.week08_27881;

import androidx.appcompat.app.AppCompatActivity;
import umn.ac.id.week08_27881.Tutorial1.TextEditorActivity;
import umn.ac.id.week08_27881.Tutorial2.SharedPreferenceActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTutorial1, btnTutorial2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTutorial1 = findViewById(R.id.btnTutorial1);
        btnTutorial2 = findViewById(R.id.btnTutorial2);

        btnTutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextEditorActivity.class));
            }
        });

        btnTutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity((new Intent(MainActivity.this, SharedPreferenceActivity.class)));
            }
        });

    }
}