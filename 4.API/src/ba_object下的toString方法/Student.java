package ba_object下的toString方法;

public class Student extends Parent {

    //重写toString方法，输出对象的成员属性
    @Override
    public String toString() {
        return "name:"+name+",age:"+age;
    }
}
