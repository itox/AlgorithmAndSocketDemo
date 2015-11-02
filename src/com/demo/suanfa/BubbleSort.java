package com.demo.suanfa;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * 从最左边开始，遇到小的就置换。
 * Created by raymax on 2015/11/1.
 */
public class BubbleSort {
    public static void main (String [] args){
        int [] arr = new int[10];
        for (int i = 0;i<arr.length;i++){
            Random ran = new Random();
            arr [i] = ran.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        System.out.println("star");
        for (int i = 0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1]= t;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("over");
        System.out.println(Arrays.toString(arr));
    }

}
