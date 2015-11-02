package com.demo.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by raymax on 2015/11/2.
 */
public class ClientDemo {
    public static void main (String[] args) throws IOException{
        ClientDemo client = new ClientDemo();
        client.open();
    }
    public void open() throws  IOException{
        Socket s = new Socket("localhost",8000);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        new Reader(out).start();
        new Writer(in).start();
    }
}
