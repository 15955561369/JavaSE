package MaxHeight;

public class Main {
    public static void main(String[] args) {

        int a1 = 160;
        int a2 = 175;
        int a3 = 180;

        System.out.println(a1 > a2 ? a1 > a3 ? a1 : a3 : a2 > a3 ? a2 : a3);
    }

}