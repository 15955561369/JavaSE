package 练习3;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        //Cat cat2=new Cat("小猫B",3);
        //Dog dog1=new Dog("小狗C",3);
        //Dog dog2=new Dog("小狗D",5);
        cat1.setName("小猫A");
        cat1.setAge(3);
        System.out.println("姓名:"+cat1.getName()+",年龄"+cat1.getAge());
    }
}
