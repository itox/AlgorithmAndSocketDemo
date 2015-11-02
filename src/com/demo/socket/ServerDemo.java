package com.demo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 写一个简单的socket聊天功能例子
 * 不要求界面，只需实现数据的传输
 * 一个主服务端，一个客户端
 * Created by raymax on 2015/11/2.
 */
public class ServerDemo {
    public static void main(String[] args ) throws IOException {
        ServerDemo server = new ServerDemo();
        server.start();
    }
    public void start() throws IOException{
        ServerSocket ss = new ServerSocket(8000);
        System.out.println("等待客户的连接。。。");
        Socket s = ss.accept();
        System.out.println("客户连接成功："+s.getInetAddress());
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        Reader r = new Reader(out);
        r.start();
        Writer w = new Writer(in);
        w.start();
    }
}


