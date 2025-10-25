package 构造方法;

public class Main {
    public static void main(String[] args) {
        //构造对象
        Student s1=new Student();
        Student s2=new Student("张子阳");
        s2.show();
        Student s3=new Student(22);
        s3.show();
        Student s4=new Student("张子阳",22);
        s4.show();
    }

}
