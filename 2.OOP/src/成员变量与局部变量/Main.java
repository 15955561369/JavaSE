package 成员变量与局部变量;
/*
* 成员变量：类中的 方法外的变量
* 局部变量：类中的 方法内的变量
* */
public class Main {
    //成员变量
    String name;
    int age;
    public void work(int age){
        //局部变量
        int a=0;
        //若局部变量与成员变量相同，使用this.age访问成员变量
        this.age=age;
    }
    public void work2(int a){
        //若局部变量与成员变量不同，使用age即可访问成员变量
        age=a;
    }
}
