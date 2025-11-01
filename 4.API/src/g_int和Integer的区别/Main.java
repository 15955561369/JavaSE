package g_int和Integer的区别;

import javafx.beans.binding.ObjectExpression;

/*
* 基本数据类型和包装类的区别: int 和 Integer
* 1.声明方式不同:
*   int直接赋值即可
*   Integer需要new出对象分配内存空间
* 2.存储地址不同:
*   int直接存储在栈空间中
*   Integer是对象，拥有属性和方法，故其内存地址存储在堆空间中，进行调用
* 3.初始值不同:
*   int初始值为0
*   Integer(对象)初始值为null
* */
public class Main {
    public static void main(String[] args) {
        int intA=100;
        //等价于new Integer(60) 先new出Integer对象，然后将Integer对象的value值赋值为60
        Integer integerA =60;
        System.out.println(intA);
        //Integer重写了父类Object的toString方法，直接输出值
        System.out.println(integerA);

        //对比
        TestInteger testInteger = new TestInteger(60);
        System.out.println(testInteger);
    }
}
