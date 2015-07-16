package com.hp.games;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity;
import android.content.Intent;

public class MainActivity extends ListActivity 
{
	String screens[] = {"Bollywood","Politics","Sports","Technology","EXIT"};
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		ArrayAdapter adpt = new ArrayAdapter(this,android.R.layout.simple_list_item_1,screens);
		setListAdapter(adpt);
		registerForContextMenu(getListView());
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) 
	{
		super.onListItemClick(l, v, position, id);
		if(screens[position].equals("EXIT"))
			finish();
		
		else
		{
			Toast t = Toast.makeText(this,"Clicked on :"+screens[position],Toast.LENGTH_SHORT);
			t.show();
			String s = "com.hp.games."+screens[position];
			try
			{
				Class c = Class.forName(s);
				Intent i = new Intent(this,c);
				startActivity(i);
			}
			catch(Exception e)
			{
				Toast.makeText(this,"Screen not yet designed.",Toast.LENGTH_LONG).show();
			}
		}
	}
}