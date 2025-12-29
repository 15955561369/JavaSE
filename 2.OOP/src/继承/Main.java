package 继承;


public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("张三");
        student.setAge(22);
        student.work1();

        //多层继承
        student.a1();
        student.a2();
    }

}
