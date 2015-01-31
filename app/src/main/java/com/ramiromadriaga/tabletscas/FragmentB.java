package com.ramiromadriaga.tabletscas;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {
	private View fragmentView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		fragmentView = inflater.inflate(R.layout.fragment_b, container, false);

		return fragmentView;
	}

}
