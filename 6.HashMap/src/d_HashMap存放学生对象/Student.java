package d_HashMap存放学生对象;

public class Student {
    //姓名、年龄
    private String name;
    private int age;
    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name+","+age;
    }
}
