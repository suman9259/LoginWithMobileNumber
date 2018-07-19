package com.example.admin.loginwithmobilenumber;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VerificationCodeActivity extends Activity implements View.OnClickListener {
    private TextView infoText,resend_text;
    private Button DoneBtn;
    private LinearLayout below_lollipop,above_lollipop,done_btn;
    private EditText below_lollipop_edt,above_lollipop_edt;
    private String mobile_number;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varification_code);
        mobile_number= getIntent().getStringExtra("mobile_number");
        viewInitiation();
        setSpannableText();
    }
    public void viewInitiation(){
        infoText=(TextView)findViewById(R.id.avc_verification_info_text);
        String msg=getString(R.string.verification_info_msg) + " " + mobile_number;
        infoText.setText(msg);
        below_lollipop=(LinearLayout) findViewById(R.id.below_lollipop);
        above_lollipop=(LinearLayout)findViewById(R.id.above_lollipop);
        done_btn=(LinearLayout)findViewById(R.id.avc_done_btn);
        done_btn.setOnClickListener(this);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            below_lollipop_edt=(EditText)findViewById(R.id.below_lollipop_edt);
            below_lollipop.setVisibility(View.VISIBLE);
            above_lollipop.setVisibility(View.GONE);
        }else {
            above_lollipop_edt=(EditText)findViewById(R.id.above_lollipop_edt);
            below_lollipop.setVisibility(View.GONE);
            above_lollipop.setVisibility(View.VISIBLE);
        }
        resend_text=(TextView)findViewById(R.id.avc_resend_txt);
    }
    private boolean doValidate() {
        boolean flag = false;
        if (Validation.isEmpty(below_lollipop_edt)) {
            Toast.makeText(this, "enter validation code", Toast.LENGTH_SHORT).show();
        } else if (!(Validation.getString(below_lollipop_edt).length() == 6)) {
            Toast.makeText(this, "Enter valid code", Toast.LENGTH_SHORT).show();
        } else {
            flag = true;
        }
        return flag;
    }

    public void setSpannableText(){
        SpannableString resend_code=new SpannableString(getString(R.string.resend_code));
        MyClickableSpan on_click_resend=new MyClickableSpan(){
            @Override
            public void onClick(View view) {
                Toast.makeText(VerificationCodeActivity.this, "Verification code send", Toast.LENGTH_SHORT).show();
            }
        };
        resend_code.setSpan(on_click_resend,20,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        // Span to set text color value
        final ForegroundColorSpan foregroundColorSpan=new ForegroundColorSpan(getResources().getColor(R.color.colorPrimaryDark));
        //for change color
        resend_code.setSpan(foregroundColorSpan,20,26,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        // Span to make text bold
        final StyleSpan styleSpan= new StyleSpan(Typeface.BOLD);
        //for change style
        resend_code.setSpan(styleSpan,20,26,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        resend_text.setText(resend_code);
        resend_text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public void onClick(View view) {
        doValidate();
    }
}
