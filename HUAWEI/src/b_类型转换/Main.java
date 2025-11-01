package b_类型转换;

public class Main {
    public static void main(String[] args) {
        //1.str.toCharArray() str转字符型数组
        System.out.println("zzyws".toCharArray());

        //2.Integer.parseInt(str) 字符串转Int
        System.out.println(Integer.parseInt("123"));
        //Integer.valueOf(str) 也能够将字符串转为整型，不过返回Integer对象而不是int数据类型

        //3.String.valueOf(int long float double char boolean) 将int long float double char boolean转字符串
        System.out.println(String.valueOf(123).getClass());
        System.out.println(String.valueOf('h').getClass());
        System.out.println(String.valueOf(false).getClass());
        System.out.println(String.valueOf(1.234).getClass());
    }

}
