package 抽象类的概念;

public class Student extends Parent{

    //对父类中所有的抽象方法进行重写
    @Override
    public void eat() {

        //后续的功能
        System.out.println("这里是重写的抽象方法eat");
    }
}
