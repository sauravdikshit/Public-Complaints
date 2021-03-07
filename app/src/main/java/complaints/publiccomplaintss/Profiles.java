package complaints.publiccomplaintss;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profiles extends Activity {
	TextView id,name,number,sex,district;
	TextView idv,namev,numberv,sexv,districtv;
	ImageView photoo;
	String unm,pht,pnt,sxt,dsts,nm;
	Bitmap btimg;
	Button back;
	MyDataBase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_complantess);
		db = new MyDataBase(this);
//		idv =(TextView)findViewById(R.id.idprof);
//		namev=(TextView)findViewById(R.id.nameprof);
//		numberv=(TextView)findViewById(R.id.phonprof);
//		sexv=(TextView)findViewById(R.id.sxprof);
//		districtv=(TextView)findViewById(R.id.dstprof);
		id =(TextView)findViewById(R.id.idproi);
		name=(TextView)findViewById(R.id.nameproi);
		number=(TextView)findViewById(R.id.phonproi);
		sex=(TextView)findViewById(R.id.sxproi);
		district=(TextView)findViewById(R.id.dstproi);
		photoo=(ImageView)findViewById(R.id.imageproi);
		back =(Button)findViewById(R.id.backproi);
		
		
		Intent i = getIntent();
		nm = i.getStringExtra("nm");
		Toast.makeText(Profiles.this, nm, Toast.LENGTH_SHORT).show();
		name.setText(nm);
//		pnt = db.getnumber(nm);
//		number.setText(pnt);
//		sxt = db.getsex(nm);
//		sex.setText(sxt);
//		dsts = db.getdistrict(nm);
//		district.setText(dsts);
//		pht= db.getphoto(nm);
//		btimg  = StringtoBitmap(pht);
//		photoo.setImageBitmap(btimg);
	
	
         back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Profiles.this,AllComplaint.class);
				startActivity(i);
				
			}
		});
	}

	

}
