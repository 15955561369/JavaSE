package a_常见处理方法;

public class Main {
    public static void main(String[] args) {
        String str="zzyws";
        //1.str.charAt(i)访问字符串str的元素
        System.out.println(str.charAt(2));

        //2.数组用length属性，字符串用length()方法
        System.out.println(str.toCharArray().length);
        System.out.println(str.length());

        //3.str.split(",") 以,隔开 返回String数组
        String []strs=str.split("y");
        System.out.println(strs[0]+" "+strs[1]);

        //4.String.format("%8s",str).replace(' ','0') 固定str的位数
        System.out.println(String.format("%8s",str).replace(' ','0'));

        //5.str.substring(l,r+1)字符串的子串 左闭右开
        System.out.println(str.substring(0,3));

        //6.str.contains("xx") str是否包含子串"xx"
        System.out.println(str.contains("ws"));

        //7.str.indexOf("xx",fromindex) 从fromindex开始查找子串"xx"的索引，若没有返回-1
        System.out.println(str.indexOf("ws",3));

        //8.StringBuilder ans=new StringBuilder() ,ans.append("xx")
        StringBuilder ans=new StringBuilder();
        ans.append("zzy");
        //9.ans.toString() StringBuilder需要转换成String
        System.out.println(ans.toString());

        //10.str.toLowerCase()将str全部转为小写
        System.out.println("ASdfgGD".toLowerCase());
        System.out.println("ASdfgGD".toUpperCase());

    }
}
