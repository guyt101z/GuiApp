package com.example.phonegap;

import android.os.Bundle;
import org.apache.cordova.*;

import com.example.phonegap.R.drawable;

public class MainActivity extends DroidGap 
{
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("splashscreen", drawable.splash);
		super.loadUrl("file:///android_asset/www/index.html",5000);
	}
}