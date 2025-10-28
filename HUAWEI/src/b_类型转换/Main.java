package b_类型转换;

public class Main {
    public static void main(String[] args) {
        //1.str.toCharArray() str转字符型数组
        System.out.println("zzyws".toCharArray());

        //2.Integer.parseInt(str) 字符串转Int
        System.out.println(Integer.parseInt("123"));

        //3.String.valueOf(num或者char) Int或者char转字符串
        System.out.println(String.valueOf(123).getClass());
        System.out.println(String.valueOf('h').getClass());
    }

}
