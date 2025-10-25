package 继承中访问变量的顺序;

/*
* 在子类方法中访问元素有如下特点
* 就近原则
* 1.先在子类方法中找元素
* 2.然后在子类成员变量中找元素
* 3.最后在父类中找元素
* */
public class Student extends Parent{
    public int height=175;
    public int age=20;
    public float weight=86.00f;

    public void show(){
        int height=160;
        int age=15;
        float weight=65.99f;
        System.out.println("身高:"+height+" 体重:"+weight+" 年龄:"+age);
    }
}
