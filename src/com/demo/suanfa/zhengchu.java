package com.demo.suanfa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 提示用户输入两个整数
 * 计算两个整数之间能被5整除的所有整数的和
 * Created by raymax on 2015/11/1.
 */
public class zhengchu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.println("请输入第一个数：");
        nums[0] = sc.nextInt();
        System.out.println("请输入第二个数：");
        nums[1] = sc.nextInt();
        Arrays.sort(nums);
        int sum = 0;
        for (int begin = nums[0]+1;begin<nums[1];begin++){
            if(begin % 5 == 0) {
                sum += begin;
            }
        }
        System.out.println("结果是：");
        System.out.println(sum);
    }
}
