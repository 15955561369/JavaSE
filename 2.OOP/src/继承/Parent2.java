package 继承;

/*
 * oop三大特征之一---------继承
 * 继承 将相同的属性和方法放入到父类当中，子类通过继承获得相同的属性和方法，使代码简洁
 * public class 子类 extends 父类{}
 *
 * Tips:子类只能继承一个父类，但是可以多层继承，被继承类的方法都可以使用
 * */
//父类
public class Parent2 {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
     public void a2(){
         System.out.println("这里是第一层");
     }
}
