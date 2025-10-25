package e_hashCode;

/*
* HashCode()存放于Object类中，返回jvm给每一个对象分配的地址
* */

public class Main {
    public static void main(String[] args) {
        String str1="zzy1";
        String str2="zzy2";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
