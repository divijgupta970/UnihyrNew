package com.unihyr.Unihyr.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String convertTimetoDate(long time){
        String pattern="dd MMM yyyy";
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        return dateFormat.format(new Date(time));
    }
    public static void dialNumber(Context mCtx, String phoneNumber){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(mCtx.getPackageManager()) != null) {
            mCtx.startActivity(intent);
        }
    }
}
