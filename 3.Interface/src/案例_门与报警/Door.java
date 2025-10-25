package 案例_门与报警;

/*
* 抽象类主要对事物进行抽象，包括属性和行为
* 接口主要对行为进行抽象，因为接口中定义的变量为常量，使得实现类无法修改变量值，所以只对行为进行抽象
* */

/*
* 需求:有两种品牌的门，分别为PanpanDoor和MeixinDoor。其中PanpanDoor具有开门、关门、报警三大功能，而MeixinDoor只有开门和关门两种功能。
* 思路：创建Door抽象类,Panpan和Meixin分别继承Door抽象类，对开门和关门两大功能进行重写，同时对宽Width和高Height进行赋值。
* 因为类只能继承一个父类，所以将Panpan独有的报警功能放入接口Alarm中，Panpan在继承Door抽象类的同时实现接口Alarm。而Meixin不做处理，这样在Panpan中就有了报警功能而Meinxin没有。
* */
public abstract class Door {
    public int weight;
    public int height;

    //抽象方法
    public abstract void openDoor();
    public abstract void closeDoor();
}
