package main方法使用事项;

public class Test {
    /*
    * main方法在java虚拟机上执行，自动执行类名.main,因此main需要加入static关键字,同时public权限修饰
    * 因为main为静态方法，所以main在执行本类的其他非静态方法时需要先创建对象，执行静态方法不用
    * */
    public static void main(String[] args) {

        //args方便开发者在执行程序时传参
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        //访问非静态方法
        Test test01=new Test();
        test01.a1();
        //访问静态方法 类名.方法
        Test.a2();
    }
    //非静态方法
    public void a1(){

    }
    //静态方法
    public static void a2(){

    }
}
