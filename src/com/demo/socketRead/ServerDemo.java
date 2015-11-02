package com.demo.socketRead;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JAVA SOCKET编程，从服务器读几个字符，再写入本地控制台
 * Created by raymax on 2015/11/2.
 */
public class ServerDemo {
    public static void main(String[] args)
        throws IOException{
        ServerSocket ss = new ServerSocket(8000);
        Socket s = ss.accept();
        OutputStream out = s.getOutputStream();
        out.write("从服务器读取几个字符！\n".getBytes());
        out.flush();
        out.close();
    }
}
