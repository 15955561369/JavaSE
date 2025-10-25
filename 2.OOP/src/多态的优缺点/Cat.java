package 多态的优缺点;

public class Cat extends AnimalParent{

    //方法重写
    @Override
    public void eat() {
        System.out.println("猫类的吃方法");
    }
}
