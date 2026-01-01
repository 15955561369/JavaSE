package f_字节输出流换行与追加;
/*
* 换行符:
* windows:\r或\n
* linux:\n
* mac:\r
* */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("IOTest2.txt");
        String str="张子阳";
        f.write(str.getBytes());//getBytes()获取字节数组
        //换行写入
        for(int i=0;i<10;i++){
            f.write(str.getBytes());
            f.write("\n".getBytes());
        }

        //true表示追加写入
        FileOutputStream f2 = new FileOutputStream("IOTest3.txt",true);
        for(int i=0;i<10;i++){
            f2.write("123".getBytes());
            f2.write("\n".getBytes());
        }
    }
}
