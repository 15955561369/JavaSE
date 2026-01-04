package n_字符缓冲流;
/*
* 字符缓冲流与字节缓冲流相似
* 将数据以 块 的形式进行传输以减少传输次数提高效率
* BufferedReader() BufferedWriter()
* */

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //字符输入缓冲流(需要FileReader对象)
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IOTest.txt"));
//        int len;
//        char[] buf = new char[8192];
//        System.out.println("一次性读取IOTest所有数据:");
//        while((len=bufferedReader.read(buf))!=-1){
//            System.out.println(new String(buf,0,len));
//        }
        System.out.println("---------------------------");
        System.out.println("一行一行读取IOTest数据:");
        String str;
        while((str = bufferedReader.readLine()) != null){//返回一行数据，没有数据时返回null
            System.out.println(str);
        }
        //字符输出缓冲流(需要FileWriter对象)
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IOTest.txt", true));
        bufferedWriter.write("zzy");
        bufferedWriter.newLine();//下一行
        //关闭资源
        bufferedReader.close();
        bufferedWriter.close();
    }
}
