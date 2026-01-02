package j_字节缓冲流与字节流效率对比;

import java.io.*;

/*
* 将工程目录下的Test.mp4拷贝到拷贝Test文件夹内，比较字节缓冲流和字节流的效率对比
* */
public class Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        bufferedCopy();
        long end = System.currentTimeMillis();
        System.out.println("字节缓冲流耗时:"+(end-start)+"ms");//44ms
        start = System.currentTimeMillis();
        copy();
        end = System.currentTimeMillis();
        System.out.println("字节流耗时:"+(end-start)+"ms");
    }

    /**
     * 字节缓冲流拷贝
     */
    public static void bufferedCopy() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("Test.mp4"));
        int len;
        byte[] buffer = new byte[8192];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("拷贝Test\\字节缓冲流Test.mp4"));
        while((len=bufferedInputStream.read(buffer))!=-1){
            bufferedOutputStream.write(buffer,0,len);
        }
        //注意:关闭资源后，文件才能真正写入到磁盘里,才能正常打开
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 字节流拷贝
     */
    public static void copy() throws IOException {
        FileInputStream file = new FileInputStream("Test.mp4");
        int b;
        FileOutputStream file_ = new FileOutputStream("拷贝Test\\字节流Test.mp4");
        while((b=file.read())!=-1){
            file_.write(b);
        }
        //注意:关闭资源后，文件才能真正写入到磁盘里，才能正常打开
        file.close();
        file_.close();
    }
}
