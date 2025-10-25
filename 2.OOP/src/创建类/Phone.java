package 创建类;
/*
* 1.定义一个类 public class 类名
* 2.属性 就是定义变量
* 3.行为 定义函数，也称方法。定义时不要主方法的static
* 4.在主方法中赋值和调用类的属性或者行为
* */

public class Phone {
    //属性
    String brand;
    Double price;
    //行为
    public void call(String brand){
        System.out.println(brand+"拨打电话");
    }
    public void sendMes(String brand){
        System.out.println(brand+"发送信息");
    }
}
