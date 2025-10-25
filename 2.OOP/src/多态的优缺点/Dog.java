package 多态的优缺点;

public class Dog extends AnimalParent{

    //方法重写
    @Override
    public void eat() {
        System.out.println("狗类的吃方法");
    }
}
