package 多态的优缺点;

/*
* 多态的优缺点:
* 优点:简化代码
* 缺点:只能简化子类中重写的方法,无法访问未在子类中重写的方法(多态的特点:编译看左边 执行看右边)
* */

public class AnimalDemo {

    public static void main(String[] args) {
        AnimalOperate animalOperate = new AnimalOperate();
        //不使用多态时，需要在animalOperate中为每个类的eat创建一个单独的方法
        animalOperate.catEat(new Cat());
        animalOperate.dogEat(new Dog());
        animalOperate.manEat(new Man());

        //使用多态,只需创建一个方法即可,传进子类的对象
        animalOperate.userEat(new Cat());
        animalOperate.userEat(new Dog());
        animalOperate.userEat(new Man());
    }
}
