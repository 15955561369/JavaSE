package 抽象类案例;

public class HeadMan extends Staff{

    //构造方法进行初始化
    public HeadMan(String name, int number,int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
    //重写抽象类
    @Override
    public void work() {
        System.out.println("我是"+name+"产品经理."+"我的工号为"+number+" 薪水"+salary);
    }
}
