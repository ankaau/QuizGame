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

public class Bollywood extends Activity implements OnClickListener, OnCheckedChangeListener
{
	TextView qs,sc;
	Button next;
	RadioGroup rg;
	RadioButton r1,r2,r3,r4;
	String ans[] = {"Photographers","Top of a water tank","Ayub Khan","Che din ladki in"
					,"Mohan","28","Pardes","Mohini","Pehla Nasha","1994"};
	int score,choice;
	int n=1,i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bollywood);
		qs = (TextView)findViewById(R.id.textView3);
		sc = (TextView)findViewById(R.id.textView2);
		rg = (RadioGroup)findViewById(R.id.radiogroup);
		rg.setOnCheckedChangeListener(this);
		next = (Button)findViewById(R.id.button1);
		r1 = (RadioButton)findViewById(R.id.radioButton1);
		r2 = (RadioButton)findViewById(R.id.radioButton2);
		r3 = (RadioButton)findViewById(R.id.radioButton3);
		r4 = (RadioButton)findViewById(R.id.radioButton4);
		next.setOnClickListener(this);
		qs.setText("What are John Abraham and Akshay Kumar's professions in Garam Masala?");
		r1.setText("Reporter");
		r2.setText("Photographers");
		r3.setText("Professors");
		r4.setText("Lawyers");
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
		qs.setText("From where does Veeru propose to Basanti in Sholay?");
		r1.setText("Top of a roof ");
		r2.setText("Top of a ladder");
		r3.setText("Top of a hill");
		r4.setText("Top of a water tank");
	}
	void ques3()
	{
		sc.setText("Score :"+score);
		qs.setText("Who, apart from Aamir Khan, wants to marry Preity Zinta in Dil Chahta Hai?");
		r1.setText("Shah Rukh Khan");
		r2.setText("Ayub Khan");
		r3.setText("Saif Ali Khan ");
		r4.setText("Akshay Khanna");
	}
	void ques4()
	{
		sc.setText("Score :"+score);
		qs.setText("What is Shah Rukh's mantra to woo a girl in Kal Ho Naa Ho?");
		r1.setText("Saat din ladki in");
		r2.setText("Ek din ladki in");
		r3.setText("Che din ladki in");
		r4.setText("Do din ladki in");
	}
	void ques5()
	{
		sc.setText("Score :"+score);
		qs.setText("Who plays the blind friend in the 1964 Dosti?");
		r1.setText("Mohan");
		r2.setText("Dinu");
		r3.setText("Ramu");
		r4.setText("Shamu");
	}
	void ques6()
	{
		sc.setText("Score :"+score);
		qs.setText("Anupam Kher's real age when he played a 65-year-old retired principal in Saaransh was?");
		r1.setText("28");
		r2.setText("29");
		r3.setText("42");
		r4.setText("43");
	}
	void ques7()
	{
		sc.setText("Score :"+score);
		qs.setText("The catch-line 'American dream, Indian soul' was of the film...?");
		r1.setText("Aa Ab Laut Chalein");
		r2.setText("Indian");
		r3.setText("Pardes");
		r4.setText("American Desi");
	}
	void ques8()
	{
		sc.setText("Score :"+score);
		qs.setText("Madhuri Dixit's name in N Chandra's 'Tezaab' was...?");
		r1.setText("Mohini");
		r2.setText("Madhuri");
		r3.setText("Pooja");
		r4.setText("Ritu");
	}
	void ques9()
	{
		sc.setText("Score :"+score);
		qs.setText("Which of these films was Ashutosh Gowariker's directorial debut?");
		r1.setText("Pehla Nasha");
		r2.setText("Swades");
		r3.setText("Afsana Pyaar Ka");
		r4.setText("Jung");
	}
	void ques10()
	{
		sc.setText("Score :"+score);
		qs.setText("Aishwarya Rai was crowned Miss World in which year?");
		r1.setText("1992");
		r2.setText("1993");
		r3.setText("1994");
		r4.setText("1995");
	}
}
