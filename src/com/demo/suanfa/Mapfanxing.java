package com.demo.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raymax on 2015/10/28.
 */
public class Mapfanxing {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("January","一月");
        map.put("February","二月");
        map.put("March","三月");
        map.put("April","四月");
        map.put("May","五月");
        map.put("June","六月");
        map.put("July","七月");
        map.put("August","八月");
        map.put("September","九月");
        map.put("October","十月");

        String str = "September";
        if (map.containsKey(str)) {
            System.out.println(map.get(str));
        }else {
            System.out.println("词库中没有这个词");
        }
    }
}
