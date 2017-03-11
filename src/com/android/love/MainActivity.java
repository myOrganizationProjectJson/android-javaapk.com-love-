package com.android.love;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.content.Loader.ForceLoadContentObserver;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity   {
private ImageView imageView;
private int sre[]={
		R.drawable.ab1,R.drawable.ab2,R.drawable.ab3,R.drawable.ab4,
		R.drawable.ab5,R.drawable.ab6,R.drawable.ab7,R.drawable.ab8,
		R.drawable.ab9,R.drawable.ab10,R.drawable.ab11,R.drawable.ab12,
		R.drawable.ab13,R.drawable.ab14,R.drawable.ab15,R.drawable.ab16,
		R.drawable.ab17,R.drawable.ab18,R.drawable.ab19,R.drawable.ab20,
		R.drawable.ab21,
		
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView=(ImageView)this.findViewById(R.id.imageView1);
		 Resources res = getResources();
	        Drawable drawable = res.getDrawable(R.drawable.bkcolor);
	        this.getWindow().setBackgroundDrawable(drawable);

    	 CountDownTimer  timer1=     new CountDownTimer(105000,5000) {
				int j=0;
				@Override
				public void onTick(long millisUntilFinished) {
					// TODO Auto-generated method stub
					imageView.setImageResource(sre[j]);
					imageView.refreshDrawableState();
					j++;
				}
				@Override
				public void onFinish() {
					// TODO Auto-generated method stub
					imageView.setImageResource(sre[j]);
					imageView.refreshDrawableState();
			//		j++;
				}
			};
				timer1.start();
	         }
	        

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

} 
