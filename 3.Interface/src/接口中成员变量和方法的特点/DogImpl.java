package 接口中成员变量和方法的特点;

public class DogImpl implements Animal{
    //进行抽象方法重写
    @Override
    public void show() {
        System.out.println("这里是重写的抽象方法");
    }
}
