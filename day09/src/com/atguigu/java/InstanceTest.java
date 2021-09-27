package com.atguigu.java;

/*
* 二、内存解析的说明
* 1、引用类型的变量，只能存储两类值：null或地址值（含变量的类型）
* 三、匿名对象的使用
* 1、理解：我们创建的对象，没有显式地赋值给一个变量。
*
*
*
* */

public class InstanceTest {
    public static void main(String[] args) {
        // 匿名对象
        // new Phone().sendEmail();

    }
}

class Phone{
    double price; // 价格

    public void  sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}