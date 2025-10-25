package 导包练习;

import 导包.Parent;
//导入包下所有的类
import 导包.*;


/*
* 使用别的包下的类时需要导入相应的类
* 也可以使用全限定路径(源根路径),如 导包练习/Main
* */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        new 导包.Student();


    }
}
