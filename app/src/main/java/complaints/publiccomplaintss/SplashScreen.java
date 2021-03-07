package complaints.publiccomplaintss;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {
	ProgressBar pb;
	Handler hh = new Handler();
	int prgst = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		pb = (ProgressBar) findViewById(R.id.pb1);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(prgst<100)
				{
					prgst+=1;
					hh.post(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							pb.setProgress(prgst);
							
						}
					});
					try
					{
						Thread.sleep(80);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				Intent i  = new Intent(SplashScreen.this,FrontBoard.class);
				startActivity(i);
				
			}
		}).start();
	}

	

}
