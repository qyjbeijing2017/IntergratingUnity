package org.qyj.nativeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.unity3d.player.UnityPlayerActivity;

public class MainUnityActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        int layoutId = getResources().getIdentifier( "activity_main_unity" , "layout" , getPackageName());
//        System. out .println( "layOutid为++" + layoutId );
//        setContentView( layoutId );
        setContentView(R.layout.activity_main_unity);
    }
}