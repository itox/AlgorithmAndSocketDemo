package com.demo.socket;

import java.io.InputStream;

/**
 * Created by raymax on 2015/11/2.
 */
class Writer extends Thread{
    InputStream in;
    public Writer(InputStream in){
        this.in=in ;
    }
    public void run(){
        try {
            int b;
            while ((b=in.read())!= -1){
                System.out.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
