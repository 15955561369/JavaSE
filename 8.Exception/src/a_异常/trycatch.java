package a_异常;

/*
 * try{
 * }catch(){
 * }处理异常
 */
public class trycatch {
    public static void main(String[] args) {
        //默认情况下,JVM遇到异常后不会再执行后面的代码，而try catch处理异常后就可以执行后面的代码
        //出现异常时会new出异常对象,而catch可以捕获这个异常对象
        try{
            a1();//数组索引越界异常 ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){ //catch捕获可能出现的异常
            //执行异常处理
            System.out.println("数组索引越界");
            e.printStackTrace();//打印详细异常信息
        }
        System.out.println("继续执行下面的代码");
    }

    public static void a1(){
        int[] a = {1,2,3};
        System.out.println(a[3]);
    }
}
