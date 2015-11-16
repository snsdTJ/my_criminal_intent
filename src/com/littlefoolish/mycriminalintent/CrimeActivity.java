package com.littlefoolish.mycriminalintent;

import android.app.Activity;
import android.app.Fragment;
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
		
		/*
		 * FragmentManager fm = getFragmentManager();
		 * CrimeFragment crimeFragment = new CrimeFragment(); 
		 * FragmentTransaction ft =fm.beginTransaction(); 
		 * ft.add(R.id.fragment_container,crimeFragment); 
		 * ft.commit();
		 * 下面是最佳写法：
		 */
		FragmentManager fm = getFragmentManager();
		//如果在FragmentManager中已经保存了该fragment，那么就用这个fragment的容器id从FragmentManager中取出
		Fragment fragment = fm.findFragmentById(R.id.fragment_container);//这个资源id是存放fragment的容器视图资源ID
		if (fragment == null) {
			fragment = new CrimeFragment();
			fm.beginTransaction()
			     .add(R.id.fragment_container, fragment)
			       .commit();
		}

		
		
		
		
	}
}
