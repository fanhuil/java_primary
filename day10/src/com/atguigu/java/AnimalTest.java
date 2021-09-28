package com.atguigu.java;

import java.util.Arrays;

/*
 * 面向对象的特征一：封装与隐藏
 *
 * 三、封装性的体现，需要权限修饰符来配合
 *  1、Java规定的4中权限：private、缺省、protected、public
 *  2、4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *  3、具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *          修饰类的话，只能用：缺省、public
 * */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println();
        String info = Arrays.toString(new int[]{1,2,3,4});
        System.out.println(info);
    }
}

class Animal {
    private String name;
    private int age;
    private int legs; // 腿的个数

    // 对属性的设置
    public void setLegs(int l) {
        if (l > 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }
    // 对属性的获取
    public int getLegs(){
        return legs;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
    }


}
