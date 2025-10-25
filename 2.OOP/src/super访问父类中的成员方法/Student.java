package super访问父类中的成员方法;


/*
* 访问父类的成员方法时根据 就近原则
* 1.先访问子类的成员方法
* 2.再访问父类的成员方法
* 3.报错
*
* 也可以使用super.成员方法 直接访问父类的成员方法
* */
public class Student extends Parent {

    public void show() {
        super.show();
        System.out.println("这里是子类的成员方法");
    }
}
