package com.xerando.gitfromol;

import com.xerando.gitit.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity
{
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		// 16/2 19:17
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.main, menu );
		return true;
	}

}
