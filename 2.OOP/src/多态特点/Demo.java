package 多态特点;

public class Demo {
    public static void main(String[] args) {
        //子类的引用 指向子类的对象
        Dog dog = new Dog();
        dog.eat();

        //父类的引用指向子类的对象,animalParent就为多态
        AnimalParent animalParent = new Dog();

         /*多态中访问成员变量和成员方法的特点
          * 成员变量 编译和执行都看左边
          * 成员方法 编译看左边，执行看右边
          * 原因：重写了父类的成员方法
          */

        //成员变量:编译执行都看AnimalParent
        System.out.println(animalParent.age);
        //成员方法:编译看AnimalParent不会报错,执行Dog的eat方法
        animalParent.eat();

    }
}
