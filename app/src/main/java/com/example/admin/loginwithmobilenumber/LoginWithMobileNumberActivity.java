package com.example.admin.loginwithmobilenumber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginWithMobileNumberActivity extends Activity implements View.OnClickListener{
    private EditText mobileNumber;
    private Button nextButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_mobile_number);
        viewInitiation();
        nextButton.setOnClickListener(this);
    }
    public void viewInitiation(){
        mobileNumber=(EditText)findViewById(R.id.alwmn_mobile_number_edtxt);
        nextButton=(Button)findViewById(R.id.alwmn_next_btn);
    }

    @Override
    public void onClick(View view) {
        if (isValidated()){

            Intent intent=new Intent(LoginWithMobileNumberActivity.this,VerificationCodeActivity.class);
            intent.putExtra("mobile_number",Validation.getString(mobileNumber));
            startActivity(intent);

        }

    }
    private boolean isValidated(){
        boolean flag=false;
        if (Validation.isEmpty(mobileNumber)){
            Toast.makeText(this, "Please Enter Your Mobile Number", Toast.LENGTH_SHORT).show();
        }else if (!Validation.isPhoneNumberValid(mobileNumber)){
            Toast.makeText(this, "Please Enter Valid Mobile Number", Toast.LENGTH_SHORT).show();
        }else {
            flag=true;
        }
        return flag;
    }
    //if have sever url
    /*private void doLogin(String mobileNumber, String deviceId, String versionName){

    }

    private void doLoginFunctionality(){
        if (isValidated()){
            String deviceId=CommonUtils.getInstance().getDeviceId(this);
            String versionName=CommonUtils.getInstance().getAppVersionName(this);
            if (CommonUtils.getInstance().isNotNullAndSitringGreaterThenZero(versionName)
                    && CommonUtils.getInstance().isNotNullAndSitringGreaterThenZero(deviceId)){
                doLogin(Validation.getString(mobileNumber),deviceId,versionName);
            }
        }
    }*/
}
