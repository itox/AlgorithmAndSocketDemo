package com.demo.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raymax on 2015/10/28.
 */
public class Mapfanxing {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("January","һ��");
        map.put("February","����");
        map.put("March","����");
        map.put("April","����");
        map.put("May","����");
        map.put("June","����");
        map.put("July","����");
        map.put("August","����");
        map.put("September","����");
        map.put("October","ʮ��");

        String str = "September";
        if (map.containsKey(str)) {
            System.out.println(map.get(str));
        }else {
            System.out.println("�ʿ���û�������");
        }
    }
}
