package 练习2;

public class Main {
    public static void main(String[] args) {
        //创建对象
        Practice2 pra1=new Practice2();

        //先用set赋值
        System.out.println("------------set赋值---------------");
        pra1.setA("张三");
        pra1.setB(21);
        pra1.setS("西北工业大学");
        System.out.println(pra1.getA()+"-"+pra1.getB()+"-"+pra1.getS());

        //有参构造赋值
        System.out.println("-------------有参构造赋值-------------");
        Practice2 pra2=new Practice2("李四",22,"哈尔滨工业大学");
        System.out.println(pra2.toString());
    }
}
