package complaints.publiccomplaintss;

import java.io.ByteArrayOutputStream;
import java.util.List;

import complaints.publiccomplaintss.CompHis.CPAdp;
import complaints.publiccomplaintss.CompHis.CompAdp;
import complaints.publiccomplaintss.CompHis.EPAdp;
import complaints.publiccomplaintss.CompHis.OTPAdp1;
import complaints.publiccomplaintss.CompHis.SPAdp;
import complaints.publiccomplaintss.CompHis.SWPAdp;
import complaints.publiccomplaintss.CompHis.TPAdp;
import complaints.publiccomplaintss.CompHis.ViewHolder;
import complaints.publiccomplaintss.CompHis.ViewHolder1;
import complaints.publiccomplaintss.CompHis.ViewHolder2;
import complaints.publiccomplaintss.CompHis.ViewHolder3;
import complaints.publiccomplaintss.CompHis.ViewHolder4;
import complaints.publiccomplaintss.CompHis.ViewHolder5;
import complaints.publiccomplaintss.CompHis.ViewHolder6;
import complaints.publiccomplaintss.CompHis.ViewHolder7;
import complaints.publiccomplaintss.CompHis.WPAdp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Manegement extends Activity {
	
	ListView lst,cmntl,cmnt2,cmnt3,cmnt4,cmnt5,cmnt6,cmnt7;
	CompAdp cmp;
	List<Issue> cmplst;
	MyDataBase db;
	String usid,uspic;
	Bitmap uspc;
	Button backm;
	String odst;
	String cm,nm,blgpc;
	WPAdp wpadp;
	EPAdp epadp;
	CPAdp cpadp;
	TPAdp tpadp;
	SWPAdp swpadp;
	SPAdp spadp;
	OTPAdp1 otpadp1;
	List<Comnts> wplst;
	List<Comnts> eplst;
	List<Comnts> cplst;
	List<Comnts> tplst;
	List<Comnts> swplst;
	List<Comnts> splst;
	List<Comnts> otplst;
	String nmstr;
	Dialog dllst,dllst1,dllst2,dllst3,dllst4,dllst5,dllst6;
	Bitmap apci;
	String apcstr;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manegement);

		final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		
		db = new MyDataBase(this);
		
		lst= (ListView) findViewById(R.id.listsolvedmmm);
		backm =(Button)findViewById(R.id.mangbackbtn);
		Intent gt = getIntent();
		odst = gt.getStringExtra("odst");
		
		backm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				Intent i = new Intent(Manegement.this,FrontBoard.class);
				startActivity(i);
				
			}
		});
		
		//check here for ALL THE DSTT

		if(odst.equals("Patna"))
		{
			cmplst =db.getAllPTNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Rohtas"))
		{
			//change here for rohtas issue
			cmplst =db.getAllROHIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Bhagalpur"))
		{
			cmplst =db.getAllBGPRIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Munger"))
		{
			cmplst =db.getAllMUNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		
		else if(odst.equals("Bhojpur"))
		{
			cmplst =db.getAllBHPIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Muzaffarpur"))
		{
			cmplst =db.getAllMFPIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Siwan"))
		{
			cmplst =db.getAllSWNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Gopalganj"))
		{
			cmplst =db.getAllGOPIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Saran"))
		{
			cmplst =db.getAllSRNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Aurangabad"))
		{
			cmplst =db.getAllARBIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Vaishali"))
		{
			cmplst =db.getAllVSLIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Buxar"))
		{
			cmplst =db.getAllBXRIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Begusarai"))
		{
			cmplst =db.getAllBGSIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Darbhanga"))
		{
			cmplst =db.getAllDRBIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Jehanabad"))
		{
			cmplst =db.getAllJNBIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Newada"))
		{
			cmplst =db.getAllNWAIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Saharsa"))
		{
			cmplst =db.getAllSRAIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Khagaria"))
		{
			cmplst =db.getAllKHGIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Sitamarhi"))
		{
			cmplst =db.getAllSTAIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Nalanda"))
		{
			cmplst =db.getAllNLDIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Gaya"))
		{
			cmplst =db.getAllGYAIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Purnia"))
		{
			cmplst =db.getAllPRNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Purba Champaran"))
		{
			cmplst =db.getAllPRBCIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Lakhisarai"))
		{
			cmplst =db.getAllLAKIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Madhubani"))
		{
			cmplst =db.getAllMDBIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Katihar"))
		{
			cmplst =db.getAllKTRIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Madhepura"))
		{
			cmplst =db.getAllMHPIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Banka"))
		{
			cmplst =db.getAllBNKIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Sheohar"))
		{
			cmplst =db.getAllSEOIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Supaul"))
		{
			cmplst =db.getAllSPLIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Pashchim Champaran"))
		{
			cmplst =db.getAllPCMCIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Sheikhpura"))
		{
			cmplst =db.getAllSKHIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Araria"))
		{
			cmplst =db.getAllARIIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Samastipur"))
		{
			cmplst =db.getAllSMTPIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Jamui"))
		{
			cmplst =db.getAllJMIIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Kaimur(Bhabua)"))
		{
			cmplst =db.getAllKMRIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Kishanganj"))
		{
			cmplst =db.getAllKSNIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else if(odst.equals("Arwal"))
		{
			cmplst =db.getAllAWLIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		else
		{
			cmplst =db.getAllIssues();
			cmp = new CompAdp(this,R.layout.manegementlist,cmplst);
			lst.setAdapter(cmp);
		}
		apci = BitmapFactory.decodeResource(getResources(), R.drawable.apicnnn);
		apcstr = BitmaptoString(apci);
		
		wplst = db.getAllWPComments();

		wpadp = new WPAdp(this,R.layout.cmntxml,wplst);

		eplst = db.getAllEPComments();

		epadp = new EPAdp(this,R.layout.epcmntxml,eplst);

		eplst = db.getAllEPComments();
		
		cplst = db.getAllCPComments();

		cpadp = new CPAdp(this,R.layout.cpcmntxml,cplst);

		tplst = db.getAllTPComments();

		tpadp = new TPAdp(this,R.layout.tpcmntxml,tplst);

		swplst = db.getAllSWPComments();
		
		swpadp = new SWPAdp(this,R.layout.swpcmntxml,swplst);

		splst = db.getAllSPComments();

		spadp = new SPAdp(this,R.layout.spcmntxml,splst);

		otplst = db.getAllOTPComments();

		otpadp1 = new OTPAdp1(this,R.layout.otpcmntxml,otplst);

		


		dllst= new Dialog(this);
		dllst.setContentView(R.layout.cmntlistdlg);
		dllst.setTitle("Comment List");
		cmntl = (ListView) dllst.findViewById(R.id.cmntlstvw);
		cmntl.setAdapter(wpadp);


		dllst1= new Dialog(this);
		dllst1.setContentView(R.layout.epdlgxml);
		dllst1.setTitle("Comment List");
		cmnt2 = (ListView) dllst1.findViewById(R.id.epcmntlstvw);
		cmnt2.setAdapter(epadp);

		dllst2= new Dialog(this);
		dllst2.setContentView(R.layout.cpdlgxml);
		dllst2.setTitle("Comment List");
		cmnt3 = (ListView) dllst2.findViewById(R.id.cpcmntlstvw);
		cmnt3.setAdapter(cpadp);

		dllst3= new Dialog(this);
		dllst3.setContentView(R.layout.tpdlgxml);
		dllst3.setTitle("Comment List");
		cmnt4 = (ListView) dllst3.findViewById(R.id.tpcmntlstvw);
		cmnt4.setAdapter(tpadp);

		dllst4= new Dialog(this);
		dllst4.setContentView(R.layout.swpdlgxml);
		dllst4.setTitle("Comment List");
		cmnt5 = (ListView) dllst4.findViewById(R.id.swpcmntlstvw);
		cmnt5.setAdapter(swpadp);

		dllst5= new Dialog(this);
		dllst5.setContentView(R.layout.spdlgxml);
		dllst5.setTitle("Comment List");
		cmnt6 = (ListView) dllst5.findViewById(R.id.spcmntlstvw);
		cmnt6.setAdapter(spadp);

		dllst6= new Dialog(this);
		dllst6.setContentView(R.layout.otpdlgxml);
		dllst6.setTitle("Comment List");
		cmnt7 = (ListView) dllst6.findViewById(R.id.otpcmntlstvw);
		cmnt7.setAdapter(otpadp1);
		
	}
	public class ViewHolder1
	{
		ImageView blgrrpic;
		TextView blgrrcmnt;
		TextView blgrname;
	}
	public class WPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> wplst;

		public WPAdp(Context cnt1,int y,List<Comnts> wplst)
		{
			super(cnt1,y,wplst);
			this.cnt1 = cnt1;
			this.wplst =wplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder1 holder1 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder1 = new ViewHolder1();
				v1 = lf.inflate(R.layout.cmntxml, null);
				holder1.blgrrcmnt = (TextView) v1.findViewById(R.id.cmnttxt);
				holder1.blgrrpic = (ImageView) v1.findViewById(R.id.cmntpic);
				holder1.blgrname = (TextView) v1.findViewById(R.id.cmntnm);
				v1.setTag(holder1);
			}
			else
			{
				holder1 = ((ViewHolder1)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			WPAdp.this.notifyDataSetChanged();
			holder1.blgrrcmnt.setText(cmnt.getcmnttext());
			holder1.blgrname.setText(cmnt.getblgrname());
//			holder1.blgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder1.blgrrpic.setImageBitmap(bmm);
//			holder1.blgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder2
	{
		ImageView epblgrrpic;
		TextView epblgrrcmnt;
		TextView epblgrname;
	}
	public class EPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> eplst;

		public EPAdp(Context cnt1,int y,List<Comnts> eplst)
		{
			super(cnt1,y,eplst);
			this.cnt1 = cnt1;
			this.eplst =eplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder2 holder2 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder2 = new ViewHolder2();
				v1 = lf.inflate(R.layout.epcmntxml, null);
				holder2.epblgrrcmnt = (TextView) v1.findViewById(R.id.epcmnttxt);
				holder2.epblgrrpic = (ImageView) v1.findViewById(R.id.epcmntpic);
				holder2.epblgrname = (TextView) v1.findViewById(R.id.epcmntnm);
				v1.setTag(holder2);
			}
			else
			{
				holder2 = ((ViewHolder2)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			EPAdp.this.notifyDataSetChanged();
			holder2.epblgrrcmnt.setText(cmnt.getcmnttext());
			holder2.epblgrname.setText(cmnt.getblgrname());
//			holder2.epblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder2.epblgrrpic.setImageBitmap(bmm);
//			holder2.epblgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder3
	{
		ImageView cpblgrrpic;
		TextView cpblgrrcmnt;
		TextView cpblgrname;
	}
	public class CPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> cplst;

		public CPAdp(Context cnt1,int y,List<Comnts> cplst)
		{
			super(cnt1,y,cplst);
			this.cnt1 = cnt1;
			this.cplst =cplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder3 holder3 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder3 = new ViewHolder3();
				v1 = lf.inflate(R.layout.cpcmntxml, null);
				holder3.cpblgrrcmnt = (TextView) v1.findViewById(R.id.cpcmnttxt);
				holder3.cpblgrrpic = (ImageView) v1.findViewById(R.id.cpcmntpic);
				holder3.cpblgrname = (TextView) v1.findViewById(R.id.cpcmntnm);
				v1.setTag(holder3);
			}
			else
			{
				holder3 = ((ViewHolder3)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			CPAdp.this.notifyDataSetChanged();
			holder3.cpblgrrcmnt.setText(cmnt.getcmnttext());
			holder3.cpblgrname.setText(cmnt.getblgrname());
//			holder3.cpblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder3.cpblgrrpic.setImageBitmap(bmm);
//			holder3.cpblgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder4
	{
		ImageView tpblgrrpic;
		TextView tpblgrrcmnt;
		TextView tpblgrname;
	}
	public class TPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> tplst;

		public TPAdp(Context cnt1,int y,List<Comnts> tplst)
		{
			super(cnt1,y,tplst);
			this.cnt1 = cnt1;
			this.tplst =tplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder4 holder4 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder4 = new ViewHolder4();
				v1 = lf.inflate(R.layout.tpcmntxml, null);
				holder4.tpblgrrcmnt = (TextView) v1.findViewById(R.id.tpcmnttxt);
				holder4.tpblgrrpic = (ImageView) v1.findViewById(R.id.tpcmntpic);
				holder4.tpblgrname = (TextView) v1.findViewById(R.id.tpcmntnm);
				v1.setTag(holder4);
			}
			else
			{
				holder4 = ((ViewHolder4)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			TPAdp.this.notifyDataSetChanged();
			holder4.tpblgrrcmnt.setText(cmnt.getcmnttext());
			holder4.tpblgrname.setText(cmnt.getblgrname());
//			holder4.tpblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder4.tpblgrrpic.setImageBitmap(bmm);
//			holder4.tpblgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder5
	{
		ImageView swpblgrrpic;
		TextView swpblgrrcmnt;
		TextView swpblgrname;
	}
	public class SWPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> swplst;

		public SWPAdp(Context cnt1,int y,List<Comnts> swplst)
		{
			super(cnt1,y,swplst);
			this.cnt1 = cnt1;
			this.swplst =swplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder5 holder5 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder5 = new ViewHolder5();
				v1 = lf.inflate(R.layout.swpcmntxml, null);
				holder5.swpblgrrcmnt = (TextView) v1.findViewById(R.id.swpcmnttxt);
				holder5.swpblgrrpic = (ImageView) v1.findViewById(R.id.swpcmntpic);
				holder5.swpblgrname = (TextView) v1.findViewById(R.id.swpcmntnm);
				v1.setTag(holder5);
			}
			else
			{
				holder5 = ((ViewHolder5)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			SWPAdp.this.notifyDataSetChanged();
			holder5.swpblgrrcmnt.setText(cmnt.getcmnttext());
			holder5.swpblgrname.setText(cmnt.getblgrname());
//			holder5.swpblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder5.swpblgrrpic.setImageBitmap(bmm);
//			holder5.swpblgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder6
	{
		ImageView spblgrrpic;
		TextView spblgrrcmnt;
		TextView spblgrname;
	}
	public class SPAdp extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> splst;

		public SPAdp(Context cnt1,int y,List<Comnts> splst)
		{
			super(cnt1,y,splst);
			this.cnt1 = cnt1;
			this.splst =splst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder6 holder6 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder6 = new ViewHolder6();
				v1 = lf.inflate(R.layout.spcmntxml, null);
				holder6.spblgrrcmnt = (TextView) v1.findViewById(R.id.spcmnttxt);
				holder6.spblgrrpic = (ImageView) v1.findViewById(R.id.spcmntpic);
				holder6.spblgrname = (TextView) v1.findViewById(R.id.spcmntnm);
				v1.setTag(holder6);
			}
			else
			{
				holder6 = ((ViewHolder6)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			SPAdp.this.notifyDataSetChanged();
			holder6.spblgrrcmnt.setText(cmnt.getcmnttext());
			holder6.spblgrname.setText(cmnt.getblgrname());
//			holder6.spblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder6.spblgrrpic.setImageBitmap(bmm);
//			holder6.spblgrrpic.setImageBitmap(apci);



			return v1;
		}

	}
	public class ViewHolder7
	{
		ImageView otpblgrrpic;
		TextView otpblgrrcmnt;
		TextView otpblgrname;
	}
	public class OTPAdp1 extends ArrayAdapter<Comnts>
	{
		Context cnt1;
		List<Comnts> otplst;

		public OTPAdp1(Context cnt1,int y,List<Comnts> otplst)
		{
			super(cnt1,y,otplst);
			this.cnt1 = cnt1;
			this.otplst =otplst;
		}
		@Override
		public View getView(int position, View v1, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder7 holder7 =null;
			LayoutInflater lf = (LayoutInflater) cnt1.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v1== null)
			{
				holder7 = new ViewHolder7();
				v1 = lf.inflate(R.layout.otpcmntxml, null);
				holder7.otpblgrrcmnt = (TextView) v1.findViewById(R.id.otpcmnttxt);
				holder7.otpblgrrpic = (ImageView) v1.findViewById(R.id.otpcmntpic);
				holder7.otpblgrname = (TextView) v1.findViewById(R.id.otpcmntnm);
				v1.setTag(holder7);
			}
			else
			{
				holder7 = ((ViewHolder7)v1.getTag());
			}
			Comnts cmnt= (Comnts) getItem(position);
			OTPAdp1.this.notifyDataSetChanged();
			holder7.otpblgrrcmnt.setText(cmnt.getcmnttext());
			holder7.otpblgrname.setText(cmnt.getblgrname());
//			holder7.otpblgrname.setText("Admin");
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder7.otpblgrrpic.setImageBitmap(bmm);
//			holder7.otpblgrrpic.setImageBitmap(apci);



			return v1;
		}
		
	}
	public class ViewHolder
	{
		ImageView usrimgm;
		TextView dtetxtm;
		Button dlgm;
		TextView nmtxtm;
		TextView nmtxtdatam;
		TextView idtxtm;
		TextView idtxtdatam;
		TextView lnem;
		TextView sbtxtm;
		TextView sbtxtdatam;
		TextView sbtxtisuem;
		TextView sbtxtisdtam;
		TextView dsctxtm;
		ImageView cmpimgm;
		TextView numbssa;
		TextView distsssa;
		EditText cmntm;
		Button argbtnm;
		Button socmnt;
		ListView cmnlstm;
		

	}
	public class CompAdp extends ArrayAdapter<Issue>
	{
		Context context;
		List<Issue> cmplst;
		
		public CompAdp(Context context,int i,List<Issue> cmplst)
		{
			super(context,i,cmplst);
			this.context=context;
			this.cmplst=cmplst;
		}
		

		@Override
		public View getView(int position, View v, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder = null;
			LayoutInflater lf = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			if(v == null)
			{
				holder= new ViewHolder();
				v = lf.inflate(R.layout.manegementlist, null);
				holder.usrimgm = (ImageView) v.findViewById(R.id.imagehisttmmm);
				holder.dtetxtm = (TextView)v.findViewById(R.id.timemmm);
				holder.idtxtm =(TextView)v.findViewById(R.id.idproflmmm);
				holder.idtxtdatam =(TextView)v.findViewById(R.id.idpro55mmm);
				holder.nmtxtm =(TextView)v.findViewById(R.id.nameprofllmmm);
				holder.nmtxtdatam =(TextView)v.findViewById(R.id.nameprolllmmm);
				holder.numbssa =(TextView)v.findViewById(R.id.phonemmmmm);
				holder.distsssa =(TextView)v.findViewById(R.id.dismmm);
				holder.lnem =(TextView)v.findViewById(R.id.lineffmmm);
				holder.sbtxtm =(TextView)v.findViewById(R.id.sssssghhmmm);
				holder.sbtxtdatam =(TextView)v.findViewById(R.id.showstep111mmm);
				holder.sbtxtisuem =(TextView)v.findViewById(R.id.aaaaaaammm);
				holder.sbtxtisdtam =(TextView)v.findViewById(R.id.showstep2222mmm);
				holder.dsctxtm =(TextView)v.findViewById(R.id.listtextttttmmm);
				holder.cmpimgm = (ImageView) v.findViewById(R.id.listimgggggmmm);
				holder.cmntm = (EditText) v.findViewById(R.id.cmntttttmmm);
				holder.socmnt = (Button)v.findViewById(R.id.socbbc);
				holder.argbtnm =(Button)v.findViewById(R.id.argue11mmm);
				
				
				
				
				v.setTag(holder);
				
				
				
				
			}
			else
			{
				holder = ((ViewHolder)v.getTag());
				
			}
			Issue is = (Issue) getItem(position);
			holder.sbtxtdatam.setText(is.getstp1());
			holder.sbtxtisdtam.setText(is.getstp2());
			holder.dsctxtm.setText(is.getfd());
			String im = is.getph();
			Bitmap pp= StringtoBitmap(im);
			holder.cmpimgm.setImageBitmap(pp);
			holder.idtxtdatam.setText(is.getusrpic());
			String uu = is.getusrpic();
			uspic = is.getusrid();
			uspc = StringtoBitmap(uspic);
			holder.usrimgm.setImageBitmap(uspc);
			holder.dtetxtm.setText(is.getusrdate());
			String un = db.getname(uu);
			holder.nmtxtdatam.setText(un);
			String uphn = db.getnumber(un);
			holder.numbssa.setText(uphn);
			holder.distsssa.setText(is.getusrdstt());
			holder.socmnt.setTag(holder);
			holder.sbtxtdatam.setTag(holder);
			holder.argbtnm.setTag(holder);
			holder.cmntm.setTag(holder);
			holder.numbssa.setTag(holder);
			holder.numbssa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					try {
						nmstr = "tel:"+ ((ViewHolder)v.getTag()).numbssa.getText().toString().trim();
						Intent i = new Intent(Intent.ACTION_CALL);
						i.setData(Uri.parse(nmstr));
						i.putExtra("nmstr", nmstr);
						startActivity(i);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
			holder.socmnt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					String pb1 = ((ViewHolder)v1.getTag()).sbtxtdatam.getText().toString();
					if(pb1.equals("Water Problem"))
					{
						
						dllst.show();
					}
					else if(pb1.equals("Electricity Problem"))
					{
						dllst1.show();
					}
					else if(pb1.equals("Consumer Problem"))
					{
						dllst2.show();
					}
					else if(pb1.equals("Traffic Problem"))
					{
						dllst3.show();
					}
					else if(pb1.equals("Solid waste Problem"))
					{
						dllst4.show();
					}
					else if(pb1.equals("Sewage Problem"))
					{
						dllst5.show();
					}
					else if(pb1.equals("Others"))
					{
						dllst6.show();
					}

					else
					{

					}



				}
			});
			holder.argbtnm.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) {

					String cm = ((ViewHolder)v.getTag()).cmntm.getText().toString();
					String pb = ((ViewHolder)v.getTag()).sbtxtdatam.getText().toString();
					String uid = ((ViewHolder)v.getTag()).idtxtdatam.getText().toString();
					if(pb.equals("Water Problem"))
					{
						db.addwpcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}
					else if(pb.equals("Electricity Problem"))
					{

						db.addepcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}

					else if(pb.equals("Consumer Problem"))
					{

						db.addcpcmnts(new Comnts(uid,cm,"Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}

					else if(pb.equals("Traffic Problem"))
					{

						db.addtpcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");
					}						

					else if(pb.equals("Solid waste Problem"))
					{

						db.addswpcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}

					else if(pb.equals("Sewage Problem"))
					{

						db.addspcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}

					else if(pb.equals("Others"))
					{

						db.addotpcmnts(new Comnts(uid,cm, "Admin", apcstr));
						Toast.makeText(Manegement.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmntm.setText("");

					}
					else
					{

					}

				}
			});
			
			
			
			return v;
		}
		
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
	public String BitmaptoString(Bitmap bmp)
	{
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		bmp.compress(Bitmap.CompressFormat.PNG,100,baos);
		byte[] b= baos.toByteArray();
		String str = Base64.encodeToString(b, Base64.DEFAULT);
		return str;
	}

}
