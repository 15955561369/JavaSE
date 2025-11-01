package f_包装类的规律;

public class Main {
    public static void main(String[] args) {

        //Integer.parseInt(str)能够将str转为int类型，前提是str是int型的字符串
        System.out.println(Integer.parseInt("12345"));

        //同理Long.parseLong(str) Boolean.parseBoolean(str)、Double.parseDouble(str)也能实现相应转化
        System.out.println(Long.parseLong("12345"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Double.parseDouble("1.2"));
    }
}
