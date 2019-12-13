package com.unihyr.Unihyr.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String convertTimetoDate(long time){
        String pattern="dd MMM yyyy";
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        return dateFormat.format(new Date(time));
    }
}
