/* 
 * HXH Create at 2015-4-24 上午9:50:09 
 */
package com.hxh.htmlopenapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

/**
 * @author HXH
 * @created 2015-4-24 上午9:50:09
 * @类说明 TODO
 * @version 2015-4-24 [V TODO] 新增
 */
public class MainActivity extends Activity {
	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (Intent.ACTION_VIEW.equals(getIntent().getAction())) {
			Intent intent = getIntent();

			String scheme = intent.getScheme();

			Uri uri = intent.getData();

			Log.e(TAG, "scheme: " + scheme);
			Log.e(TAG, "path: " + uri.getPath());
			Log.e(TAG, "Host: " + uri.getHost());
			Log.e(TAG, "name: " + uri.getQueryParameter("name"));
			Log.e(TAG, "age: " + uri.getQueryParameter("age"));
		}

		setContentView(R.layout.activity_main);
		WebView webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setDefaultTextEncodingName("utf-8");
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/test.html");
	}
}
