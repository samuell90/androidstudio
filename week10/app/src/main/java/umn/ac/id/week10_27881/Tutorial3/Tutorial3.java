package umn.ac.id.week10_27881.Tutorial3;

import androidx.appcompat.app.AppCompatActivity;
import umn.ac.id.week10_27881.R;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tutorial3 extends AppCompatActivity {
    CustomBoundService customBoundService;
    boolean isBound = false;

    private ServiceConnection serviceConnection =
            new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName name,
                                               IBinder service) {
                    CustomBoundService.CustomLocalBinder binder =
                            (CustomBoundService.CustomLocalBinder) service;
                    customBoundService = binder.getService();
                    isBound = true;
                }

                @Override
                public void onServiceDisconnected(ComponentName name) {
                    isBound = false;
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);
        Intent servIntent = new Intent(this, SimpleIntentService.class);
        startService(servIntent);

        Button btnStartService = findViewById(R.id.main_button_startservice);
        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tutorial3.this,
                        CustomService.class);
                startService(intent);
            }
        });

        Intent intent2 = new Intent(this, CustomBoundService.class);
        bindService(intent2, serviceConnection, Context.BIND_AUTO_CREATE);

        Button btnShowTime = findViewById(R.id.main_button_showtime);
        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentTime = customBoundService.getCurrentTime();
                Toast.makeText(getApplicationContext(),
                        currentTime,Toast.LENGTH_LONG).show();
            }
        });



    }



}



