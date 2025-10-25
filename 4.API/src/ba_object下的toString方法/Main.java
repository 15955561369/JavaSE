package ba_object下的toString方法;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        System.out.println(s1);//底层调用对象s的toString方法输出s1的地址
        //System.out.println(s1.toString());
        //重写toString()方法后直接输出对象的成员属性
        System.out.println(s2);
        System.out.println(s2.toString());
    }


}
