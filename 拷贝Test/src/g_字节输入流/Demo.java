package g_字节输入流;

import java.io.FileInputStream;
import java.io.IOException;

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
        int by;
        while((by=f.read())!=-1){
            System.out.print((char) by);
        }
    }
}
