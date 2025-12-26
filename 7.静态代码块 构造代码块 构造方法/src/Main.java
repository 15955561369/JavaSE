class Stu{
    /*
     * 静态代码块：类加载时执行 只执行一次，在第一次类加载时执行，即使new出多个对象也只执行一次
     * 放一些配置文件如config.properties等，在第一次类加载时就执行配置，后续类加载就不再需要配置了。*/
    static{
        System.out.println("子类:静态代码块");
    }

    /*
    * 构造代码块:与静态代码块对应，不过可执行多次，每次类加载时都会执行一次。
    * */
    {
        System.out.println("子类:构造代码块");
    }
    //构造方法
    public Stu(){
        System.out.println("子类:无参构造方法");
    }
}

public class Main{

    public static void main(String[] args) {
        new Stu();//类加载
        new Stu();

    }
}