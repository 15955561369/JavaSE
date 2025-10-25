package 接口与类的关系;

//类可以在继承一个父类的同时实现多个接口
public class StudentImpl extends Parent implements Parent1, Parent2, Parent3 {


    @Override
    public void a1() {
        System.out.println("重写方法a1");
    }

    @Override
    public void a2() {
        System.out.println("重写方法a2");
    }

    @Override
    public void a3() {
        System.out.println("重写方法a3");
    }
}
