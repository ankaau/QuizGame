package com.hp.games;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class Technology extends Activity implements OnClickListener, OnCheckedChangeListener
{
	TextView qs,sc,tv;
	Button next;
	RadioGroup rg;
	RadioButton r1,r2,r3,r4;
	String ans[] = {"44.1 kHz","74 mins","0xFFFF","Santa Clara, California"
					,"1972","lo","Santa Clara, California","1983","Backup file","Animation/movie file"};
	int score,choice;
	int n=1,i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bollywood);
		qs = (TextView)findViewById(R.id.textView3);
		sc = (TextView)findViewById(R.id.textView2);
		tv = (TextView)findViewById(R.id.textView1);
		tv.setText("Computer Quiz");
		rg = (RadioGroup)findViewById(R.id.radiogroup);
		rg.setOnCheckedChangeListener(this);
		next = (Button)findViewById(R.id.button1);
		r1 = (RadioButton)findViewById(R.id.radioButton1);
		r2 = (RadioButton)findViewById(R.id.radioButton2);
		r3 = (RadioButton)findViewById(R.id.radioButton3);
		r4 = (RadioButton)findViewById(R.id.radioButton4);
		next.setOnClickListener(this);
		qs.setText("The sampling rate, (how many samples per second are stored) for a CD is...?");
		r1.setText("48.4 kHz");
		r2.setText("22,050 Hz");
		r3.setText("44.1 kHz");
		r4.setText("48 kHz");
	}
	@Override
	public void onClick(View v)
	{
		n++;
		switch(choice)
		{
			case 1: if(ans[i]==r1.getText().toString())
					{
						score++;
						Toast.makeText(getApplicationContext(),"Correct Answer",2000).show();
					}
					else
						Toast.makeText(getApplicationContext(),"Incorrect Answer",2000).show();
					break;
			case 2: if(ans[i]==r2.getText().toString())
					{
						score++;
						Toast.makeText(getApplicationContext(),"Correct Answer",2000).show();
					}
					else
						Toast.makeText(getApplicationContext(),"Incorrect Answer",2000).show();
					break;
			case 3: if(ans[i]==r3.getText().toString())
					{
						score++;
						Toast.makeText(getApplicationContext(),"Correct Answer",2000).show();
					}
					else
						Toast.makeText(getApplicationContext(),"Incorrect Answer",2000).show();
					break;
			case 4: if(ans[i]==r1.getText().toString())
					{
						score++;
						Toast.makeText(getApplicationContext(),"Correct Answer",2000).show();
					}
					else
						Toast.makeText(getApplicationContext(),"Incorrect Answer",2000).show();
					break;
			default: Toast.makeText(getApplicationContext(),"No Answer",2000).show();
		}
		i++;
		switch(n)
		{
			case 2:ques2(); break;
			case 3:ques3(); break;
			case 4:ques4(); break;
			case 5:ques5(); break;
			case 6:ques6(); break;
			case 7:ques7(); break;
			case 8:ques8(); break;
			case 9:ques9(); break;
			case 10:ques10(); break;
			case 11:Intent i = new Intent(getApplicationContext(),End.class);
					i.putExtra("score",score);
					startActivity(i);
					finish();
			
		}
		rg.clearCheck();
	}
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId)
	{
		switch(checkedId)
		{
		case R.id.radioButton1 : choice = 1;
								 break;
		case R.id.radioButton2 : choice = 2;
		 						 break;
		case R.id.radioButton3 : choice = 3;
		 						 break;
		case R.id.radioButton4 : choice = 4;
								 break;
		}
		
	}
	void ques2()
	{
		sc.setText("Score :"+score);
		qs.setText("Compact discs, (according to the original CD specifications) hold how many minutes of music?");
		r1.setText("74 mins");
		r2.setText("56 mins");
		r3.setText("60 mins");
		r4.setText("90 mins");
	}
	void ques3()
	{
		sc.setText("Score :"+score);
		qs.setText("The base 10 (or decimal - our normal way of counting) number 65535 is represented in hexadecimal as...?");
		r1.setText("0xFFFFF");
		r2.setText("0xFFFF");
		r3.setText("0xFFF");
		r4.setText("0xFFFFFF");
	}
	void ques4()
	{
		sc.setText("Score :"+score);
		qs.setText("Where is the headquarters of Microsoft located?");
		r1.setText("Santa Clara, California");
		r2.setText("Tucson, Arizona");
		r3.setText("Richmond, Virginia");
		r4.setText("Redmond, Washington");
	}
	void ques5()
	{
		sc.setText("Score :"+score);
		qs.setText("In what year was the '@' chosen for its use in e-mail addresses?");
		r1.setText("1976");
		r2.setText("1972");
		r3.setText("1980");
		r4.setText("1984");
	}
	void ques6()
	{
		sc.setText("Score :"+score);
		qs.setText("What was the first ARPANET message?");
		r1.setText("lo");
		r2.setText("hello world");
		r3.setText("mary had a little lamb");
		r4.setText("cyberspace, the final frontier");
	}
	void ques7()
	{
		sc.setText("Score :"+score);
		qs.setText("Where is the headquarters of Intel located?");
		r1.setText("Redmond, Washington");
		r2.setText("Tucson, Arizona");
		r3.setText("Santa Clara, California");
		r4.setText("Richmond, Virginia");
	}
	void ques8()
	{
		sc.setText("Score :"+score);
		qs.setText("In which year was MIDI introduced?");
		r1.setText("1987");
		r2.setText("1983");
		r3.setText("1973");
		r4.setText("1977");
	}
	void ques9()
	{
		sc.setText("Score :"+score);
		qs.setText(".BAK' extension refers usually to what kind of file?");
		r1.setText("Backup file");
		r2.setText("Audio file");
		r3.setText("Animation/movie file");
		r4.setText("MS Encarta document");
	}
	void ques10()
	{ 
		sc.setText("Score :"+score);
		qs.setText("'.MPG' extension refers usually to what kind of file?");
		r1.setText("WordPerfect Document file");
		r2.setText("MS Office document");
		r3.setText("Animation/movie file");
		r4.setText("Image file");
	}
}
