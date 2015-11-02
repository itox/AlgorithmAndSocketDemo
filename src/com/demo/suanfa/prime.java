package com.demo.suanfa;

/**
 * 检查数字是否为质数
 * Created by raymax on 2015/11/1.
 */
public class prime {
    public boolean prime(int n){
        if(n<=0)
            System.exit(0);
        for(int i = 2; i<=n;i++)
            for(int j = 2;j<=Math.sqrt(i);j++)
                if ((n % j == 0)&&(j!=n))
                    return false;
        return true;
    }
}
