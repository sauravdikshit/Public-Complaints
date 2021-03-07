package complaints.publiccomplaintss;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Officalogin extends Activity {
	ImageView oback;
	EditText passwordl,phoned;
	TextView signupl;
	Button login;
	String onm,ops,odbps,odst;
	MyDataBase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.officalogin);
		db = new MyDataBase(this);
		oback =(ImageView)findViewById(R.id.offfbacka);
		phoned =(EditText)findViewById(R.id.passwordllla);
		passwordl =(EditText)findViewById(R.id.offpassa);
		signupl =(TextView)findViewById(R.id.singupofffca);
		login =(Button)findViewById(R.id.offflogina);
		signupl.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i =new Intent(Officalogin.this,OfficerRgester.class);
				startActivity(i);
				
			}
		});
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				onm = phoned.getText().toString();
				ops = passwordl.getText().toString();
				odbps =db.getOFFpassword(onm);
				odst = db.getOFFdstt(onm);
				
				if(onm.trim().length()>0 && ops.trim().length()>0 && ops.equals(odbps))
				{
					Toast.makeText(Officalogin.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
					Intent i = new Intent(Officalogin.this,Manegement.class);
					i.putExtra("onm", onm);
					i.putExtra("odst", odst);
					startActivity(i);
				}
				
				else
				{
					Toast.makeText(Officalogin.this, "Login Failed!", Toast.LENGTH_SHORT).show();
				}
				
				
				
			}
		});
				
				

		oback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Officalogin.this,FrontBoard.class);
				startActivity(i);
				
			}
		});
	}
	public void onBackPressed()
	{
		Intent i = new Intent(Officalogin.this,FrontBoard.class);
		startActivity(i);
	}
	

}
