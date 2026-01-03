package k_编码与解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
* 编码表: GBK UTF-8 Unicode...
* 1)编码: 将字符串 转为 字节
*   方式: String.getBytes() 获取String的字节型数组
*        String.getBytes(" ") 指定编码格式
* 2)解码：将字节 转为 字符串
*   方式：new String(byte[]) 将字节型数组转为String
*        new String(byte[]," ") 指定编码格式
*
* 乱码问题： 文件的编码格式与解码格式不一致
* */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="张子阳";
        byte[] bytes=str.getBytes("GBK");//用GBK编码
        System.out.println(Arrays.toString(bytes));

        String str2=new String(bytes);//用UTF-8解码
        System.out.println(str2);//乱码问题

    }
}
