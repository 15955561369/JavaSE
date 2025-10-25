package e_replace方法;

public class Main {
    public static void main(String[] args) {
        //replace(str1,str2)能够用str2代替str中所有的str1
        String str="111zhangziyang111";
        String newstr=str.replace("111","ws");
        System.out.println(newstr);

        //replaceFirst(str1,str2)用str2代替str中的第一个str1
        String newstr1=str.replaceFirst("111","ws");
        System.out.println(newstr1);
    }

}
