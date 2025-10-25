package a_什么是api;

//导入相应的包
import java.util.*;
//java.lang包不需要导入

/*
* API(应用编程接口) 就是实现各种接口的类库(官方JDK已经将其集成好在rt.jar包下)
* 比如random类库、Scanner类库
* */
public class Main {
    public static void main(String[] args) {
        //Random类实现接口java.io.Serializable
        Random random=new Random();
        int num=random.nextInt(100);//0-99的随机数
        System.out.println(num);
        //Scanner类实现接口java.io.Closeable
        Scanner sc = new Scanner(System.in);
        int num2=sc.nextInt();
        System.out.println(num2);
        //消耗缓冲区的换行符
        sc.nextLine();

        String str=sc.nextLine();
        System.out.println(str);

        String str2=new String();
    }
}
