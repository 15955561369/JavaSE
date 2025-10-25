package 练习3;

public class AnimalParent {

    private String name;
    private int age;

    //构造方法
    public AnimalParent() {
        System.out.println("AnimalParent无参构造方法");
    }
    public AnimalParent(String name, int age) {
        System.out.println("AnimalParent有参构造方法");
        this.name = name;
        this.age = age;
    }

    //getter和setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
