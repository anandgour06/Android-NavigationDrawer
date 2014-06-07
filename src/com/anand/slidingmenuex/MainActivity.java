package com.anand.slidingmenuex;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;

public class MainActivity extends FragmentActivity {

	private DrawerLayout  mPane;
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentManager manager = getSupportFragmentManager();
		mPane = (DrawerLayout)findViewById(R.id.pane);
		
		manager.beginTransaction()
        .add(R.id.contain_fragment, new FragmentDrawerLeft()).commit();
		
		manager.beginTransaction()
        .add(R.id.contain_drawer_left, new FragmentMain()).commit();
		
		manager.beginTransaction()
        .add(R.id.contain_drawer_right, new FragmentDrawerRight()).commit();
		 
	}
}
