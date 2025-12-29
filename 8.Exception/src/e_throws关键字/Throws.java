package e_throws关键字;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
* throws关键字:
* 方法使用throws关键字修饰后表明此方法可能出现异常，调用者必须对此方法进行处理(1.使用try catch  2. 调用者继续用throws向上抛)
*
* */
public class Throws {
    public static void main(String[] args) throws ParseException {//调用者继续向上抛出异常(main抛给JVM)

//        try{
//            a1();
//        }catch(Exception e){
//            e.printStackTrace();
//        }

          a1();

          a2();
    }

    public static void a1() throws ParseException {//抛出编译阶段的异常，调用者必须进行try catch处理 或者 继续向上抛出
        //一个编译阶段的异常
    }

    public static void a2() throws ArrayIndexOutOfBoundsException {//抛出运行阶段的异常，不强制调用者进行处理
        //一个运行阶段的异常
    }
}
