package i_复制图片;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //读取图片
        FileInputStream inputStream = new FileInputStream("io.png");

        int len;
        byte[] bytes=new byte[1024];
        FileOutputStream outputStream = new FileOutputStream("拷贝Test\\io.png");
        while((len= inputStream.read(bytes))!=-1){
            //写入图片
            outputStream.write(bytes,0,len);
        }
        //关闭资源
        inputStream.close();
        outputStream.close();
    }
}
