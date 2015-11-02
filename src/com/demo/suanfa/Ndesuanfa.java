package com.demo.suanfa;

/**
 * Created by raymax on 2015/10/28.
 */
public class Ndesuanfa {
    //NµÄËã·¨
    public static void main (String[] args){
        long n=5;
        System.out.println(doNdesuanfa(n));
    }
    public static long doNdesuanfa (long n){
        if(n<1){
            System.out.println("ERROR");
            return 0;
        }else if(n == 1|| n == 2){
            return  n;
        }else {
            return n*doNdesuanfa(n-1);
        }

    }
}
