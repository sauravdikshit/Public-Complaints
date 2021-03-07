package complaints.publiccomplaintss;

import java.io.ByteArrayOutputStream;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CompHis extends Activity {
	ListView lst,cmntl,cmnt2,cmnt3,cmnt4,cmnt5,cmnt6,cmnt7;
	CompAdp cmp;
	List<Issue> cmplst;
	MyDataBase db;
	String usid,uspic;
	Bitmap uspc;
	Button backm;
	String nm;
	String blgpc;
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
	Dialog dllst,dllst1,dllst2,dllst3,dllst4,dllst5,dllst6;
String uidd,uiddis;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comp_his);

		final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		
		db = new MyDataBase(this);
		Intent gt= getIntent();
		nm = gt.getStringExtra("nm2");
		blgpc = db.getphoto(nm);
		
		lst= (ListView) findViewById(R.id.cmplstvw);
		backm =(Button)findViewById(R.id.hisbcbcb);
		backm.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				arg0.startAnimation(animAlpha);
				Intent i = new Intent(CompHis.this,AllComplaint.class);
				i.putExtra("nm", nm);
				startActivity(i);

			}
		});
		uidd = db.getid(nm);
//		Toast.makeText(CompHis.this, uidd, Toast.LENGTH_SHORT).show();
		uiddis = db.getissid(uidd);
//		Toast.makeText(CompHis.this,"Comp:"+uiddis, Toast.LENGTH_SHORT).show();
		if(uiddis.equals(uidd))
		{
			cmplst =db.getAllIssues1(uiddis);
			cmp = new CompAdp(this,R.layout.listhistxml,cmplst);
			lst.setAdapter(cmp);
			cmp.notifyDataSetChanged();

		}
