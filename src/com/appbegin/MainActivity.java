package com.appbegin;

import android.os.Bundle;
import android.provider.Settings.Secure;

import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	private String mDeviceID;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDeviceID = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID);  
        MainService.setDeviceID(mDeviceID);
        MainService.actionStart(getApplicationContext());		
        super.loadUrl("file:///android_asset/www/index.html");
    }
}