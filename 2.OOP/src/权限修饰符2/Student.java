package 权限修饰符2;

import 权限修饰符1.Parent;

//子类
public class Student extends Parent {
    public void show(){
        System.out.println("不同包子类中访问受保护变量protectedAge:"+protectedAge);
    }
}
