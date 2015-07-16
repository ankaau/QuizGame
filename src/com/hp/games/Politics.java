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

public class Politics extends Activity implements OnClickListener, OnCheckedChangeListener
{
	TextView qs,sc,tv;
	Button next;
	RadioGroup rg;
	RadioButton r1,r2,r3,r4;
	String ans[] = {"The Bharat Ratna","Avul Pakir Jainulabdeen",
					"President of India","Dr B.R. Ambedkar"
					,"Lady Edwina Mountbatten","Election Commission",
					"Poti Sriramulu","Commission for Center-State Relations",
					"11","President"};
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
		tv.setText("Politics Quiz");
		rg = (RadioGroup)findViewById(R.id.radiogroup);
		rg.setOnCheckedChangeListener(this);
		next = (Button)findViewById(R.id.button1);
		r1 = (RadioButton)findViewById(R.id.radioButton1);
		r2 = (RadioButton)findViewById(R.id.radioButton2);
		r3 = (RadioButton)findViewById(R.id.radioButton3);
		r4 = (RadioButton)findViewById(R.id.radioButton4);
		next.setOnClickListener(this);
		qs.setText("With what honour has Dr. Kalam been decorated, the highest honour that an Indian citizen can receive?");
		r1.setText("Arjuna Award");
		r2.setText("Padma Bhushan");
		r3.setText("The Bharat Ratna");
		r4.setText("Padma Vibhushan");
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
		qs.setText("What is the full form of the 'APJ' in Dr. Kalam's name?");
		r1.setText("Ahmed Panthwawala Jain ");
		r2.setText("Avul Pakir Jainulabdeen");
		r3.setText("Ali Ponnuswamy Jampiru");
		r4.setText("Akbar Panneer Jalant");
	}
	void ques3()
	{
		sc.setText("Score :"+score);
		qs.setText("Into what position was Dr. Kalam sworn in on 25 July, 2002?");
		r1.setText("Prime Minister of India");
		r2.setText("Election-Commissioner of India");
		r3.setText("Secretary-General of the Commonwealth ");
		r4.setText("President of India");
	}
	void ques4()
	{
		sc.setText("Score :"+score);
		qs.setText("Who said, 'those who attack Congress and spare Nehru are fools. They do not know the A.B.C of politics ... '?");
		r1.setText("Dr B.R. Ambedkar");
		r2.setText("Atal Behari Vajpayee");
		r3.setText("Shyama Prasad Mukherji");
		r4.setText("Laloo Prasad Yadav");
	}
	void ques5()
	{
		sc.setText("Score :"+score);
		qs.setText("Jawarhal Nehru was famous for his affair with a married woman;Who was this lady?");
		r1.setText("Mrs. Kasturba Gandhi");
		r2.setText("Mrs. Rosie Cripps");
		r3.setText("Mrs. Lara Cripps");
		r4.setText("Lady Edwina Mountbatten");
	}
	void ques6()
	{
		sc.setText("Score :"+score);
		qs.setText("In which high-security area in Delhi did two bomb blasts take place on Wednesday?");
		r1.setText("Vayu Bhavan");
		r2.setText("South Block-Sena Bhawan area");
		r3.setText("Rashtrapati Bhavan");
		r4.setText("Sunder Bhawan");
	}
	void ques7()
	{
		sc.setText("Score :"+score);
		qs.setText("Who among the following was NOT the Chief Minister of Madras state or the Tamil Nadu?");
		r1.setText("C.Rajagopalachari");
		r2.setText("C.Annadurai");
		r3.setText("M.G.Ramachandran");
		r4.setText("Poti Sriramulu");
	}
	void ques8()
	{
		sc.setText("Score :"+score);
		qs.setText("Which of the following is not a Constitutionally mandated body?");
		r1.setText("National SC/ST Commission");
		r2.setText("Planning Commission");
		r3.setText("Commission for Center-State Relations");
		r4.setText("1Election Commission");
	}
	void ques9()
	{
		sc.setText("Score :"+score);
		qs.setText("How many judges sat on the bench to hear the landmark case of Keshavananda Bharati v. State of Kerala in 1973?");
		r1.setText("7");
		r2.setText("9");
		r3.setText("13");
		r4.setText("11");
	}
	void ques10()
	{ 
		sc.setText("Score :"+score);
		qs.setText("Which of the following Constitutional posts is enjoyed for a fixed term?");
		r1.setText("President");
		r2.setText("Chief Justice");
		r3.setText("Prime Minister");
		r4.setText("Governor");
	}
}
