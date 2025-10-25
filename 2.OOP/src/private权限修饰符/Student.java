package private权限修饰符;
/*
 * private 权限修饰符
 * 被修饰的成员变量或者成员方法只能在此类中使用，可以防止数据被任意篡改
 * 通过定义get和set方法实现在其他类进行访问
 */

public class Student {
    //成员变量
    String name;
    private int age;

    //set方法，赋值
    public void set(int age){
        //加入限制条件，防止任意篡改
        if(age<0 || age>120){
            System.out.println("年龄输入错误");
        }
        else {
            this.age = age;
        }
    }
    //get方法，获取值
    public int get(){
        return this.age;
    }
}
