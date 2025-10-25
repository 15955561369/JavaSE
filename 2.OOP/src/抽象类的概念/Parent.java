package 抽象类的概念;

/*
* 抽象方法指没有具体指明事物的方法，不写方法体，后续功能在子类的重写方法中体现
* 抽象方法对应的类为抽象类
* 无法创建抽象类的对象,只能通过子类实例化,因此属于抽象多态
* */

//抽象类
public abstract class Parent {

    //抽象方法eat,不写方法体
    //类名也要加上abstract
    public abstract void eat();

    //抽象类下也可以有非抽象方法
    public void get(){
        System.out.println("非抽象方法get");
    }
}
