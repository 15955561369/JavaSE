package d_Math类;

public class Main {
    public static void main(String[] args) {
        //1.Math.max() 最大值和最小值
        System.out.println("------------max和min-------------");
        System.out.println(Math.max(1,3));
        System.out.println(Math.min(1,3));

        //2.Math.pow(2.0,3.0) 幂
        System.out.println("-----------幂-------------");
        System.out.println(Math.pow(2.0,3.0));

        //3.Math.abs(1-3) 绝对值
        System.out.println("------------绝对值-------------");
        System.out.println(Math.abs(1-3));

        //4.Math.random() 生成0.0-1.0的随机数 取不到1.0
        System.out.println("------------随机数-------------");
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100)+1);//1-100

    }
}
