package this和super的对比;

/*
* this和super的对比
* this表示访问 本类 的对象（子类成员变量、构造方法、成员方法）
* super表示访问 父类 的对象（父类的成员变量、构造方法、成员方法）
* */
public class Student extends Parent {
    public int age=22;

    public void show(){
        int age=18;
        System.out.println("访问局部变量age:"+age);
        System.out.println("访问成员变量age:"+this.age);
        System.out.println("访问父类变量age:"+super.age);
    }
}
