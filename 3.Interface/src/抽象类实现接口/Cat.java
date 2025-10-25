package 抽象类实现接口;

public class Cat extends Animal{
    //定义构造方法进行初始化
    public Cat(String name,int age) {
        super(name,age);
    }
    //重写抽象方法eat和jump
    @Override
    public void eat() {
        System.out.println("我是猫类,我爱吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("我是猫类，我跳得很高");
    }
}
