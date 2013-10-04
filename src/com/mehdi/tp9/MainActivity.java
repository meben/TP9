package com.mehdi.tp9;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	private TabHost tabhost;
	private TabSpec tabspec;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = new Intent(this, Tabactivity.class);
		
		tabhost = getTabHost();
		
		intent.putExtra("valeur", "tab1: bonjour");
		tabspec = tabhost.newTabSpec("UN").setIndicator("UN").setContent(intent);
		tabhost.addTab(tabspec);
		

		intent.putExtra("valeur", "tab2: bonjour");
		tabspec = tabhost.newTabSpec("DEUX").setIndicator("DEUX").setContent(intent);
		tabhost.addTab(tabspec);	
		
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
