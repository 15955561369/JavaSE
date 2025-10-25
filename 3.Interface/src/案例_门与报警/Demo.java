package 案例_门与报警;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

public class Demo {
    public static void main(String[] args) {
        PanpanDoor panpan1=new PanpanDoor(300,400);
        PanpanDoor panpan2=new PanpanDoor(350,500);
        Meixin meixin1=new Meixin(200,400);
        Meixin meixin2=new Meixin(300,500);
        panpan1.openDoor();
        panpan1.alarm();
        panpan1.closeDoor();
        System.out.println("--------------");
        panpan2.openDoor();
        panpan2.alarm();
        panpan2.closeDoor();
        System.out.println("--------------");
        meixin1.openDoor();
        meixin1.closeDoor();
        System.out.println("--------------");
        meixin2.openDoor();
        meixin2.closeDoor();
    }
}
