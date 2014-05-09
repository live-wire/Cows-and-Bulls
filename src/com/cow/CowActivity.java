package com.cow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CowActivity extends Activity implements OnClickListener {
    public static Class<?> java;
Button btn2,btn1;
String g;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    btn2=(Button)findViewById(R.id.button2);
    btn1=(Button)findViewById(R.id.button1);
    btn1.setOnClickListener(this);
   btn2.setOnClickListener(this);
    
    }

	@Override
	public void onClick(View v) {
		
		if(v.getId()==R.id.button1)
			{
			Intent intent = new Intent(getApplicationContext(),Game.class);
			startActivity(intent);
			
			}
		
		
		if(v.getId()==R.id.button2)
		{	Intent intent = new Intent(getApplicationContext(),instructions.class);
		startActivity(intent);
		}
			
		
		// TODO Auto-generated method stub
		
	}
}