package d_异常分类;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 异常分为 编译时异常 和 运行时异常
 * 编译时异常 在编译阶段就无法通过，强制使用try catch 或者 throws抛出异常
 * 运行时异常 为RuntimeException子类，不强制进行处理
 */
public class Main {
    public static void main(String[] args) {

    }
    public static void a1(){
        try{
            String str="2025-12-29";
            SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
            yyyyMMdd.parse(str);

        }catch(ParseException e){//ParseException属于编译阶段的异常，规定强制处理
            e.printStackTrace();
        }
    }

    public static void a2(){
        int[] a=new int[3];
        System.out.println(a[3]);//ArrayIndexOutOfBoundsException属于运行时异常，不强制处理
    }
}
