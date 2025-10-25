package 权限修饰符1;

/*
* 权限修饰符 变量/方法/类
* 1.private(私人) 只能在本类中访问
* 2.默认 可在本类 本包中访问
* 3.protected(受保护) 可在本类 本包 子类中(可不同包)中访问
* 4.public(公开) 随便访问
* */
public class Parent {
    private int privateAge;
    int defaultAge;
    protected int protectedAge;
    public int publicAge;

    public void show(){
        Parent parent=new Parent();
        System.out.println("本类中访问私人变量privateAge:"+parent.privateAge);
        System.out.println("本类中访问默认变量defaultAge:"+parent.defaultAge);
        System.out.println("本类中访问受保护变量protectedAge:"+parent.protectedAge);
    }
}
