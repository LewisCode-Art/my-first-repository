package org.amalitech.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Index extends Activity {

	ImageView User_Image;
	EditText Email_address,password;
	Button SignUp;
	TextView login;
	
	int email_lngth_i = 8;
	int password_lngth_i = 8;
	
	int email_max_lngth_i = 45;
	int password_max_lngth_i = 32;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index_layout); //ask here
		
		User_Image = (ImageView) findViewById(R.id.User_Image);
		Email_address = (EditText) findViewById(R.id.Email_address);
		password = (EditText) findViewById(R.id.password);
		SignUp = (Button) findViewById(R.id.SignUp);
		login = (TextView) findViewById(R.id.login);
		
		SignUp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			if (v.getId()==SignUp.getId()) {
				//SignUp.setText("SignUp Now!");
				//get content of email textfield and convert it to string.
				//trim to remove whitespaces
				//Get length of the content
				
				//String Email_address_cntnt_str = Email_address.getText().toString().trim();
				//int Email_address_cntnt_str_len = Email_address_cntnt_str.length();
				
				//if (Email_address_cntnt_str_len < email_lngth_i) {
					//email is not qualified
					
				//}else {
					//if ( )
				}
				
			}
		//	}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	
	
}
