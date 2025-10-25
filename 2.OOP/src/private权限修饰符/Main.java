package private权限修饰符;

public class Main {
    public static void main(String[] args) {
        //创建对象
        private权限修饰符.Student student=new private权限修饰符.Student();

        //使用set赋值
        student.set(12);

        //输出值
        System.out.println(student.get());
    }
}
