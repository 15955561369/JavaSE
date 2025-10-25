package final关键字;

/*
* 关键字final(最终态)
* 修饰类、成员属性、成员方法
* 1.被修饰的类 无法继承
* 2.被修饰的成员属性 无法修改(必须先初始化)
* 3.被修饰的成员方法 无法重写
* */
public class Student extends Parent{
    public final int age=23;

    @Override
    public void a1(){

    }
}
