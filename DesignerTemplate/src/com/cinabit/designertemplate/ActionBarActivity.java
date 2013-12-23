package com.cinabit.designertemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ActionBarActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.template_action_bar, menu);
		return true;
	}
	
}
