package b_进制转换;

public class Main {
    public static void main(String[] args) {
        //1.Integer.parseInt("A",16)任意进制(16)转十进制
        System.out.println(Integer.parseInt("A",16));

        //2.Integer.toString(5,2)十进制(5)转任意进制(2)
        System.out.println(Integer.toString(5,2));
        System.out.println(Integer.toString(10,16));
    }
}
