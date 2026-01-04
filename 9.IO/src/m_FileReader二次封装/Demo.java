package m_FileReader二次封装;
/*
* FileReader和FileWriter能够将字符流进行二次封装
*
* */

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //字符流(需要字节流对象)
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("IOTest.txt"));
        //等价于FileReader("IOTest.txt")
        FileReader fileReader = new FileReader("IOTest.txt");
        int len;
        char[] chars = new char[1024];
        while((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        //同理有FileWriter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("IOTest.txt", true));
        //等价于FileWriter
        FileWriter fileWriter = new FileWriter("IOTest.txt", true);
        fileWriter.write("张子阳\n");

        //关闭资源
        fileWriter.close();
        fileReader.close();
    }
}
