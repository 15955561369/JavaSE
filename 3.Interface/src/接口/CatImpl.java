package 接口;

//定义实现类CatImpl 实现 接口Animal
public class CatImpl implements Animal {


    //也要对所有的抽象方法进行重写
    @Override
    public void eat() {
        System.out.println("我是猫类,重写Animal接口的eat方法");
    }
}
