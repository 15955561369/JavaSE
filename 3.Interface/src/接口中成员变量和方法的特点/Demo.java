package 接口中成员变量和方法的特点;

public class Demo {
    public static void main(String[] args) {
        Animal dog =new DogImpl();
        //dog.CODE=100;
        System.out.println(dog.CODE);
        System.out.println(dog.CODE2);
        System.out.println(dog.CODE3);
        System.out.println("------------------");
        System.out.println(Animal.CODE);
        System.out.println(Animal.CODE2);
        System.out.println(Animal.CODE3);

        dog.show();
        dog.show2();
    }
}
