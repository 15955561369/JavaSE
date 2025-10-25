package super访问父类中的构造方法;

public class Parent {
    //父类中也会默认给一个无参构造

    public Parent() {
        System.out.println("这里是父类的无参构造方法");
    }

    public Parent(int age) {
        System.out.println("这里是父类的有参构造方法");
    }
}
