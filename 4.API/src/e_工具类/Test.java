package e_工具类;

/*
* 工具类:将功能打包好放入一个类中方便操作 比如Arrays、System、String都是工具类
* 1.private修饰构造方法，即工具类无法实例化 无法new
* 2.static修饰成员方法实现通过类名访问，即不需要创建对象(绕过new)
* */

import java.util.Arrays;

//自定义工具类Test
public class Test {

    //private修饰无参构造方法
     private Test(){

    }

    //static修饰成员方法，可通过类名.方法进行访问
    public static String sort(int []nums){
        Arrays.sort(nums);
        return Arrays.toString(nums);
    }
}
