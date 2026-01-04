package n_字符缓冲流拷贝java代码;
/*
* 使用字符缓冲流拷贝Java代码
* */

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("9.IO/src/n_字符缓冲流拷贝java代码/Demo.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("拷贝Test/src/copyJava.java"));
        String line;
        while((line=bufferedReader.readLine())!=null){//一行一行读取数据
            bufferedWriter.write(line);//写入到copyJava
            bufferedWriter.newLine();//手动换行
        }
        System.out.println("拷贝成功.");
        //关闭资源
        bufferedReader.close();
        bufferedWriter.close();
    }
}
