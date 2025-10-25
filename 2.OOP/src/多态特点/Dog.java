package 多态特点;

/*
* 多态基本要求
* 1)出现继承 或实现(接口)
* 2)子类进行方法重写
* 3)父类(接口)的引用指向子类(实现类)的对象
*
* 多态的形式:
* 具体类多态、抽象类多态、接口多态,
* 此属于具体类多态
* */
public class Dog extends AnimalParent{
    public int age=40;
    public int weight=80;

    @Override
    public void eat(){
        System.out.println("这里是重写的父类方法eat");
    }

}
