package Scanner输入;

/*
 * 1.导包 import java.util.Scanner;
 * 2.创建对象 Scanner sc = new Scanner(System.in);
 * 3.输入数据 int i=sc.nextInt() 整型
 *                sc.nextDouble() 浮点型
 *                sc.nextBoolean() 布尔型
 *                sc.next().charAt(0) 字符型
 *                sc.nextLine() 字符串
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("输入一个int数据");
//        int a=sc.nextInt();
//        System.out.println("输入的数据为"+a);
//
//        System.out.println("输入一个Double数据");
//        double b=sc.nextDouble();
//        System.out.println("输入的数据为"+b);
//
        System.out.println("输入一个Bool数据");
        boolean c=sc.nextBoolean();
        System.out.println("输入的数据为"+c);
//
//        System.out.println("输入一个Char数据");
//        char d=sc.next().charAt(0);
//        System.out.println("输入的数据为"+d);
        //消耗缓冲区的换行符
        sc.nextLine();

        System.out.println("输入一个字符串");
        String str=sc.nextLine();
        System.out.println("输入的数据为"+str);
    }
}
