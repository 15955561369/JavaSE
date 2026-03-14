package e_工具类;

/*
* 工具类:将功能打包好放入一个类中方便操作 比如Arrays、System、String都是工具类
* 1.private修饰构造方法，即工具类无法实例化 无法new
* 2.static修饰成员方法实现通过类名访问，即不需要创建对象(绕过new)
* */

import java.util.Arrays;

//自定义工具类Test
public final class Test {
    //最好将构造方法私有化并加上final关键字，防止被实例化和继承，这样静态属性和静态方法就只能通过 类名. 进行访问了
    //如果没有将构造方法私有化也没有影响，只要是静态方法，就可以通过类名. 进行访问。

    //private修饰无参构造方法
     private Test(){

    }

    //static修饰成员方法，可通过类名.方法进行访问
    public static String sort(int []nums){
        Arrays.sort(nums);
        return Arrays.toString(nums);
    }
}
