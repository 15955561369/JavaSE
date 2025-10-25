package 接口;

/*
* 接口与抽象类相似，需要被实现类重写
* 接口----抽象类(父类)   实现类-----子类
* 无法创建接口的实例，接口 的引用指向 实现类 的对象,也叫做接口多态
* */
public interface Animal {

    public abstract void eat();
}
