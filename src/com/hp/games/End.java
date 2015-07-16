package com.hp.games;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class End extends Activity 
{
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end);
		int score = getIntent().getIntExtra("score",0);
		tv = (TextView)findViewById(R.id.textView2);
		tv.setText("Total Score : " +score);
	}
	public void end(View v) 
	{
		finish();
	}
	
}
