package ru.vorobjev.rbcnews.activities;

import ru.vorobjev.rbknews.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	private static int SPLASH_TIME_OUT = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent i = new Intent(SplashActivity.this, WebsterActivity.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
	
	@Override
	public void onBackPressed() {
//		super.onBackPressed();
	}

}
