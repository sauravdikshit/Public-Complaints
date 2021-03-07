package complaints.publiccomplaintss;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class About extends Activity {
	TextView abt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abouts);
		abt =(TextView) findViewById(R.id.abuttxt);
		abt.setMovementMethod(new ScrollingMovementMethod());
		ld();
		
	}
	public void ld()
	{
		InputStream is;
		try {
			is = getAssets().open("aboutapc.txt");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			abt.setText(new String(buffer));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
