package 构造方法;

/*
* 构造方法是一种 特殊 的方法,主方法中new对象时会进入到对应的构造方法，用于给对象赋值。
* 分为 无参构造 和 有参构造，系统默认给一个无参构造,也可以自定义一个无参构造
* 格式：修饰符(默认public) 类名(){}
* 注意：1)方法名为类名 2)没有返回值
* */
public class Student {
    //成员变量
    String name;
    int age;

    //构造方法 无参构造
    public Student(){
        System.out.println("这里是构造方法，可以给对象赋值");
    }
    //无参构造和有参构造可以同时存在
    public Student(String name){
        this.name=name;
    }
    //有参构造可以重载：方法名相同，形参不同
    public Student(int age){
        this.age=age;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //show函数
    public void show(){
        System.out.println(name+"-"+age);
    }
}
