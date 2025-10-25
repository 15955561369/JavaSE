package c_equals方法;

/*
* equals()方法在Object类中，默认比较二者的内存地址是否相同
* 在String类里，已经重写了Object类的equals()方法，用于比较二者的值是否相等。其底层利用char[]比较每个字符是否相等
* */
public class Test01 {
    public static void main(String[] args) {

        Student s1 = new Student("zzy",22);
        Student s2 = new Student("zzy",22);
        //比较地址
        System.out.println(s1.equals(s2));

        //创建String对象str1
        String str1="zzy";
        String str2="zzy";
        //比较值
        System.out.println(str1.equals(str2));

        //null.euqals()会报错，而.equals(null)不会报错
        System.out.println(str1.equals(null));
    }
}
