package com.littlefoolish.mycriminalintent;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class CrimeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime);
		
		FragmentManager fm = getFragmentManager();
		CrimeFragment crimeFragment = new CrimeFragment();
		FragmentTransaction ft = fm.beginTransaction();
		ft.add(R.id.fragment_container, crimeFragment);
		ft.commit();
		
	}
}
