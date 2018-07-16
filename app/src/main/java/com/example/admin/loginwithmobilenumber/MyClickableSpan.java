package com.example.admin.loginwithmobilenumber;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public class MyClickableSpan extends ClickableSpan {
    @Override
    public void onClick(View view) {
    }
    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(false);
    }

}
