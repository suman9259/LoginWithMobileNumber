package com.example.admin.loginwithmobilenumber;

import android.widget.EditText;

public class Validation {


    //validation for edit text view Field
    public static boolean isEmpty(EditText editText){
        if (editText.getText().toString().trim().matches("")){
            return true;
        }
        return false;
    }
    public static String getString(EditText editText){
        return editText.getText().toString().trim();
    }
    /*public static boolean isEmailValid(EditText editText){
        if (editText.getText().toString().trim().matches(emailPattern)){
            return true;
        }
        return false;
    }*/
    //phone number validation
    public static boolean isPhoneNumberValid(EditText editText){
        if (editText.getText().toString().trim().length()==10){
            return true;
        }
        return false;
    }
}
