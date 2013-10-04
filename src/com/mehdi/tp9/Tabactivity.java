package com.mehdi.tp9;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Tabactivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabactivity);
		
		String val = getIntent().getStringExtra("valeur");
		TextView textview = (TextView)findViewById(R.id.edittext);
		textview.setText(val);
		
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tabactivity, menu);
		return true;
	}

}
