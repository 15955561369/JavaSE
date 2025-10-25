package 权限修饰符1;

public class Demo01 {
    public void show(){
        Parent parent=new Parent();
        //访问私人变量报错
        //System.out.println("本包中访问私人变量privateAge:"+parent.privateAge);
        //访问默认变量
        System.out.println("本包中访问默认变量defaultAge:"+parent.defaultAge);
    }
}
