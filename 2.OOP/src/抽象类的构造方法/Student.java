package 抽象类的构造方法;

public class Student extends Parent{

    //子类的构造方法
    public Student(){
        super();//访问子类的构造方法时默认先访问父类的构造方法，见super软件包
    }
    public Student(int age){
        super(age);
    }

    //抽象方法重写
    @Override
    public void eat() {
        System.out.println("重写的eat抽象方法");
    }
}
