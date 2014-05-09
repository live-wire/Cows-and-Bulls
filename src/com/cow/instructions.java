package com.cow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class instructions extends Activity implements OnClickListener {
	public static Class<?> java;

Intent i;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		System.out.print("reached");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructions);
		
		
		
		
	Button b1=(Button)findViewById(R.id.button1);
b1.setOnClickListener(this);


}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	if(v.getId()==R.id.button1)
	{
		Toast.makeText(getApplicationContext(), "wazza",5000);
	i=new Intent(getApplicationContext(),CowActivity.class);
	startActivity(i);
	}
		}
	

}
