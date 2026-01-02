package j_字节缓冲流;
/*
* 传统一个字节一个字节读写数据的效率非常低，因为每读写一个字节就会发生一次系统内核调用，因此采用缓冲流的形式以减少调用次数
* 缓冲区： 类似于“块” 数据一块一块读
* 缓冲区默认大小8KB即8192字节
* */

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("IOTest.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);//输入缓冲流
        byte[] buffer = new byte[8192];
        int len;
        while((len=bufferedInputStream.read(buffer))!=-1){//读取IOTest中的数据
            System.out.println(new String(buffer,0,len));
        }

        FileOutputStream outputStream = new FileOutputStream("IOTest.txt",true);//追加写
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);//输出缓冲流
        bufferedOutputStream.write("zzy张子阳\nzzy\n".getBytes());//写入IOTest.txt数据
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
