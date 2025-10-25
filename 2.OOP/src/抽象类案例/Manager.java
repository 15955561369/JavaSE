package 抽象类案例;

public class Manager extends Staff{
    public int bonus;

    //构造方法，初始化
    public Manager(String name,int number,int salary,int bonus){
        this.name=name;
        this.number=number;
        this.salary=salary;
        this.bonus=bonus;
    }
    //重写抽象类
    @Override
    public void work() {
        System.out.println("我是"+name+"经理."+"我的工号为"+number+" 薪水"+salary+"今年的奖金为:"+bonus+" 万元");
    }
}
