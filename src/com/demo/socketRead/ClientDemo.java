package com.demo.socketRead;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by raymax on 2015/11/2.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",8000);
        InputStream in = s.getInputStream();
        int b;
        while ((b = in.read())!= -1){
            System.out.write(b);
        }
    }
}
