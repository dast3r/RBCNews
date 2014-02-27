package ru.vorobjev.rbcnews.activities;

import ru.vorobjev.rbcnews.constants.C;
import ru.vorobjev.rbknews.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewActivity extends FragmentActivity {
	
	WebView myWebView;

	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.view);
		
		setupActionBar();
		
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		initWebView();
	}
	
	
	
	@SuppressLint("SetJavaScriptEnabled")
	private void initWebView() {
		String link = getIntent().getExtras().getString(C.LINK); 
		myWebView = (WebView) findViewById(R.id.webview);
		myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl(link); 
		myWebView.getSettings().setJavaScriptEnabled(true);
	}
	
	private void setupActionBar() {
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
	}

}
