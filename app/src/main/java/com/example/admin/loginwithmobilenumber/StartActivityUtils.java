package com.example.admin.loginwithmobilenumber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Suman on 17-02-2018.
 */
public class StartActivityUtils {
    /***
     * start activity
     ***/
    public static void doStartActivity(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
    }

    /***
     * start activity with finish activity
     ***/
    public static void doStartActivityFinish(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.finish();
    }
    /***
     * start activity  activity with intent
     ***/
    public static void doStartActivityWithPassIntent(Activity activity, Intent intent) {
        activity.startActivity(intent);
    }
    /***
     * start activity with finish activity with intent
     ***/
    public static void doStartActivityFinishWithIntent(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.finish();
    }


    /***
     * start activity with new task activity
     ***/
    public static void doStartActivityWithNewTask(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        activity.startActivity(intent);
    }

    /***
     * start activity new task with intent activity
     ***/
    public static void doStartActivityNewTaskWithIntent(Activity activity, Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        activity.startActivity(intent);
    }



    /***
     * start activity  with left side animation
     ***/
    public static void doStartActivityWithLeftAnimation(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    /***
     * start activity  with top up animation
     ***/
    public static void doStartActivityWithBottumToTopAnimation(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }

    /***
     * start activity  with top up animation with intent
     ***/
    public static void doStartActivityWithBottumToTopAnimationWithIntent(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }
/***
     * start activity  with top up animation with intent for result
     ***/
    public static void doStartActivityForResultWithBottumToTopAnimationWithIntent(Activity activity, Intent intent, int request_code) {
        activity.startActivityForResult(intent,request_code);
        activity.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }

    /***
     * start activity  with right side animation
     ***/
    public static void doStartActivityWithRightAnimation(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /***
     * start activity for result with right side animation
     ***/
    public static void doStartActivityForResultWithRightAnimation(Activity activity, Class cls, int request_code) {
        Intent intent = new Intent(activity, cls);
        activity.startActivityForResult(intent, request_code);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


    /***
     * start activity for result with right side animation with pass intent
     ***/
    public static void doStartActivityForResultWithRightAnimationWithPassIntent(Activity activity, int request_code, Intent intent) {
        activity.startActivityForResult(intent, request_code);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /***
     * start activity for result with  pass intent
     ***/
    public static void doStartActivityForResultWithPassIntent(Activity activity, int request_code, Intent intent) {
        activity.startActivityForResult(intent, request_code);
    }


    /***
     * start activity  with left side animation with finish activity
     ***/
    public static void doStartActivityWithLeftAnimationFinish(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    /***
     * start activity  with left side animation with finish activity with intent
     ***/
    public static void doStartActivityWithLeftAnimationFinishWithIntent(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    /***
     * start activity  with right side animation with finish activity
     ***/
    public static void doStartActivityWithRightAnimationFinish(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    /***
     * start activity  with right side animation with finish activity with pass object in intent
     ***/
    public static void doStartActivityWithRightAnimationFinishWithPassIntent(Activity activity, Intent intent) {
        if(intent!=null){
            activity.startActivity(intent);
            activity.finish();
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /***
     * start activity  with right side animation  activity with pass object in intent
     ***/
    public static void doStartActivityWithRightAnimationWithPassIntent(Activity activity, Intent intent) {
        if(intent!=null){
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /***
     * start activity  with right side animation  activity with pass object in intent with finish
     ***/
    public static void doStartActivityWithRightAnimationWithPassIntentFinish(Activity activity, Intent intent) {
        if(intent!=null){
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            activity.finish();
        }
    }


    /***
     * start activity  with left side animation with activity new task (clear all previous task)
     * but in case minor issue is occur of white screen fluctuation
     ***/
    public static void doStartActivityWithLeftAnimationNewTask(Activity activity, Class cls) {
        doHideKeyBoard(activity);
        Intent intent = new Intent(activity, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // for remove white page problem
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }



    /***
     * start activity  with left side animation with activity new task with intent(clear all previous task)
     * but in case minor issue is occur of white screen fluctuation
     ***/
    public static void doStartActivityWithLeftAnimationNewTaskWithIntent(Activity activity, Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // for remove white page problem
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    /***
     * start activity  with left side animation with activity  with intent
     ***/
    public static void doStartActivityWithLeftAnimationWithIntent(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }



    /***
     * start activity  with right side animation with activity new task (clear all previous task)
     ***/
    public static void doStartActivityWithRightAnimationNewTask(Activity activity, Class cls) {
        Intent intent = new Intent(activity, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // for remove white page problem
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    /***
     * start activity  with right side animation with activity new task (clear all previous task) with intent
     ***/
    public static void doStartActivityWithRightAnimationNewTaskWithIntent(Activity activity, Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // for remove white page problem
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }




    /***
     * start activity  with right side animation with activity clear top (clear all previous task) with intent
     ***/
    public static void doStartActivityWithRightAnimationClearTopWithIntent(Activity activity, Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }




    /***
     * start activity  new task with intent
     ***/
    public static void doStartActivityWithIntentNewTask(Activity activity, Intent intent) {
        if(intent!=null){
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            activity.startActivity(intent);
        }

    }





    /***
     * start activity  new task (clear all previous task) and remove white page problem
     ***/
    public static void doStartActivityClearTopWithIntent(Activity activity, Intent intent) {
        if(intent!=null){
            //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // for remove white page problem
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

            activity.startActivity(intent);
        }

    }



    /***
     * start activity with left animation new task (clear all previous task) and remove white page problem
     ***/
    public static void doStartActivityWithLeftAnimationClearTopWithIntent(Activity activity, Intent intent) {
        if(intent!=null){
            //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            // for remove white page problem
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        }

    }



    /***
     * finish activity
     ***/
    public static void goBack(Activity activity) {
        activity.finish();
    }

    /***
     * finish activity with animation
     ***/
    public static void goBackWithLeftAnimation(Activity activity) {
        doHideKeyBoard(activity);
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }



    /***
     * finish activity with top to bottum animation
     ***/
    public static void goBackWithTopToBottomAnimation(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
    }




    /***
     * finish activity with right side animation animation
     ***/
    public static void goBackWithRightAnimation(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


    /***
     * start activity  with right side animation with boolean flag
     ***/
    public static void doStartActivityWithIntentRightAnimation(Activity activity, Class cls, boolean flag) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("flag",flag);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /***
     * start activity  with right side animation with boolean flag finish
     ***/
    public static void doStartActivityWithIntentRightAnimationFinish(Activity activity, Class cls, boolean flag) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("flag",flag);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        activity.finish();




    }
    public static void doHideKeyBoard(Context context) {

        View currentFocus;

        InputMethodManager inputManager =
                (InputMethodManager) context.
                        getSystemService(Context.INPUT_METHOD_SERVICE);

        currentFocus = ((Activity) context).getCurrentFocus();
        if (currentFocus != null) {
            inputManager.hideSoftInputFromWindow(
                    currentFocus.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }


    }


/*


    */
/***
     * start activity with right side animation for exit
     ***//*

    public static void doStartActivityRightAnimationForExit(Activity activity, Intent intent) {
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        activity.startActivity(intent);
    }
*/

}
