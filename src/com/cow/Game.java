package com.cow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Game extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		Button b1 =(Button)findViewById(R.id.button1);
		Button b3 = (Button)findViewById(R.id.button3);
		Button b2 =(Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b1.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.button1)
			{Intent in= new Intent(getApplicationContext(),User.class);
	        
			
			startActivity(in);	
			}
		if(v.getId()==R.id.button2)
		{
			Intent i= new Intent(getApplicationContext(),Game2.class);
	        startActivity(i);	
		}
		
        if(v.getId()==R.id.button3)
        {Intent in= new Intent(getApplicationContext(),CowActivity.class);
        startActivity(in);
        }		
		
		// TODO Auto-generated method stub
		
	}

}
