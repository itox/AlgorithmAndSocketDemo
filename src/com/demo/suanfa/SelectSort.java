package com.demo.suanfa;

/**
 * 选择排序
 * 实现10-100随机数字的排序
 * Created by raymax on 2015/11/1.
 */
public class SelectSort {
    //选择排序方法
    public static void selectionSort(int[] number){
        for(int i =0;i<number.length-1;i++){
            int m = i;
            for (int j = i + 1;j<number.length;j++){
                if(number[j]<number[m])
                    m=j;
            }
            if(i!= m)
                swap(number,i,m);
        }
    }
    //用于交换数组的索引为i 、 j 的元素
    private static void swap (int[] number,int i,int j){
        int t;
        t = number[i];
        number[j]=t;
    }

    public static void main(String[] args){
        //定义一个数组
        int[] num = new int[10];
        for(int i = 0;i<num.length;i++){
            num[i] = (int)(Math.random()*100)+1;
        }
        //排序
        selectionSort(num);
        for (int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
