import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Test {
    static int[] graph={1,0,0,0,1,0,1,0,2,1};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String strs=scan.nextLine();
        String[] numsStr=strs.split(" ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                String[] temp=sort(numsStr[j],numsStr[j+1]).split(" ");
                numsStr[j]=temp[1];
                numsStr[j+1]=temp[0];
            }
        }
        System.out.println(Arrays.toString(numsStr));
    }
    //返回封闭图形数
    public static int circle(String strNum){
        int ans=0;
        for(char ch:strNum.toCharArray()){
            ans+=graph[(int)ch-48];
        }
        return ans;
    }
    //输入两个数，返回排序后的数，大的在前
    public static String sort(String num1,String num2){
        if(circle(num1)>circle(num2)){
            return num1+" "+num2;
        }else if(circle(num1)<circle(num2)){
            return num2+" "+num1;
        }else if(circle(num1)==circle(num2)){
            if(Integer.parseInt(num1)>Integer.parseInt(num2)){
                return num1+" "+num2;
            }else if(Integer.parseInt(num1)<Integer.parseInt(num2)){
                return num2+" "+num1;
            }else if(Integer.parseInt(num1)==Integer.parseInt(num2))
                return num1+" "+num2;
        }
        return "";
    }
}