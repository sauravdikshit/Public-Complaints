package complaints.publiccomplaintss;

import java.io.ByteArrayOutputStream;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends Activity {
	TextView id,name,number,sex,district;
	TextView idv,namev,numberv,sexv,districtv;
	ImageView photoo;
	String unm,pht,pnt,sxt,dsts,nm,uid;
	Bitmap btimg;
	Button back;
	MyDataBase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profiles);
		db = new MyDataBase(this);
//		idv =(TextView)findViewById(R.id.idprof);
//		namev=(TextView)findViewById(R.id.nameprof);
//		numberv=(TextView)findViewById(R.id.phonprof);
//		sexv=(TextView)findViewById(R.id.sxprof);
//		districtv=(TextView)findViewById(R.id.dstprof);
		id =(TextView)findViewById(R.id.idpro);
		name=(TextView)findViewById(R.id.namepro);
		number=(TextView)findViewById(R.id.phonpro);
		sex=(TextView)findViewById(R.id.sxpro);
		district=(TextView)findViewById(R.id.dstpro);
		photoo=(ImageView)findViewById(R.id.imagepro);
		back =(Button)findViewById(R.id.backpro);
//		Toast.makeText(Profile.this, nm, Toast.LENGTH_SHORT).show();
		
		Intent i = getIntent();
		nm = i.getStringExtra("nm");
		name.setText(nm);
		pnt = db.getnumber(nm);
		number.setText(pnt);
		sxt = db.getsex(nm);
		sex.setText(sxt);
		dsts = db.getdistrict(nm);
		district.setText(dsts);
		uid = db.getid(nm);
		id.setText(uid);
		pht= db.getphoto(nm);
		btimg  = StringtoBitmap(pht);
		photoo.setImageBitmap(btimg);
	
	
         back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Profile.this,AllComplaint.class);
				i.putExtra("nm", nm);
				startActivity(i);
				
			}
		});
 	}
	 public Bitmap StringtoBitmap(String str)
	{
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			
			byte[] ebte = Base64.decode(str, Base64.DEFAULT);
			Bitmap bmp= BitmapFactory.decodeByteArray(ebte, 0, ebte.length);
			bmp.compress(Bitmap.CompressFormat.PNG, 100, out);
			return bmp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	
}
