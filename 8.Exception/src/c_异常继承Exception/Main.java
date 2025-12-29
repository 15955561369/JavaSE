package c_异常继承Exception;
/*
*   Throwable
*      ↓(继承)
*   Exception
*      ↓(继承)
*    各种异常
*/

public class Main  {
    public static void main(String[] args) {
        try{
            a1();//数组索引越界异常 ArrayIndexOutOfBoundsException

        }catch(ArrayIndexOutOfBoundsException e){
            //catch顺序捕获，先捕获数组越界异常
            System.out.println("单独捕获数组索引越界异常");
            e.printStackTrace();//打印详细异常信息

        }catch(Exception e){//捕获所有的异常
            System.out.println("捕获所有的异常");
            System.out.println(e.getMessage());//详细异常信息
            System.out.println(e.toString());//异常类型
            e.printStackTrace();//控制台输出异常信息
        }
    }

    public static void a1(){
        int[] a = {1,2,3};
        System.out.println(a[0]);
        String str="1234";
        int i = Integer.parseInt(str);
        System.out.println(i);
        Integer num=null;
        System.out.println(num.intValue());
    }
}
