package com.demo.suanfa;

import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * 验证用户名和密码都为admin，则登陆成功
 * 否则连续输入三次后锁定终止程序
 * Created by raymax on 2015/11/1.
 */
public class yanzheng {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("请输入账户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if("admin".equals(name)&&"admin".equals(pwd)){
                System.out.println("登陆成功！");
                break;
            }else {
                count++;
                if (count<3){
                    System.out.println("登陆失败，请重新输入：");
                }else {
                    System.out.println("登陆次数过多，认证失败");
                    break;
                }
            }
        }
    }
}
