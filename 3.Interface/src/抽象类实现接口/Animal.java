package 抽象类实现接口;

//本案例通过抽象类Animal作为实现类 实现接口JumpInterface
public abstract class Animal implements JumpInterface{
    //成员变量
    private String name;
    private int age;
    //构造方法
    public Animal(String name,int age) {
        this.name=name;
        this.age=age;
    }
    //抽象方法
    public abstract void eat();

    //若Animal不是抽象类，那么实现类就需要对接口中的抽象方法Jump重写
//    @Override
//    public void jump() {
//
//    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


}
