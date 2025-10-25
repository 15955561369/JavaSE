package static静态关键字;

/*
* static静态关键字
* 被修饰的成员属性 或 方法将被对象共同访问
* */
public class Student {
    public String name;
    //静态属性school
    public static  String school;

    public void show(){
        System.out.println(name+":"+school);
    }

    //静态方法a1
    public static void a1(){
        System.out.println("静态方法");
    }
    //在静态方法中只能访问静态属性和静态方法，无法访问非静态属性和方法,除非创建出对象
    public static void a2(){
        a1();
        Student s =new Student();
        s.show();
        //show();
    }
}
