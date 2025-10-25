package 抽象类案例;

public class Demo {

    public static void main(String[] args) {
        Staff manager = new Manager("张子阳",1,60000,100);
        Staff headMan = new HeadMan("吴胜", 10,40000);
        manager.work();
        headMan.work();
    }

}
