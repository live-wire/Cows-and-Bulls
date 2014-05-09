package com.cow;



import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.StaticLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ViewFlipper;

public class Game2 extends Activity implements OnItemSelectedListener {
	int bulls,cows=0;
	int i = 0;
	int hit=0;
	Random rr = new Random();
	int r=rr.nextInt(21);
	
	String[] finals = {"must","ship","rose","star","jump","neck","pink","blue","list","this","nest","rate","gate","cart","pain","dark","game","hint","calm","fast"};
	String finalss=finals[r];
	
	
	String fin1,fin2,fin3,fin4;
	{

fin1=finalss.substring(0,1).toString();
fin2=finalss.substring(1,2).toString();
fin3=finalss.substring(2,3).toString();
fin4=finalss.substring(3,4).toString();
	}	int a1,bc1,c1,d1;
	
	
	/*char a = finalss.charAt(0);
	char b=finalss.charAt(1);
	char c=finalss.charAt(2);
	char d=finalss.charAt(3);*/
	//String fin1=new Character(a).toString(),fin2=new Character(b).toString(),fin3=new Character(c).toString(),fin4=new Character(d).toString();
	
	StringBuffer fin = new StringBuffer(finalss);
    int a =fin.codePointAt(0);
	int b=fin.codePointAt(1);
	int c=fin.codePointAt(2);
	int d=fin.codePointAt(3);
	String att1,att2,att3,att4;
	
	String[] items ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method
		super.onCreate(savedInstanceState);
	setContentView(R.layout.game2);
	Toast.makeText(getApplicationContext(),"Start Guessing (HIT)" , Toast.LENGTH_LONG).show();

	
	Bundle extras = getIntent().getExtras();
	if(extras !=null) {
	String value = extras.getString("ass");
	finalss=value;
	fin1=finalss.substring(0,1).toString();
	fin2=finalss.substring(1,2).toString();
	fin3=finalss.substring(2,3).toString();
	fin4=finalss.substring(3,4).toString();
	StringBuffer fi= new StringBuffer(finalss);
    a =fi.codePointAt(0);
    b=fi.codePointAt(1);
	c=fi.codePointAt(2);
	d=fi.codePointAt(3);
	}
	
	Button b1,b2,b3,b4;
	
	

	
	    Spinner sp1=(Spinner)findViewById(R.id.spinner1);
		Spinner sp2=(Spinner)findViewById(R.id.spinner2);
		Spinner sp3=(Spinner)findViewById(R.id.spinner3);
		Spinner sp4=(Spinner)findViewById(R.id.spinner4);
	
