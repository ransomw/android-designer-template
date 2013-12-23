package com.cinabit.designertemplate;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogDialogFragment extends DialogFragment {

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View dialogView = inflater.inflate(R.layout.template_dialog, container);
        getDialog().setTitle("Dialog Template");
        return dialogView;
    }
}
