import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Test {
    static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        int ans=0;
        for(int year=1900;year<=9999;year++){
            int sum1=0;
            for(char ch:String.valueOf(year).toCharArray()){//求年的和
                sum1+=Integer.parseInt(String.valueOf(ch));
            }
            if(year%4==0 && year%100!=0)
                days[1]=29;//闰年
            for(int month=1;month<=12;month++){
                for(int day=1;day<=days[month-1];day++){
                    if(sum1==sum(month,day)){
                        System.out.println(year+" "+month+" "+day);
                        ans++;
                    }

                }
            }
        }
        System.out.println(ans);
    }
    //求月+日的各位数字之和
    public static int sum(int month,int day){
        int res=0;
        String nums=String.valueOf(month)+String.valueOf(day);
        for(char num:nums.toCharArray()){
            res+=Integer.parseInt(String.valueOf(num));
        }
        return res;
    }
}