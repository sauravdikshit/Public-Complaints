package complaints.publiccomplaintss;


import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FrontBoard extends Activity {
	TextView officepage,loginpagee;
	ImageView apcicon;
	EditText dlgcode;
	Button backd,okd;
	Dialog dlfrnt;
	Button backdf,okdf;
	Dialog dlfrntf;
	

	@Override
	protected void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.front_board);
		    final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
	        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
	        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
	        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	       
		
		loginpagee =(TextView)findViewById(R.id.loginpage);
		officepage=(TextView)findViewById(R.id.officelog);
		dlfrnt = new Dialog(this);
		dlfrnt.setTitle("ONLY FOR OFFICEAL WORK");
		dlfrnt.setContentView(R.layout.frontboarddlog);
		dlgcode = (EditText) dlfrnt.findViewById(R.id.dlgfraant);
        okd = (Button) dlfrnt.findViewById(R.id.okfrnnhn);
        backd = (Button) dlfrnt.findViewById(R.id.dlbackdd);

        officepage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dlfrnt.show();
				
			}
		});
        backd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dlfrnt.dismiss();
				
			}
		});
		okd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String of = dlgcode.getText().toString();
				if(of.equals("OF0011"))
				{
					Intent i = new Intent(FrontBoard.this,Officalogin.class);
					startActivity(i);
					dlfrnt.dismiss();
					dlgcode.setText("");
					
				}
				
				else
				{
					Toast.makeText(FrontBoard.this, "Access Denied!", Toast.LENGTH_SHORT).show();
					dlfrnt.dismiss();
					dlgcode.setText("");
				}
				
			}
		});
		apcicon =(ImageView)findViewById(R.id.apcic);
		apcicon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 arg0.startAnimation(animRotate);
				
				Intent i = new Intent(FrontBoard.this,Login.class);
				startActivity(i);
				
			}
		});
		loginpagee.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(FrontBoard.this,Login.class);
				startActivity(i);
				
			}
		});
		dlfrntf = new Dialog(this);
		dlfrntf.setTitle("Are you sure to exit?");
		dlfrntf.setContentView(R.layout.frontbackdlg);
		okdf = (Button) dlfrntf.findViewById(R.id.frok);
	    backdf = (Button) dlfrntf.findViewById(R.id.frback);
		backdf.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					dlfrntf.dismiss();
					
				}
			});
			okdf.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
//						dlfrntf.dismiss();
					finish();
					moveTaskToBack(true);
						
				}
			});
		
				
	}
	
	public void onBackPressed()
	{
		dlfrntf.show();
	}

	

}
