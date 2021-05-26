package org.qyj.nativeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnUnityStart(View view) {
        // Do something in response to button
        Intent intent = new Intent(MainActivity.this, UnityPlayerActivity.class);

        startActivity(intent);
    }
}