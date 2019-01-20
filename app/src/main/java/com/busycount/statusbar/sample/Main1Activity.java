package com.busycount.statusbar.sample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, Main1Activity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        findViewById(R.id.layout).setBackgroundColor(Color.YELLOW);
    }

    public void onClick(View view) {
        finish();
    }
}
