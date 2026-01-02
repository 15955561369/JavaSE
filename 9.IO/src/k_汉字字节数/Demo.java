package k_汉字字节数;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
* 一个汉字所占字节数
* GBK编码: 2个字节
* UTF-8编码: 3个字节（默认）
* */

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1="zzy";
        String str2="张子阳";
        System.out.println(str1+"\n字节数:"+str1.getBytes().length+"\n字节数组:"+Arrays.toString(str1.getBytes()));
        System.out.println("---------------------------------------------------");
        System.out.println(str2+"\n字节数UTF-8:"+str2.getBytes().length+"\n字节数组:"+Arrays.toString(str2.getBytes()));
        System.out.println(str2+"\n字节数GBK:"+str2.getBytes("GBK").length+"\n字节数组:"+Arrays.toString(str2.getBytes("GBK")));
    }
}
