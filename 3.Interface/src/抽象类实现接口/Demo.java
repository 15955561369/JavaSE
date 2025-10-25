package 抽象类实现接口;

public class Demo {
    public static void main(String[] args) {
        Animal cat1=new Cat("小白猫",3);
        Animal cat2=new Cat("小花猫",4);
        Animal dog=new Dog("小黑狗",7);

        System.out.println(cat1.getName()+","+cat1.getAge());
        cat1.eat();
        cat1.jump();
        System.out.println(cat2.getName()+","+cat2.getAge());
        cat2.eat();
        cat2.jump();
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();
        dog.jump();
    }
}
