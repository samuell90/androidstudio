package umn.ac.id.week06_27881;

import androidx.appcompat.app.AppCompatActivity;
import umn.ac.id.week06_27881.Drawable.DrawableActivity;
import umn.ac.id.week06_27881.Fisika.FisikaActivity;
import umn.ac.id.week06_27881.Properti.PropertiActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnProperty, btnDrawable, btnPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProperty = findViewById(R.id.btnProp);
        btnDrawable = findViewById(R.id.btnDrawable);
        btnPhysics = findViewById(R.id.btnPhysics);

        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PropertiActivity.class));
            }
        });

        btnDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DrawableActivity.class));
            }
        });

        btnPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FisikaActivity.class));
            }
        });
    }
}