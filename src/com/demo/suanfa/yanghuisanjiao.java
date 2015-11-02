package com.demo.suanfa;

import javax.xml.soap.SAAJResult;

/**
 * 打印杨辉三角
 *          1
 *         1 1
 *        1 2 1
 *       1 3 3 1
 *      1 4 6 4 1
 *     1 5 10 10 1
 * Created by raymax on 2015/11/1.
 */
public class yanghuisanjiao {
    public static void main(String [] args){
        int n = 6;
        for(int i = 1;i<=n;i++){
            System.out.print(" ");

        //打印空格后面的字符，从第一列开始往后打印
        for (int j = 1;j <= i; j++){
            System.out.println(num(i,j)+" ");
        }
        }
        System.out.println();
    }


public  static int num(int x ,int y){
    if (y == 1 || y == x){
        return 1;
    }
    int c = num(x-1,y-1)+num(x - 1,y);
    return c;
}
}