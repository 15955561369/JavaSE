package 接口;

public class Demo {
    public static void main(String[] args) {

        //接口多态
        Animal animal = new CatImpl();
        animal.eat();
    }
}
