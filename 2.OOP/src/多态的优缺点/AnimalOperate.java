package 多态的优缺点;

public class AnimalOperate {

    //不使用多态时，需要为每个类都定义一个eat方法
    public void catEat(Cat cat){
        cat.eat();
    }
    public void dogEat(Dog dog){
        dog.eat();
    }
    public void manEat(Man man){
        man.eat();
    }

    //使用多态时，只需创建一个方法即可
    //根据多态的定义，user指向子类的对象
    public void userEat(AnimalParent user){
        user.eat();
    }
}
