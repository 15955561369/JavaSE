package 多态的优缺点;

public class Man extends AnimalParent{

    //方法重写
    @Override
    public void eat() {
        System.out.println("人类的吃方法");
    }
}
