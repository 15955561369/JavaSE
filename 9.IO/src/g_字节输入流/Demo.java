package g_字节输入流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        //字节输入流读取硬盘的数据
        FileInputStream f = new FileInputStream("IOTest.txt");
        //read读取单字节数据
//        int read=f.read();
//        System.out.println((char) read);
//        while(read!=-1){//若返回-1表示读取结束
//            System.out.print((char) read);
//            read=f.read();
//        }

        //优化一下
//        int by;
//        while((by=f.read())!=-1){
//            System.out.print((char) by);
//        }

        //read读取字节型数组
        //数组大小为读取数据字节数，读取结果存放在bytes数组里
        byte[] bytes = new byte[5];
        int len=f.read(bytes);//返回实际读取长度(数据不够长情况),读不到数据时返回-1
        System.out.println("第一次读取");
        System.out.println(new String(bytes));//将byte数组转为String类型

        System.out.println("第二次读取");
        len = f.read(bytes);
        System.out.println(new String(bytes));// \r\n也算在字节数里面

        System.out.println("第三次读取");
        len = f.read(bytes);
        System.out.println(new String(bytes,0,len));//指定长度
    }
}
