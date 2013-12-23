package com.cinabit.designertemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button activityButton;
	private Button rowButton;
	private Button dialogButton;
	private Button fragmentButton;
	private Button actionBarButton;
	private Button preferencesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityButton = (Button) findViewById(R.id.button_activity);
        rowButton = (Button) findViewById(R.id.button_row);
        dialogButton = (Button) findViewById(R.id.button_dialog);
        fragmentButton = (Button) findViewById(R.id.button_fragment);
        actionBarButton = (Button) findViewById(R.id.button_action_bar);
        preferencesButton = (Button) findViewById(R.id.button_preferences);
        
        activityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ActivityActivity.class));				
			}
		});
        rowButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, RowActivity.class));
			}
		});
        dialogButton.setOnClickListener(new View.OnClickListener() { 
			@Override
			public void onClick(View v) {
				(new DialogDialogFragment()).show(getFragmentManager(), null);			
			}
		});
        actionBarButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ActionBarActivity.class));
			}
		});
    }

}
