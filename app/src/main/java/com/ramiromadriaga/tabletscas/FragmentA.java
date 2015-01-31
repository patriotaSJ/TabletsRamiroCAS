package com.ramiromadriaga.tabletscas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
	private View fragmentView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		fragmentView = inflater.inflate(R.layout.fragment_a, container, false);
		
		return fragmentView;
	}
}
