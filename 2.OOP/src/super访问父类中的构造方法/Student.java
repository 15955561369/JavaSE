package super访问父类中的构造方法;


/*
* 继承中，访问子类的构造方法时需先访问父类的构造方法
* 因为初始化子类前需要先对父类进行初始化
* 首行通过super构造器就可以访问父类的构造函数进行初始化
*
* tips: 不写super时会默认自动进入父类的无参构造
* */
public class Student extends Parent{

    //无参构造
    public Student() {
        //super();//访问父类的无参构造
        System.out.println("这里是子类的无参构造方法");
    }
    //有参构造
    public Student(int age) {
        super(20);//访问父类的有参构造
        System.out.println("这里是子类的有参构造方法");
    }
}
