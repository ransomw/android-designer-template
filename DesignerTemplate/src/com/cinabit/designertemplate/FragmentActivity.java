package com.cinabit.designertemplate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FragmentActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    TextView tv = new TextView(this);
	    tv.setText("fragment template unimplemented");
	    setContentView(tv);
	}

}
