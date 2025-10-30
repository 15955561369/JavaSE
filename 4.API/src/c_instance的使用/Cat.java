package c_instance的使用;

/*
* 对象 instance Class:返回 对象 是否是Class的实例,Class可以是自身类,父类
* */
public class Cat extends AnimalParent {
    public static void main(String[] args) {
        //创建animal对象
        Cat animal = new Cat();
        //判断animal是不是Cat的实例
        if(animal instanceof Cat){
            System.out.println("animal是Cat类的一个实例");
        }else System.out.println("animal不是Cat类的一个实例");

        //用于类型转换当中
        if(animal instanceof AnimalParent){
            //如果animal是AnimalParent下的一个实例，就可以强制将animal从Cat转为AnimalParent
            AnimalParent animalParent = (AnimalParent)animal;
            System.out.println("将animal转为AnimalParent"+animalParent.age);
        }else System.out.println("转换失败");
    }
}
