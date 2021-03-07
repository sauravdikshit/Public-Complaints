package complaints.publiccomplaintss;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AllComplaint extends Activity {
	ImageView mycomplaintei,hiscomplaintei,solvedi,progress,about,profile;
	TextView mycomplaintet,hiscomplaintet,solvedt,progresst;
	String nm;
	TextView allcmpnmtxt;
	String nm1,nm2;
	View v = null;
	Animation animAlpha,animAlpha2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.allcomplaints);
		v = new View(this);
		animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		animAlpha2 = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
		v.startAnimation(animAlpha2);
		Intent gt= getIntent();
		nm = gt.getStringExtra("nm");
//		Toast.makeText(AllComplaint.this, nm, Toast.LENGTH_SHORT).show();
		mycomplaintei =(ImageView)findViewById(R.id.mycompimj);
		hiscomplaintei =(ImageView)findViewById(R.id.comhisimj);
		allcmpnmtxt =(TextView) findViewById(R.id.allcmpnmtxt);
		allcmpnmtxt.setText(nm);
		solvedi =(ImageView)findViewById(R.id.solvcompi);
		progress =(ImageView)findViewById(R.id.progressi);
		mycomplaintet =(TextView)findViewById(R.id.newcomp);
		hiscomplaintet =(TextView)findViewById(R.id.mycomp);
		solvedt =(TextView)findViewById(R.id.solvcompt);
		progresst =(TextView)findViewById(R.id.progresst);
		profile =(ImageView)findViewById(R.id.profilex);
		about =(ImageView)findViewById(R.id.aboutx);
		
		profile.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
			nm1= allcmpnmtxt.getText().toString();	
//			Toast.makeText(AllComplaint.this, nm1, Toast.LENGTH_SHORT).show();
			Intent i = new Intent(AllComplaint.this,Profile.class);
			i.putExtra("nm", nm1);
			startActivity(i);
			}
		});
		
        solvedt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				Intent i = new Intent(AllComplaint.this,Solved.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
        solvedi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				nm2 = allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,Solved.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
        progresst.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				nm2 = allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,Prosessing.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
        progress.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				nm2 = allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,Prosessing.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
		hiscomplaintei.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				nm2 = allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,CompHis.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
            hiscomplaintet.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				nm2 = allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,CompHis.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});

		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				String nm2= allcmpnmtxt.getText().toString();
				Intent i = new Intent(AllComplaint.this,About.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
		mycomplaintei.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				String nm2= allcmpnmtxt.getText().toString();
				Intent i=new Intent(AllComplaint.this,MyComplaintes.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
            mycomplaintet.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				String nm2= allcmpnmtxt.getText().toString();
				Intent i=new Intent(AllComplaint.this,MyComplaintes.class);
				i.putExtra("nm2", nm2);
				startActivity(i);
				
			}
		});
	}
	public void onBackPressed()
	{
		Intent i = new Intent(AllComplaint.this,Login.class);
		startActivity(i);
	}
           
		
}


	


