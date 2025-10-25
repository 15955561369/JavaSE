package 方法重写;

/*
 * 方法重写
 * 子类中出现了和父类相同的方法（方法名、参数必须相同）
 * 子类中便可对父类的功能进行重写或拓展
 *
 * Tips:
 * 1.父类的方法私有private时 子类无法重写
 * 2.子类方法的访问权限不能小于父类的访问权限
 * 使用@Override注释可以检查重写是否正确
 * */

public class Student extends Parent {

    //@Override
    //父类中的私有方法没有继承过来，此时相当于新声明一个方法
    private void a1() {

    }

    @Override
    public void a2() {

    }

    @Override
    public void show(String name) {
        //调用父类
        //super.show("张子阳1233");

        //重写或者扩展的功能
        System.out.println(name + ",这里是子类重写或扩展的功能");
    }
}
