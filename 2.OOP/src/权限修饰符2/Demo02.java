package 权限修饰符2;

import 权限修饰符1.Parent;

//非子类
public class Demo02 {
    public void show(){
        Parent parent=new Parent();
        //非子类访问受保护变量报错
        //System.out.println("不同包子类中访问受保护变量protectedAge:"+parent.protectedAge);

        System.out.println("不同包非子类中访问公开变量publicAge:"+parent.publicAge);
    }
}
