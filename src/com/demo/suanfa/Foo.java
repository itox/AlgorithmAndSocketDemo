package com.demo.suanfa;

/**
 * 现有一个32位的整型变量value和一个有32个元素的数组a[32]
 * 对value随机赋值
 * 让a[n]的值等于“位N”的值，1<=n<=31
 * Created by raymax on 2015/11/1.
 */
public class Foo {
    public static void main(String[] args){
        //产生随机数
        int random = (int) (Math.random() * Integer.MAX_VALUE + 1);
        //转换成二进制字符串
        String str = Integer.toBinaryString(random);
        //转换二进制时最前面的零被省略，补上省略的零
        if (str.length()<32){
            for(int j= 0;j<32-str.length();j++){
                str="0"+str;
            }
        }
        //给数组赋值
        int[] a = new int[32];
        for (int i = 0;i<str.length();i++){
            a[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
