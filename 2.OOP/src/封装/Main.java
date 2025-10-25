package 封装;

public class Main {
    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        student.setAge(22);
        student.setName("张三");
        System.out.println(student.getName()+"-"+student.getAge());
    }
}
