package 案例_门与报警;

public class PanpanDoor extends Door implements Alarm {
    //构造方法进行初始化
    public PanpanDoor(int weight,int height) {
        this.weight = weight;
        this.height = height;
    }
    //重写抽象方法
    @Override
    public void openDoor() {
        System.out.println("尺寸为"+weight+"*"+height+"的盼盼门开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("尺寸为"+weight+"*"+height+"的盼盼门关门");
    }

    @Override
    public void alarm() {
        System.out.println("尺寸为"+weight+"*"+height+"的盼盼门发出警报");
    }
}
