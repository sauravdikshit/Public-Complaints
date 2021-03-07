package complaints.publiccomplaintss;

import java.io.ByteArrayOutputStream;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Regristration extends Activity {
	EditText unmedt,upsedt,phon;
	TextView singin;
	Button singup,camera;
	ImageView photo;
	EditText chkpass;
	String unm,ups,chkps,pn;
	String ph = null;
	ArrayAdapter sexadp,dictadp;
	Bitmap pht,pht1;
	Spinner sexx,districts;
	private int requestcode =1;
	private static int RESULT_LOAD_IMAGE = 2;
	Dialog othdlge;
	Button otoke,otcne,otmsge;
	private String[] sexxx ={"Select","Male","Female"};
	private String[] dict ={"Select","Patna","Rohtas","Bhagalpur","Munger","Bhojpur","Muzaffarpur","Siwan","Gopalganj",
			"Saran","Aurangabad","Vaishali","Buxar","Begusarai","Darbhanga","Jehanabad",
			"Newada","Saharsa","Khagaria","Sitamarhi","Nalanda","Gaya","Purnia","Purba Champaran",
			"Lakhisarai","Madhubani","Katihar","Madhepura","Banka","Sheohar","Supaul","Pashchim Champaran",
			"Sheikhpura","Araria","Samastipur","Jamui","Kaimur(Bhabua)","Kishanganj","Arwal"};
	MyDataBase db;
	String sexnm,dsttnm;
	char a,b,c,d,e,f;
	String aa,bb,cc,dd,ee,ff,idstr;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);
		
		final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		
		db = new MyDataBase(this);
		sexx =(Spinner)findViewById(R.id.sex);
		districts =(Spinner)findViewById(R.id.dist_spin);
		unmedt =(EditText)findViewById(R.id.nmedt);
		upsedt =(EditText)findViewById(R.id.npass);
		photo =(ImageView)findViewById(R.id.photox);
		phon =(EditText)findViewById(R.id.phedt);
		camera =(Button)findViewById(R.id.cambtn);
		chkpass =(EditText)findViewById(R.id.cpass);
		singup =(Button)findViewById(R.id.registerbtn);
		singin =(TextView)findViewById(R.id.login_s2);
		pht1 = BitmapFactory.decodeResource(getResources(), R.drawable.photopro);
		othdlge = new Dialog(this);
		othdlge.setTitle("Choose One");
		othdlge.setContentView(R.layout.cameradlge);
		otmsge = (Button) othdlge.findViewById(R.id.camdlge);
		otoke = (Button) othdlge.findViewById(R.id.galdlge);
		otcne=(Button) othdlge.findViewById(R.id.canclldlge);
		otoke.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

				startActivityForResult(i, RESULT_LOAD_IMAGE);
				othdlge.dismiss();

			}
		});
		otmsge.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

				startActivityForResult(i,requestcode);
				othdlge.dismiss();

			}
		});
		otcne.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				othdlge.dismiss();

			}
		});
		sexadp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sexxx);
		sexx.setAdapter(sexadp);
		dictadp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dict);
		districts.setAdapter(dictadp);
		camera.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 v.startAnimation(animAlpha);

				othdlge.show();

			}
		});



		singin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Regristration.this,Login.class);
				startActivity(i);


			}
		});
		sexx.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				sexnm = (String) parent.getItemAtPosition(position);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		districts.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				dsttnm = (String) parent.getItemAtPosition(position);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		singup.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 arg0.startAnimation(animAlpha);
				try {
					unm = unmedt.getText().toString();
					ups = upsedt.getText().toString();
					pn = phon.getText().toString();
					chkps = chkpass.getText().toString();
					a= unm.charAt(1);
					b= unm.charAt(2);
					c = pn.charAt(1);
					d = pn.charAt(3);
					e = pn.charAt(5);
					f = pn.charAt(7);
					aa = String.valueOf(a);
					bb = String.valueOf(b);
					cc = String.valueOf(c);
					dd = String.valueOf(d);
					ee = String.valueOf(e);
					ff = String.valueOf(f);
					idstr= aa+bb+cc+dd+ee+ff;
					

					
						if(unm.trim().length()>0 && ups.trim().length()>0 && pn.trim().length()>0 && chkps.trim().length()>0 && sexnm!="Select"&& dsttnm!="Select"&& chkps.equals(ups) && ph!=null)
						{
//					Toast.makeText(Regristration.this, idstr, Toast.LENGTH_SHORT).show();
							ph = BitmaptoString(pht); 
							db.addusers(new Users(unm,ups,ph,pn,sexnm,dsttnm,idstr));
							Toast.makeText(Regristration.this, "Register Successfull!", Toast.LENGTH_SHORT).show();
							Intent i = new Intent(Regristration.this,Login.class);
							startActivity(i);
						}
						else if(unm.trim().length()>0 && ups.trim().length()>0 && pn.trim().length()>0 && chkps.trim().length()>0 && sexnm!="Select"&& dsttnm!="Select"&& chkps.equals(ups) && ph == null)
						{
//					Toast.makeText(Regristration.this, idstr, Toast.LENGTH_SHORT).show();
							ph = BitmaptoString(pht1);
							db.addusers(new Users(unm,ups,ph,pn,sexnm,dsttnm,idstr));
							Toast.makeText(Regristration.this, "Register Successfull!", Toast.LENGTH_SHORT).show();
							Intent i = new Intent(Regristration.this,Login.class);
							startActivity(i);
						}
						else if(unm.trim().length()==0 && ups.trim().length()==0)
						{
							Toast.makeText(Regristration.this, "Please check Credentials!", Toast.LENGTH_SHORT).show();
						}
						
						
						else
						{
							Toast.makeText(Regristration.this, "Register Failed!Please check Credentials!", Toast.LENGTH_SHORT).show();
						}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Toast.makeText(Regristration.this, "Please check Credentials!", Toast.LENGTH_SHORT).show();
				}
				


			}
		});
    }

	public void onActivityResult(int r,int rs,Intent data)
	{
		super.onActivityResult(r, rs, data);
		try {
			if(r == requestcode)
			{
				pht = (Bitmap) data.getExtras().get("data");

				photo.setImageBitmap(pht);
				ph = BitmaptoString(pht);

			}
			else if(r == RESULT_LOAD_IMAGE && rs == RESULT_OK && null != data) {
				Uri selectedImage = data.getData();
				String[] filePathColumn = { MediaStore.Images.Media.DATA };

				Cursor cursor = getContentResolver().query(selectedImage,
						filePathColumn, null, null, null);
				cursor.moveToFirst();

				int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
				String picturePath = cursor.getString(columnIndex);
				cursor.close();

				//	            ImageView imageView = (ImageView) findViewById(R.id.imgView);
				photo.setImageBitmap(BitmapFactory.decodeFile(picturePath));
				pht = ((BitmapDrawable)photo.getDrawable()).getBitmap();
				ph = BitmaptoString(pht);
			}





			else
			{
				Toast.makeText(Regristration.this, "Picture not Taken!",Toast.LENGTH_SHORT).show();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(Regristration.this, "Picture not Taken!",Toast.LENGTH_SHORT).show();
		}
	}

	

	public String BitmaptoString(Bitmap bmp)
	{
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		bmp.compress(Bitmap.CompressFormat.PNG,90,baos);
		byte[] b= baos.toByteArray();
		String str = Base64.encodeToString(b, Base64.DEFAULT);
		return str;
	}
}
