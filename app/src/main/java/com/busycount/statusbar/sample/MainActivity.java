package com.busycount.statusbar.sample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.busycount.statusbar.StatusBarCompat;

public class MainActivity extends AppCompatActivity {


    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarCompat.fit(this, Color.RED, true);
        findViewById(R.id.layout).setBackgroundColor(Color.RED);

    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.textView1:
                Main1Activity.start(this);
                break;
            case R.id.textView2:
                Main2Activity.start(this);
                break;
            case R.id.textView3:
                Main3Activity.start(this);
                break;
            default:
                break;
        }

    }
}
