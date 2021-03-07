package complaints.publiccomplaintss;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MyComplaintes extends Activity {
	Spinner step11,step22;
	EditText comprit;
	ImageView comphoto;
	Button cback,csend,cphbtn,b;
	Bitmap pht,pht1;
	String ph = null;
	private int requestcode =1;
	private static int RESULT_LOAD_IMAGE = 2;
	String phh,fd;
	String stp1,stp2;
	ArrayAdapter s1,s2,s3,s4,s5,s6,s7,s8,stemp;
	private String[] astep1 ={"Select","Water Problem","Electricity Problem","Consumer Problem","Traffic Problem","Solid waste Problem","Sewage Problem","Others"};
	private String[] astep2 ={"Select","Dirty Water Supply","No Water Supply","Low Pressure","Others"};
	private String[] astep3 ={"Select","Low Voltage Supply","High Voltage Supply","Transformer Problem","Voltage Trip Problem","Others"};
	private String[] astep4 ={"Select","Duplicate Product","Illegal Product","Extra Cost","Expired Product","Others"};
	private String[] astep5 ={"Select","Traffic Lights","Traffic Police","Bad Behaviour","Drounk & Drive","Over Loding","Extra Rent","Others"};
	private String[] astep6 ={"Select","Waste on the road","No Garbage Collector Box","Medicinal Waste on Road","Stinky Waste on roadaside","Others"};
	private String[] astep7 ={"Select","Open Chamber","No Water Passage","No Small Waste Flow","Manhole Overflow","Others"};
	private String[] astep8={"Select","Eve Teasing","Ragging","Conflict","Extortion","Dadagiri"};
	private String[] asteptemp ={""};
	MyDataBase db;
	String nm,usrpic,usid,usrrpic;
	String formattedDate,ucmpid;
	Bitmap up;
	String usdstt;
	Dialog othdlg;
	Button otmsg;
	Button otok,otcn;
	String othmsg;
	int om;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.mycomplaintes);

		final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		
		db = new MyDataBase(this);
		Intent gt = getIntent();
		nm= gt.getStringExtra("nm2");

		//		Toast.makeText(MyComplaintes.this, nm, Toast.LENGTH_SHORT).show();
		step11 =(Spinner)findViewById(R.id.step1);
		step22 =(Spinner)findViewById(R.id.step2);
		comprit =(EditText)findViewById(R.id.fulldisc);
		comphoto =(ImageView)findViewById(R.id.lphoto);
		cback =(Button)findViewById(R.id.lback);
		cback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
				i.putExtra("nm", nm);
				startActivity(i);

			}
		});
		pht1 = BitmapFactory.decodeResource(getResources(), R.drawable.probissue);
		csend =(Button)findViewById(R.id.lsend);
		cphbtn =(Button)findViewById(R.id.limgbtn);
		s1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep1);
		step11.setAdapter(s1);
		s2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep2);
		s3 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep3);
		s4 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep4);
		s5 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep5);
		s6 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep6);
		s7 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep7);
		s8 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, astep8);
		stemp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, asteptemp);
		othdlg = new Dialog(this);
		othdlg.setTitle("Choose One");
		othdlg.setContentView(R.layout.cameradlg);
		otmsg = (Button) othdlg.findViewById(R.id.camdlg);
		otok = (Button) othdlg.findViewById(R.id.galdlg);
		otcn=(Button) othdlg.findViewById(R.id.canclldlg);
		otok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(
						Intent.ACTION_PICK,
						android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

				startActivityForResult(i, RESULT_LOAD_IMAGE);
				othdlg.dismiss();

			}
		});
		otmsg.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

				startActivityForResult(i,requestcode);
				othdlg.dismiss();

			}
		});
		otcn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				othdlg.dismiss();

			}
		});


		//		astep8=new String[1];
		//		for(int i= 0;i<astep8.length;i++)
		//		{
		//			
		//		}



		step11.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				stp1 =(String) parent.getItemAtPosition(position);
				if(stp1.equals("Water Problem"))
				{
					step22.setAdapter(s2);
				}
				else if(stp1.equals("Electricity Problem"))
				{
					step22.setAdapter(s3);
				}
				else if(stp1.equals("Consumer Problem"))
				{
					step22.setAdapter(s4);
				}
				else if(stp1.equals("Traffic Problem"))
				{
					step22.setAdapter(s5);
				}
				else if(stp1.equals("Solid waste Problem"))
				{
					step22.setAdapter(s6);
				}
				else if(stp1.equals("Sewage Problem"))
				{
					step22.setAdapter(s7);
				}
				else if(stp1.equals("Others"))
				{
					//					othdlg.show();
					step22.setAdapter(s8);
				}
				else
				{
					step22.setAdapter(stemp);
					//					Toast.makeText(MyComplaintes.this, "No data found!", Toast.LENGTH_SHORT).show();
				}
				//				step22.setSelection(position);
			}


			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
		step22.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				stp2 = (String) parent.getItemAtPosition(position);
				//				step11.setSelection(position);

			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});

		csend.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				Calendar c = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss (dd-MM-yyyy)");
				String formattedDate = sdf.format(new Date());
				fd =comprit.getText().toString();
				usrpic= db.getphoto(nm);
				up = StringtoBitmap(usrpic);
				usrrpic= BitmaptoString(up);
				usid = db.getid(nm);
				usdstt = db.getdistrict(nm);

				//			Toast.makeText(MyComplaintes.this,usid, Toast.LENGTH_SHORT).show();


				if(fd.trim().length()>0 &&  stp1!="Select"&& stp2!="Select"&&  ph!=null )
				{
					ph = BitmaptoString(pht); 

					if(usdstt.equals("Patna"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));
						db.addptnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Rohtas"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addrohisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);


					}
					else if(usdstt.equals("Bhagalpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbgprisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Munger"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmunisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Bhojpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbhpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Muzaffarpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmfpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Siwan"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addswnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Gopalganj"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addgopisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Saran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsrnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Aurangabad"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addarbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Vaishali"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addvslisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Buxar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbxrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Begusarai"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbgsisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Darbhanga"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.adddrbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Jehanabad"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addjnbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Newada"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addnwaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Saharsa"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsraisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Khagaria"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addkhgisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}

					else if(usdstt.equals("Sitamarhi"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addstaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Nalanda"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addnldisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Gaya"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addgyaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Purnia"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addprnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Purba Champaran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addprbcisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Lakhisarai"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addlakisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Madhubani"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmdbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Katihar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addktrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Madhepura"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmhpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Banka"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbnkisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Sheohar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addseoisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Supaul"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsplisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Pashchim Champaran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addpcmcisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Sheikhpura"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addskhisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Araria"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addariisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Samastipur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsmtpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Jamui"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addjmiisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Kaimur(Bhabua)"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addkmrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Kishanganj"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addksnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Arwal"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addawlisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}

					//willbe t=rstrcted for select
					else
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}


				}
				else if(fd.trim().length()>0 &&  stp1!="Select"&& stp2!="Select"&& ph == null)
				{
					ph = BitmaptoString(pht1);

					if(usdstt.equals("Patna"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));
						db.addptnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Rohtas"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addrohisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);


					}
					else if(usdstt.equals("Bhagalpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbgprisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Munger"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmunisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Bhojpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbhpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Muzaffarpur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmfpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Siwan"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addswnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Gopalganj"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addgopisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Saran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsrnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Aurangabad"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addarbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Vaishali"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addvslisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Buxar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbxrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Begusarai"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbgsisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Darbhanga"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.adddrbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Jehanabad"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addjnbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Newada"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addnwaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Saharsa"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsraisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Khagaria"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addkhgisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}

					else if(usdstt.equals("Sitamarhi"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addstaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Nalanda"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addnldisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Gaya"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addgyaisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Purnia"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addprnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Purba Champaran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addprbcisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Lakhisarai"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addlakisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Madhubani"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmdbisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Katihar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addktrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Madhepura"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addmhpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Banka"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addbnkisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Sheohar"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addseoisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Supaul"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsplisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Pashchim Champaran"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addpcmcisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Sheikhpura"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addskhisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Araria"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addariisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Samastipur"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addsmtpisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Jamui"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addjmiisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Kaimur(Bhabua)"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addkmrisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Kishanganj"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addksnisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else if(usdstt.equals("Arwal"))
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));

						db.addawlisue(new Issue(stp1, stp1, ph, fd, usrpic, usid, formattedDate, usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}
					else
					{
						db.addisue(new Issue(stp1,stp2,ph,fd,usrpic,usid,formattedDate,usdstt));
						Toast.makeText(MyComplaintes.this, "SEND SUCESSFULL", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
						i.putExtra("nm", nm);
						startActivity(i);
					}

				}


				else
				{
					Toast.makeText(MyComplaintes.this, "Sending Faild!Please check Credentials!", Toast.LENGTH_SHORT).show();
				}



			}
		});


		cphbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animAlpha);
