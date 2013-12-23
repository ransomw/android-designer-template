package com.cinabit.designertemplate;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.template_fragment_activity);
	    
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment fragment = new MyFragment();
        fragmentTransaction.replace(R.id.frame_layout_fragment, fragment);
        fragmentTransaction.commit();
	}

	public static class MyFragment extends Fragment {
    	@Override
        public View onCreateView(LayoutInflater inflater,
        		ViewGroup container, Bundle savedInstanceState) {
    		return inflater.inflate(R.layout.template_fragment, container, false);
    	}
		
	}
}
