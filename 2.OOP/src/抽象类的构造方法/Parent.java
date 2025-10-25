package 抽象类的构造方法;

/*
* 抽象类中也可以有变量、构造方法
* */
public abstract class Parent {
    public int age=28;
    public final int code=200;

    //无参构造方法
    public Parent() {
        System.out.println("这里是Parent的无参构造");
    }
    //有参构造
    public Parent(int age) {
        this.age=age;
        System.out.println("这里是Parent的有参构造"+this.age);
    }

    //抽象方法eat
    public abstract void eat();
}
