package 继承;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

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
