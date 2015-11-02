package com.demo.socket;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by raymax on 2015/11/2.
 */
 class Reader extends Thread{
    OutputStream out;
    public Reader(OutputStream out){
        this.out = out;
        setDaemon(true);
    }

    public void run(){
        Scanner s = new Scanner(System.in);
        try {
            while (true){
                String str = s.nextLine();
                out.write(str.getBytes());
                out.write('\n');
                out.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