	b1=(Button)findViewById(R.id.button1);
	b2=(Button)findViewById(R.id.button2);
	b3=(Button)findViewById(R.id.back);
	b4=(Button)findViewById(R.id.end);
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			//Toast.makeText(getApplicationContext(),fin1+fin2+fin3+fin4+a+b, Toast.LENGTH_LONG).show();
			if(att1==att2||att1==att3||att1==att4||att2==att3||att2==att4||att3==att4)
			{
				showDialog(0);
				
			}
			else
		{   			
				cows=0;
				bulls=0;
			if(att1==fin1||a==a1)
			{
			bulls++;
			
			}
		    if(att1==fin2||att1==fin3||att1==fin4||a==bc1||a==c1||a==d1)
		    cows++;
		    if(att2==fin2||b==bc1)
		    bulls++;
			if(att2==fin1||att2==fin3||att2==fin4||b==a1||b==c1||b==d1)
			cows++;
			if(att3==fin3||c==c1)
			bulls++;
		    if(att3==fin1||att3==fin2||att3==fin4||c==a1||c==bc1||c==d1)
		    cows++;
		    if(att4==fin4||d==d1)
			bulls++;
			if(att4==fin1||att4==fin2||att4==fin3||d==a1||d==bc1||d==c1)
		    cows++;
		    String bull=Integer.toString(bulls);
		    String cow=Integer.toString(cows);
			String x =bull+"bulls"+","+cow+"cows";	
			TextView tx=(TextView)findViewById(R.id.textView1);
			tx.setText(x);
			if(bulls==4)
			{int lmno=hit+1;
				Toast.makeText(getApplicationContext(), "YOU WINN !! Well Played..." , Toast.LENGTH_LONG).show();
				Toast.makeText(getApplicationContext(), "No. Of Tries = "+lmno , Toast.LENGTH_LONG).show();
				Intent i=new Intent(getApplicationContext(),CowActivity.class);
				startActivity(i);
			}
				hit++;
			if(hit==1)
			{
			TextView t1=(TextView)findViewById(R.id.one);
			TextView t2=(TextView)findViewById(R.id.oner);
			t1.setText(att1+att2+att3+att4);
			t2.setText(x);
			}
			else if(hit==2)
			{
				TextView t1=(TextView)findViewById(R.id.two);
				TextView t2=(TextView)findViewById(R.id.twor);
				t1.setText(att1+att2+att3+att4);
				t2.setText(x);
			}
			else if(hit==3)
			{
				TextView t1=(TextView)findViewById(R.id.three);
				TextView t2=(TextView)findViewById(R.id.threer);
				t1.setText(att1+att2+att3+att4);
				t2.setText(x);
			}
			else if(hit==4)
			{
				TextView t1=(TextView)findViewById(R.id.four);
				TextView t2=(TextView)findViewById(R.id.fourr);
				t1.setText(att1+att2+att3+att4);
				t2.setText(x);
			}
			else if(hit==5)
			{
				TextView t1=(TextView)findViewById(R.id.five);
				TextView t2=(TextView)findViewById(R.id.fiver);
				t1.setText(att1+att2+att3+att4);
				t2.setText(x);
			}
			else if(hit==6)
			{
				TextView t1=(TextView)findViewById(R.id.six);
				TextView t2=(TextView)findViewById(R.id.sixr);
				t1.setText(att1+att2+att3+att4);
				t2.setText(x);
			}
			else if(hit==7)
			{TextView t1=(TextView)findViewById(R.id.seven);
			TextView t2=(TextView)findViewById(R.id.sevenr);
			t1.setText(att1+att2+att3+att4);
			t2.setText(x);}
			else if(hit==8)
			{TextView t1=(TextView)findViewById(R.id.eight);
			TextView t2=(TextView)findViewById(R.id.eightr);
			t1.setText(att1+att2+att3+att4);
			t2.setText(x);}
			else if(hit==9)
			{TextView t1=(TextView)findViewById(R.id.nine);
			TextView t2=(TextView)findViewById(R.id.niner);
			t1.setText(att1+att2+att3+att4);
			t2.setText(x);}
			else if(hit==10)
			{TextView t1=(TextView)findViewById(R.id.ten);
			TextView t2=(TextView)findViewById(R.id.tenr);
			t1.setText(att1+att2+att3+att4);
			t2.setText(x);}
			else
			{Toast.makeText(getApplicationContext(), "YOU LOSE "+"ANSWER is :"+fin1+fin2+fin3+fin4  , Toast.LENGTH_LONG).show();
			Intent i=new Intent(getApplicationContext(),CowActivity.class);
			startActivity(i);
			}
		}
			
			
				
			
		}
	});
	b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			

			ViewFlipper vf = (ViewFlipper) findViewById(R.id.details);	
            vf.showNext();
		}
	});
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ViewFlipper vf = (ViewFlipper) findViewById(R.id.details);	
            vf.showPrevious();
		}
	});
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "The Answer is: "+fin1+fin2+fin3+fin4, Toast.LENGTH_LONG).show();
			Intent i=new Intent(getApplicationContext(),CowActivity.class);
			startActivity(i);
		}
	});
	
	sp1.setOnItemSelectedListener(this);
	sp2.setOnItemSelectedListener(this);
	sp3.setOnItemSelectedListener(this);
	sp4.setOnItemSelectedListener(this);
	
	ArrayAdapter aa = new ArrayAdapter(
			this,
			android.R.layout.simple_spinner_item, 
			items);
	aa.setDropDownViewResource(
			   android.R.layout.simple_spinner_dropdown_item);
	sp1.setAdapter(aa);
	sp2.setAdapter(aa);
	sp3.setAdapter(aa);
	sp4.setAdapter(aa);
	}
	 protected Dialog onCreateDialog(int id) {
	    	AlertDialog alertDialog=null;
	    	// TODO Auto-generated method stub
	    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
	    	builder.setMessage("Two characters can't be same!").setPositiveButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					dialog.dismiss();
				}
			});
	    	alertDialog=builder.create();
	    	alertDialog.show();
	        return alertDialog;
	    	//return super.onCreateDialog(id);
	    }
	


	



	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		if(arg0.getId()==R.id.spinner1)
		{
			
			att1=items[arg2];
			StringBuffer strt = new StringBuffer(att1);
			a1=strt.codePointAt(0);
			
		}
		if(arg0.getId()==R.id.spinner2)
		{
			att2=items[arg2];
			StringBuffer strt2 = new StringBuffer(att2);
			bc1=strt2.codePointAt(0);
		}
		if(arg0.getId()==R.id.spinner3)
		{
			att3=items[arg2];
			StringBuffer strt3 = new StringBuffer(att3);
			c1=strt3.codePointAt(0);
		}
		if(arg0.getId()==R.id.spinner4)
		{
			att4=items[arg2];
			StringBuffer strt4 = new StringBuffer(att4);
			d1=strt4.codePointAt(0);
		}
		
		// TODO Auto-generated method stub
		
		
	
		
		
	}

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
String s3=data.getStringExtra("ass").toString();
}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
		
	}

}
