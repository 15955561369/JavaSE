package Random随机数;

/**
 * 1.导包 import java.util.Random;
 * 2.创建对象 Random random=new Random();
 * 3.创建随机数 int i=random.nextInt(10); 范围左闭右开
 *            double i=random.nextDouble(); 浮点数，默认0~1.0，不能传参
 */

import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            System.out.println(rand.nextInt(10));
        }
        System.out.println("-----------------------------");
        for(int i = 0; i < 5; i++){
            System.out.println(rand.nextDouble());
        }
    }
}