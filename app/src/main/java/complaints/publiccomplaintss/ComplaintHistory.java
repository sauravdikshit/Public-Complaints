package complaints.publiccomplaintss;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ComplaintHistory extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.complaint_history);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.complaint_history, menu);
		return true;
	}

}
