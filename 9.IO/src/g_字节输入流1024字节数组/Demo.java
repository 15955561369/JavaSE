package g_字节输入流1024字节数组;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("IOTest.txt");
        byte[] bytes=new byte[1024];
        int len;
        while((len=inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        inputStream.close();
    }
}
