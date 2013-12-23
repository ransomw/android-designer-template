package com.cinabit.designertemplate;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

class RowArrayAdapter extends ArrayAdapter<NullObject> {

	private Context context;
	
	public RowArrayAdapter(Context context, List<NullObject> values) {
		super(context, R.layout.template_row, values);
		this.context = context;
	}
	
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.template_row, parent, false);
    	return rowView;
    }
	
}
