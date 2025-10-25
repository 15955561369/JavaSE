package 封装;
/*
 * oop三大特征之一------------封装
 * 封装 将事物封装成一个类
 * 1.成员属性私有化
 * 2.使用set和get方法来对成员属性进行操作，加入一些控制语句
 * */

public class Student {
    //成员属性私有化
    private String name;
    private int age;

    //set方法
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("输入的年龄不合法");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    //get方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
