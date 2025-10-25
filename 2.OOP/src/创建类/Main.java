package 创建类;
/*
* 主方法再单独创建一个类
* */

public class Main {
    public static void main(String[] args) {
        //创建对象
        创建类.Phone phone1=new 创建类.Phone();
        创建类.Phone phone2=new 创建类.Phone();
        //赋值
        phone1.brand="小米";
        phone2.brand="华为";
        phone1.price=1999.0;
        phone2.price=2399.0;
        //调用
        phone1.call(phone1.brand);
        phone2.sendMes(phone2.brand);


    }
}
