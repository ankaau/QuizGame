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

public class Sports extends Activity implements OnClickListener, OnCheckedChangeListener
{
	TextView qs,sc,tv;
	Button next;
	RadioGroup rg;
	RadioButton r1,r2,r3,r4;
	String ans[] = {"South africa","1957","1946","Khong Kangjei"
					,"Manipur","Coaches","Circumnavigation of the earth by car",
					"4","1966","Weight Lifting"};
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
		tv.setText("Sports Quiz");
		rg = (RadioGroup)findViewById(R.id.radiogroup);
		rg.setOnCheckedChangeListener(this);
		next = (Button)findViewById(R.id.button1);
		r1 = (RadioButton)findViewById(R.id.radioButton1);
		r2 = (RadioButton)findViewById(R.id.radioButton2);
		r3 = (RadioButton)findViewById(R.id.radioButton3);
		r4 = (RadioButton)findViewById(R.id.radioButton4);
		next.setOnClickListener(this);
		qs.setText("Which of the following countries won the final of the triangular cricket series held in durban in februarry 1997 ?");
		r1.setText("India"); 
		r2.setText("New zealand");
		r3.setText("South africa");
		r4.setText("Zimbabwe");
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
		qs.setText("In which year did Milkha Singh win the first National title in the 400 m race?");
		r1.setText("1955");
		r2.setText("1956");
		r3.setText("1957");
		r4.setText("1970");
	}
	void ques3()
	{
		sc.setText("Score :"+score);
		qs.setText("When was Amateur Athletics Federation of India established?");
		r1.setText("1936");
		r2.setText("1946");
		r3.setText("1956");
		r4.setText("1966");
	}
	void ques4()
	{
		sc.setText("Score :"+score);
		qs.setText("Which of the following is a Manipuri version of Hockey?");
		r1.setText("Khong Kangjei");
		r2.setText("Hiyang Tanaba");
		r3.setText("Yubi Lakpi");
		r4.setText("Yubi-Lakpi");
	}
	void ques5()
	{
		sc.setText("Score :"+score);
		qs.setText("In which Indian state did the game of Polo originate?");
		r1.setText("Meghalaya");
		r2.setText("Rajasthan");
		r3.setText("Manipur");
		r4.setText("West Bengal");
	}
	void ques6()
	{
		sc.setText("Score :"+score);
		qs.setText("The 'Dronacharya Award' is given to...?");
		r1.setText("Sportsmen");
		r2.setText("Coaches");
		r3.setText("Umpires");
		r4.setText("Sports Editors");
	}
	void ques7()
	{
		sc.setText("Score :"+score);
		qs.setText("With which sport is the 'Choudhury Trophy' associated?");
		r1.setText("Golf");
		r2.setText("Circumnavigation of the earth by car");
		r3.setText("Formula One racing");
		r4.setText("Buggy-Jumping");
	}
	void ques8()
	{
		sc.setText("Score :"+score);
		qs.setText("How many gold medals did P.T.Usha win in the 1986 Seoul Asian Games?");
		r1.setText("1");
		r2.setText("2");
		r3.setText("3");
		r4.setText("4");
	}
	void ques9()
	{
		sc.setText("Score :"+score);
		qs.setText("India reached the final of the Davis Cup for the first time in...?");
		r1.setText("1964");
		r2.setText("1966");
		r3.setText("1970");
		r4.setText("1974");
	}
	void ques10()
	{
		sc.setText("Score :"+score);
		qs.setText("The name Kunjarani Devi is associated with...?");
		r1.setText("Weight Lifting");
		r2.setText("Target shooting");
		r3.setText("Athletics");
		r4.setText("Swimming");
	}
}
