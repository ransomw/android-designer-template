package com.cinabit.designertemplate;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class RowActivity extends Activity {

	private static final int NUM_LIST_ITEMS = 3;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    List<NullObject> nullObjectList = new ArrayList<NullObject>();
	    for (int i = 0; i < NUM_LIST_ITEMS; i++) {
	    	nullObjectList.add(new NullObject());
	    }
	    ListView listView = new ListView(this);
	    RowArrayAdapter rowArrayAdapter = new RowArrayAdapter(this, nullObjectList);
	    listView.setAdapter(rowArrayAdapter);
	    
	    setContentView(listView);
	}

}
