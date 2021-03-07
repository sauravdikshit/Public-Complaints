package complaints.publiccomplaintss;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;


import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	EditText loginid,password;
	CheckBox chek;
	Button login;
	TextView singup;
	String nm,ps,dbps;
	MyDataBase db;
	ProgressDialog pDialog;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen1);
		
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        
		db = new MyDataBase(this);
		chek =(CheckBox)findViewById(R.id.check);
		loginid =(EditText)findViewById(R.id.loginedt);
		login =(Button)findViewById(R.id.login_screen1);
		password =(EditText)findViewById(R.id.passedt);
		singup =(TextView)findViewById(R.id.singup);
		chek.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(!isChecked) 
				{
					password.setTransformationMethod(PasswordTransformationMethod.getInstance());
				}
				else 
					password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
				
			}
		});
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				new AuthenticatingUser().execute();
			    
				
			}
		});

		singup.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Login.this,Regristration.class);
				startActivity(i);

			}
		});
		


	}
	 class AuthenticatingUser extends AsyncTask<String, String, String> 
	 	{
	    	 protected void onPreExecute() {
	             super.onPreExecute();
	             pDialog = new ProgressDialog(Login.this);
	             pDialog.setMessage("Authenticating User..Please wait for a while!");
	             pDialog.setIndeterminate(false);
	             pDialog.setCancelable(false);
	             pDialog.show();
	         }
	    	 protected String doInBackground(String... arg0) 
	    	 {
	    		 try {
						
						nm = loginid.getText().toString();
						ps = password.getText().toString();
						dbps =db.getpassword(nm);
						if(nm.trim().length()>0 && ps.trim().length()>0 && ps.equals(dbps))
						{
							 runOnUiThread(new Runnable() 
				                {
					                public void run() 
					                {
					                	Toast.makeText(Login.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
										Intent i =new Intent(Login.this,AllComplaint.class);
										i.putExtra("nm", nm);
										startActivity(i);
					                }
					            });
							
							
						}
						
						else
						{
							runOnUiThread(new Runnable() 
			                {
				                public void run() 
				                {
				                	Toast.makeText(Login.this, "Login Failed!", Toast.LENGTH_SHORT).show();
									
				                }
				            });
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						Toast.makeText(Login.this, "Something went wrong..try again!", Toast.LENGTH_SHORT).show();
					}
					
					
	 			return null;
	    	 }
	 		}
	 public void onBackPressed()
		{
			Intent i = new Intent(Login.this,FrontBoard.class);
//			i.putExtra("nm", nm);
			startActivity(i);
		}


}
