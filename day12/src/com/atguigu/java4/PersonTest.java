package com.atguigu.java4;

/*
* 面向对象特征之三：多态性
* 1、理解多态性：可以理解为一个事物的多种形态
* 2、何为多态性
*       对象的多态性：父类的引用指向子类的对象
* 3、多态的使用：虚拟方法调用
*       有了对象的多态以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
*       总结：编译，看左边；运行，看右边
* 4、多态性的使用前提：有继承关系；方法的重写
* 5、对象的额多态性：只使用于方法，不适用于属性
*
*
*
*
*/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        // 多态
        Person p2 = new Man();
        p2.eat();
        p2.walk();
    }
}
