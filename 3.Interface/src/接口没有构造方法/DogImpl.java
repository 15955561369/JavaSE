package 接口没有构造方法;

public class DogImpl extends Object implements Animal {

    //在继承中，执行子类的构造方法时需先执行父类的构造方法进行初始化，但在DogImpl实现类中没有继承父类，怎么办呢？
    public DogImpl(){
        super();
        System.out.println("实现类的无参构造方法");
    }
    //其实每个类在没有出现继承时，都会默认继承Object父类
    //super()访问Object的无参构造
}
