package com.atguigu.java;

/*
 * 类中属性的使用
 * 属性（成员变量） vs 局部变量
 * 1.相同点
 *      1.1定义变量的格式一样
 *      1.2先声明，后使用
 *      1.3变量都有其对应的作用域
 * 2.不同点
 *       2.1在类中声明的位置不同
 *          属性：直接定义在类的{}中
 *          局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *       2.2关于权限修饰符的不同
 *          属性：可以在声明属性时，指明其权限，使用权限修饰符
 *               常用的权限修饰符：private、public、缺省、protected
 *          局部变量：不可以使用权限修饰符
 *       2.3默认初始化值得情况
 *          属性：类的属性，根据其情况，都有默认初始化值。
 *              整形（byte、short、int、long）：0
 *              浮点型（float、double）：0.0
 *              字符型（char）:0（或者'\u0000'）
 *              布尔值（boolean）：false
 *
 *              引用数据类型：null
 *          局部变量：没有默认初始化值。
 *               意味着，我们在调用局部变量之前，一定要显式赋值
 *               特别地：形参在调用时，我们赋值即可。
 *       2.4在内存中加载的位置
 *          属性：加载到对空间区（非static）
 *          局部变量：加载到栈空间区
 * */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
    }
}

class User {
    String name;
    int age;
    boolean isMale;

    public void talk(String language) { // language:形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "烙饼"; // 局部变量
        System.out.println("北方人喜欢吃：" + food);
    }
}