//		else if(uiddis!=(uidd))
//		{
//			Toast.makeText(CompHis.this,""+uiddis, Toast.LENGTH_SHORT).show();
//			lst.setVisibility(View.INVISIBLE);
//			
//		}
		else
		{
			Toast.makeText(CompHis.this,"No Data Found!", Toast.LENGTH_SHORT).show();
//			lst.setVisibility(View.INVISIBLE);
		}
		

		wplst = db.getAllWPComments1(uidd);

		wpadp = new WPAdp(this,R.layout.cmntxml,wplst);

		eplst = db.getAllEPComments1(uidd);

		epadp = new EPAdp(this,R.layout.epcmntxml,eplst);

		eplst = db.getAllEPComments1(uidd);//1
		
		cplst = db.getAllCPComments1(uidd);

		cpadp = new CPAdp(this,R.layout.cpcmntxml,cplst);

		tplst = db.getAllTPComments1(uidd);

		tpadp = new TPAdp(this,R.layout.tpcmntxml,tplst);

		swplst = db.getAllSWPComments1(uidd);
		
		swpadp = new SWPAdp(this,R.layout.swpcmntxml,swplst);

		splst = db.getAllSPComments1(uidd);

		spadp = new SPAdp(this,R.layout.spcmntxml,splst);

		otplst = db.getAllOTPComments1(uidd);

		otpadp1 = new OTPAdp1(this,R.layout.otpcmntxml,otplst);

		


		dllst= new Dialog(this);
		dllst.setContentView(R.layout.cmntlistdlg);
		dllst.setTitle("Water Problem Comment List");
		cmntl = (ListView) dllst.findViewById(R.id.cmntlstvw);
		cmntl.setAdapter(wpadp);


		dllst1= new Dialog(this);
		dllst1.setContentView(R.layout.epdlgxml);
		dllst1.setTitle("Electricity Problem Comment List");
		cmnt2 = (ListView) dllst1.findViewById(R.id.epcmntlstvw);
		cmnt2.setAdapter(epadp);

		dllst2= new Dialog(this);
		dllst2.setContentView(R.layout.cpdlgxml);
		dllst2.setTitle(" Consumer Comment List");
		cmnt3 = (ListView) dllst2.findViewById(R.id.cpcmntlstvw);
		cmnt3.setAdapter(cpadp);

		dllst3= new Dialog(this);
		dllst3.setContentView(R.layout.tpdlgxml);
		dllst3.setTitle("Traffic Comment List");
		cmnt4 = (ListView) dllst3.findViewById(R.id.tpcmntlstvw);
		cmnt4.setAdapter(tpadp);

		dllst4= new Dialog(this);
		dllst4.setContentView(R.layout.swpdlgxml);
		dllst4.setTitle("Solid Waste Comment List");
		cmnt5 = (ListView) dllst4.findViewById(R.id.swpcmntlstvw);
		cmnt5.setAdapter(swpadp);

		dllst5= new Dialog(this);
		dllst5.setContentView(R.layout.spdlgxml);
		dllst5.setTitle("Sewage Comment List");
		cmnt6 = (ListView) dllst5.findViewById(R.id.spcmntlstvw);
		cmnt6.setAdapter(spadp);

		dllst6= new Dialog(this);
		dllst6.setContentView(R.layout.otpdlgxml);
		dllst6.setTitle("Others Comment List");
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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder1.blgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder2.epblgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder3.cpblgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder4.tpblgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder5.swpblgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder6.spblgrrpic.setImageBitmap(bmm);



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
			String bmmm= cmnt.getblgrpic();
			Bitmap bmm = StringtoBitmap(bmmm);
			holder7.otpblgrrpic.setImageBitmap(bmm);



			return v1;
		}

	}
	public class ViewHolder
	{
		ImageView usrimg;
		TextView dtetxt;
		TextView nmtxt;
		TextView nmtxtdata;
		TextView idtxt;
		TextView idtxtdata;
		TextView lne;
		TextView sbtxt;
		TextView sbtxtdata;
		TextView sbtxtisue;
		TextView sbtxtisdta;
		TextView dsctxt;
		ImageView cmpimg;
		EditText cmnt;
		Button argbtn;
		Button delete;
		Button delay;
		Button solved;
		Button socmnt;
		ListView cmnlst;

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
				v = lf.inflate(R.layout.listhistxml, null);
				holder.usrimg = (ImageView) v.findViewById(R.id.imagehistt);
				holder.dtetxt = (TextView)v.findViewById(R.id.time);
				holder.idtxt =(TextView)v.findViewById(R.id.idprofl);
				holder.idtxtdata =(TextView)v.findViewById(R.id.idpro55);
				holder.nmtxt =(TextView)v.findViewById(R.id.nameprofll);
				holder.nmtxtdata =(TextView)v.findViewById(R.id.nameprolll);
				holder.lne =(TextView)v.findViewById(R.id.lineff);
				holder.sbtxt =(TextView)v.findViewById(R.id.sssssghh);
				holder.sbtxtdata =(TextView)v.findViewById(R.id.showstep111);
				holder.sbtxtisue =(TextView)v.findViewById(R.id.aaaaaaa);
				holder.sbtxtisdta =(TextView)v.findViewById(R.id.showstep2222);
				holder.dsctxt =(TextView)v.findViewById(R.id.listtexttttt);
				holder.cmpimg = (ImageView) v.findViewById(R.id.listimggggg);
				holder.cmnt = (EditText) v.findViewById(R.id.cmnttttt);
				holder.argbtn = (Button)v.findViewById(R.id.argue11);
				holder.delete = (Button)v.findViewById(R.id.dlgdlethh11);
				holder.delay = (Button)v.findViewById(R.id.dlgsolvhh11);
				holder.solved = (Button)v.findViewById(R.id.dlgdelyhh11);
				holder.socmnt =(Button)v.findViewById(R.id.socmnttt);


				v.setTag(holder);	
			}

			else
			{
				holder = ((ViewHolder)v.getTag());

			}
			Issue is = (Issue) getItem(position);
			holder.sbtxtdata.setText(is.getstp1());
			holder.sbtxtisdta.setText(is.getstp2());
			holder.dsctxt.setText(is.getfd());
			String im = is.getph();
			Bitmap pp= StringtoBitmap(im);
			holder.cmpimg.setImageBitmap(pp);
			holder.idtxtdata.setText(is.getusrpic());
			String uu = is.getusrpic();
			uspic = is.getusrid();
			uspc = StringtoBitmap(uspic);
			holder.usrimg.setImageBitmap(uspc);
			holder.dtetxt.setText(is.getusrdate());
			String un = db.getname(uu);
			holder.nmtxtdata.setText(un);
			holder.cmnt.setTag(holder);
			holder.argbtn.setTag(holder);
			holder.delay.setTag(holder);
			holder.sbtxtdata.setTag(holder);
			holder.sbtxtisdta.setTag(holder);
			holder.dsctxt.setTag(holder);
			holder.idtxtdata.setTag(holder);
			holder.dtetxt.setTag(holder);
			holder.usrimg.setTag(holder);
			holder.solved.setTag(holder);
			holder.socmnt.setTag(holder);
			holder.nmtxtdata.setTag(holder);
			holder.cmpimg.setTag(holder);
			holder.delete.setTag(holder);
			holder.delete.setTag(position);
			holder.delete.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v4) {
					// TODO Auto-generated method stub
					int ps = (Integer)v4.getTag();
					cmplst.remove(ps);
					CompAdp.this.notifyDataSetChanged();
				}
			});
			holder.socmnt.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					String pb1 = ((ViewHolder)v1.getTag()).sbtxtdata.getText().toString();
					if(pb1.equals("Water Problem"))
					{
						//						CompAdp.this.notifyDataSetChanged();
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
			holder.solved.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v3) {
					// TODO Auto-generated method stub

					String sub= ((ViewHolder)v3.getTag() ).sbtxtdata.getText().toString();
					String subis= ((ViewHolder)v3.getTag() ).sbtxtisdta.getText().toString();
					String fd= ((ViewHolder)v3.getTag() ).dsctxt.getText().toString();
					String usd= ((ViewHolder)v3.getTag() ).idtxtdata.getText().toString();
					String dt= ((ViewHolder)v3.getTag() ).dtetxt.getText().toString();
					String usnme = ((ViewHolder)v3.getTag()).nmtxtdata.getText().toString();
					Bitmap ubt = ((BitmapDrawable)((ViewHolder)v3.getTag()).usrimg.getDrawable()).getBitmap();
					String ubtstr = BitmaptoString(ubt);
					Bitmap ubt1 = ((BitmapDrawable)((ViewHolder)v3.getTag()).cmpimg.getDrawable()).getBitmap();
					String ubtstr1 = BitmaptoString(ubt1);
					db.addsolvedd(new Solvedc(sub, subis,ubtstr, fd, usd, dt,usnme,ubtstr1));
					Toast.makeText(CompHis.this, "Solved Inserted Successfully!", Toast.LENGTH_SHORT).show();


				}
			});
			holder.delay.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v2) {
					// TODO Auto-generated method stub
					String sub= ((ViewHolder)v2.getTag() ).sbtxtdata.getText().toString();
					String subis= ((ViewHolder)v2.getTag() ).sbtxtisdta.getText().toString();
					String fd= ((ViewHolder)v2.getTag() ).dsctxt.getText().toString();
					String usd= ((ViewHolder)v2.getTag() ).idtxtdata.getText().toString();
					String dt= ((ViewHolder)v2.getTag() ).dtetxt.getText().toString();
					String usnme = ((ViewHolder)v2.getTag()).nmtxtdata.getText().toString();
					Bitmap ubt = ((BitmapDrawable)((ViewHolder)v2.getTag()).usrimg.getDrawable()).getBitmap();
					String ubtstr = BitmaptoString(ubt);
					Bitmap ubt1 = ((BitmapDrawable)((ViewHolder)v2.getTag()).cmpimg.getDrawable()).getBitmap();
					String ubtstr1 = BitmaptoString(ubt1);

					db.adddelayy(new Delay(sub, subis,ubtstr, fd, usd, dt,usnme,ubtstr1));
					Toast.makeText(CompHis.this, "Delay Inserted Successfully!", Toast.LENGTH_SHORT).show();



				}
			});

			holder.argbtn.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String cm = ((ViewHolder)v.getTag()).cmnt.getText().toString();
					String pb = ((ViewHolder)v.getTag()).sbtxtdata.getText().toString();
					if(pb.equals("Water Problem"))
					{
						db.addwpcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

					}
					else if(pb.equals("Electricity Problem"))
					{

						db.addepcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

					}

					else if(pb.equals("Consumer Problem"))
					{

						db.addcpcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

					}

					else if(pb.equals("Traffic Problem"))
					{

						db.addtpcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");
					}						

					else if(pb.equals("Solid waste Problem"))
					{

						db.addswpcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

					}

					else if(pb.equals("Sewage Problem"))
					{

						db.addspcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

					}

					else if(pb.equals("Others"))
					{

						db.addotpcmnts(new Comnts(uidd,cm, nm, blgpc));
						Toast.makeText(CompHis.this, "Commented Successfully!", Toast.LENGTH_SHORT).show();
						((ViewHolder)v.getTag()).cmnt.setText("");

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
	public void onBackPressed()
	{
		Intent i = new Intent(CompHis.this,AllComplaint.class);
		i.putExtra("nm", nm);
		startActivity(i);
	}



}

