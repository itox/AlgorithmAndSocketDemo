package com.demo.suanfa;

/**
 * Created by raymax on 2015/10/29.
 */
class Thfangfa extends Thread{
    public void run(){
        System.out.println(this.getName()+","+this.getId());
        for (int i=0;i<100;i++){
            System.out.println("����������Ҳ�����");
        }
        System.out.println("����over��");
    }
}
