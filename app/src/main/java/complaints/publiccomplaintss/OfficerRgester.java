package complaints.publiccomplaintss;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class OfficerRgester extends Activity {
	Spinner districtr;
	ImageView backssa;
	EditText phoner,paswordr,passwordrcheck;
	Button singupr;
	String ounm,oups,ochkps,opn;
	ArrayAdapter offfdictadp;
	String odct;
	MyDataBase db;
	private String[] offfdict ={"Select","Patna","Rohtas","Bhagalpur","Munger","Bhojpur","Muzaffarpur","Siwan","Gopalganj",
			"Saran","Aurangabad","Vaishali","Buxar","Begusarai","Darbhanga","Jehanabad",
			"Newada","Saharsa","Khagaria","Sitamarhi","Nalanda","Gaya","Purnia","Purba Champaran",
			"Lakhisarai","Madhubani","Katihar","Madhepura","Banka","Sheohar","Supaul","Pashchim Champaran",
			"Sheikhpura","Araria","Samastipur","Jamui","Kaimur(Bhabua)","Kishanganj","Arwal"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.officeregester);
		db= new MyDataBase(this);
		districtr =(Spinner)findViewById(R.id.offfspinr);
		phoner =(EditText)findViewById(R.id.phonesse);
		paswordr =(EditText)findViewById(R.id.offpassr);
		passwordrcheck =(EditText)findViewById(R.id.offpassrr);
		singupr =(Button)findViewById(R.id.singupasdf);
		backssa =(ImageView)findViewById(R.id.offfbackrr);
		backssa.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(OfficerRgester.this,Officalogin.class);
				startActivity(i);
				
			}
		});
		offfdictadp = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, offfdict);
		districtr.setAdapter(offfdictadp);
		districtr.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				odct = (String) parent.getItemAtPosition(position);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		singupr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
//				ounm = phoner.getText().toString();
				oups = paswordr.getText().toString();
				opn = phoner.getText().toString();
				ochkps = passwordrcheck.getText().toString();
				
				

				if(oups.trim().length()>0 && opn.trim().length()>0 && ochkps.trim().length()>0 &&  ochkps.equals(oups) )
				{
					
					db.addoffusers(new OffUsers(odct, opn, oups));
					Toast.makeText(OfficerRgester.this, "Register Successfull!", Toast.LENGTH_SHORT).show();
					Intent i = new Intent(OfficerRgester.this,Officalogin.class);
					startActivity(i);
				}
				
				
				
				else
				{
					Toast.makeText(OfficerRgester.this, "Register Failed!Please check Credentials!", Toast.LENGTH_SHORT).show();
				}



			}
		});
				
	}
	
	public void onBackPressed()
	{
//		Intent i = new Intent(OfficerRgester.this,FrontBoard.class);
//		startActivity(i);
	}

	

}
