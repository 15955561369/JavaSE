package 练习3;

public class Cat extends AnimalParent {

    //调用子类构造方法时先对父类进行初始化
    public Cat() {
        super();
    }
    public Cat(String name,int age) {
        super(name,age);
    }

}
