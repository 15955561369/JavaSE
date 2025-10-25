package 案例_门与报警;

public class Meixin extends Door{
    //构造方法进行初始化
    public Meixin(int weight,int height) {
        this.weight = weight;
        this.height = height;
    }
    //重写抽象方法
    @Override
    public void openDoor() {
        System.out.println("尺寸为"+weight+"*"+height+"的美心门开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("尺寸为"+weight+"*"+height+"的美心门关门了");
    }
}
