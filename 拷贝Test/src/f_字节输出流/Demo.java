package f_字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        //抽象类OutPutStream
        OutputStream fileOutputStream = new FileOutputStream("IOTest.txt");//见抽象类
        fileOutputStream.write(97);//自动创建文件并写入


        //字节输出流写入文件的方式
        //方式1:单字节写入
        fileOutputStream.write(97);
        //方式2:写入字节数组
        byte[] bytes = {97,98,99,100};
        fileOutputStream.write(bytes);
        //方式3:自定义起始位置和长度
        fileOutputStream.write(bytes,1,bytes.length-2);

        fileOutputStream.close();//关闭io
    }
}
