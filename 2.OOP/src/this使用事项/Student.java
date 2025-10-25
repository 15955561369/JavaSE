package this使用事项;

/*
 * this使用事项：
 * 1.访问成员变量、方法、
 * 2.访问构造器
 * */

public class Student {
    //成员变量
    String userName;
    int age;

    //有参构造
    public Student(String userName, int age) {
        System.out.println("这里是有参构造");
        //this访问成员变量
        this.userName = userName;
        this.age = age;
        //this访问方法
        this.a1();
    }
    //无参构造
    public Student(){
        //在无参构造中使用this访问构造器(有参构造)
        this("张子阳",22);
        //注意 访问构造器时必须放在首行
        System.out.println("这里是无参构造");
    }
    public void a1() {
        System.out.println("这里是方法a1");
    }
}
