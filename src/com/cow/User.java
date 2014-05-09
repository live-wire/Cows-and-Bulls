package com.cow;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class User extends Activity implements OnItemSelectedListener  {
	
	String ch1,ch2,ch3,ch4;
	String[] items ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user);
		Button btn1=(Button)findViewById(R.id.proceed);
		Spinner s1,s2,s3,s4;
		s1=(Spinner)findViewById(R.id.spinnero);
		s2=(Spinner)findViewById(R.id.spinnert);
		s3=(Spinner)findViewById(R.id.spinnerth);
		s4=(Spinner)findViewById(R.id.spinnerf);
	    btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			if(ch1==ch2||ch1==ch3||ch1==ch4||ch2==ch3||ch2==ch4||ch3==ch4)
			{
				showDialog(1);
			}	
				else
			{ String finall = ch1+ch2+ch3+ch4;
				Intent intent = new Intent(getApplicationContext(),Game2.class);
				intent.putExtra("ass", finall);
				startActivity(intent);
			}
			}
		});
	    s1.setOnItemSelectedListener(this);
		s2.setOnItemSelectedListener(this);
		s3.setOnItemSelectedListener(this);
		s4.setOnItemSelectedListener(this);
		
		ArrayAdapter aaa = new ArrayAdapter(
				this,
				android.R.layout.simple_spinner_item, 
				items);
		aaa.setDropDownViewResource(
				   android.R.layout.simple_spinner_dropdown_item);
		s1.setAdapter(aaa);
		s2.setAdapter(aaa);
		s3.setAdapter(aaa);
		s4.setAdapter(aaa);
		
		
		
		
		
		
		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.spinnero)
		{ch1=items[arg2];
			}
		if(arg0.getId()==R.id.spinnert)
		{ch2=items[arg2];
			}
		if(arg0.getId()==R.id.spinnerth)
		{ch3=items[arg2];
			}
		if(arg0.getId()==R.id.spinnerf)
		{ch4=items[arg2];
			}
		
	
	
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
	

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
