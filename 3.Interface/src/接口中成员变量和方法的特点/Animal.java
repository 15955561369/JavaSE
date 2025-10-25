package 接口中成员变量和方法的特点;

public interface Animal {
    /*
    * 接口中定义的成员变量默认加入 public static final关键字
    * 因此在定义变量时直接 int 变量即可
    * 访问变量时可用Animal.属性 进行访问
    * */

    public int CODE=200;
    public static int CODE2=400;
    public static final int CODE3=500;

    /*
    * 定义的方法默认给public 和 abstract关键字变为抽象方法
    * 因此定义抽象方法时只需要void 方法名()即可
    * */
    public abstract void show();

    //JDK8+ 时，接口中也可以定义非抽象方法,需要加上default关键字
    public default void show2(){
        System.out.println("这里是接口中的非抽象方法");
    }
}
