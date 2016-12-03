package com.example.hasee.mymoviehouse.utils;

/**
 * Created by lzq on 2016/12/3.
 */
public class UrlUtils {
    public static String getTrueUrl(String img) {
        int index = img.indexOf("w");
        String url1 = img.substring(0,index);
        String url2 = img.substring(index+4);
        return url1+url2;
    }
}
