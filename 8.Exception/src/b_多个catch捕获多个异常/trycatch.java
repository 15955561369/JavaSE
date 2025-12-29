package b_多个catch捕获多个异常;

public class trycatch {
    public static void main(String[] args) {

        try{
            a1();//数组索引越界异常 ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){ //catch捕获可能出现的异常
            //catch捕获的异常需要和出现的异常相对应，如果不对应，JVM仍然不会执行下面的代码
            System.out.println("数组索引越界");
            e.printStackTrace();//打印详细异常信息
        }catch(NumberFormatException e){
            //多个catch捕获多种异常
            System.out.println("类型转换异常");
            e.printStackTrace();
        }catch(NullPointerException e){

            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("下面的代码");
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