package 练习1;

public class Student {
    //属性
    String name;
    int age;
    Double avScore;

    //行为
    public void score(String name, int age, Double score) {
        System.out.println("我叫" + name + "今年" + age + "岁" + ",本次周考我的平均分为" + score + "分");
    }
}