//				Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//
//				startActivityForResult(i,requestcode);
				othdlg.show();

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
				comphoto.setImageBitmap(pht);
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
				comphoto.setImageBitmap(BitmapFactory.decodeFile(picturePath));
				pht = ((BitmapDrawable)comphoto.getDrawable()).getBitmap();
				ph = BitmaptoString(pht);
			}





			else
			{
				Toast.makeText(MyComplaintes.this, "Picture not Taken!",Toast.LENGTH_SHORT).show();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(MyComplaintes.this, "Picture not Taken!",Toast.LENGTH_SHORT).show();
		}
	}



	public String BitmaptoString(Bitmap bmp)
	{
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		bmp.compress(Bitmap.CompressFormat.PNG,100,baos);
		byte[] b= baos.toByteArray();
		String str = Base64.encodeToString(b, Base64.DEFAULT);
		return str;
	}
	public Bitmap StringtoBitmap(String str)
	{
		try {
			byte[] ebte = Base64.decode(str, Base64.DEFAULT);
			Bitmap bmp= BitmapFactory.decodeByteArray(ebte, 0, ebte.length);
			return bmp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void onBackPressed()
	{
		Intent i = new Intent(MyComplaintes.this,AllComplaint.class);
		i.putExtra("nm", nm);
		startActivity(i);
	}



}
