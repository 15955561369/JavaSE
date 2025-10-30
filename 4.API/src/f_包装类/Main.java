package f_包装类;

/*
* 包装类:对基本数据类型进行包装
* Integer---int、Character---char
* 主要目的在于实现基本数据类型和String的转化 比如int、char--->String或者String--->int,见HUAWEI.b_类型转换
* 也还有其他的常量和方法
* */
public class Main {
    public static void main(String[] args) {
        Integer i=100;//等价于int i=100
        System.out.println(i);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
    }

}
