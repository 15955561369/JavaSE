package l_字符流;

import java.io.*;

/*
* 字符流：对字节流进行包装，其底层还是使用 字节流 与硬盘进行数据传输
* 传输文本类数据时推荐先使用字符流
* */
public class Demo {
    public static void main(String[] args) throws IOException {
        //先创建字节流输入对象
        FileInputStream fileInputStream = new FileInputStream("IOTest.txt");
        //创建字符流 传入字节流对象
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
        char[] chars = new char[8192];
        int len;//实际读取长度
        while((len=inputStreamReader.read(chars))!=-1){//读取数据
            System.out.println(new String(chars,0,len));
        }

        //字节流输出对象
        FileOutputStream fileOutputStream = new FileOutputStream("IOTest.txt",true);//追加写
        //字符流输出 传入字节流输出对象
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
        String str="文博雅\n";
        outputStreamWriter.write(str);

        //关闭资源
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
