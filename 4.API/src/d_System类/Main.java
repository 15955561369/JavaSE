package d_System类;

import java.time.chrono.MinguoEra;

public class Main {
    public static void main(String[] args) {
        //1.System.currentTimeMillis() 获取当前系统时间 ms为单位，起始日期为1970年1月1日0:0
        long currentTime=System.currentTimeMillis();
        System.out.println("距1970年1月1日已过去了"+currentTime+"ms");
        long Seconds=currentTime/1000;
        long Minutes=Seconds/60;
        long Hours=Minutes/60;
        long Days=Hours/24;
        long Weeks=Days/7;
        long Months=Days/30;
        long Years=Days/365;
        System.out.println("距1970年1月1日已过去了"+Years+"年, "+Months+"月, "+Days+"天, "+Hours+"时, "+Minutes +"分, "+Seconds+"秒");
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
            ;
        long endTime=System.currentTimeMillis();
        System.out.println("执行100万次for循环需要"+(endTime-startTime)+"ms");

        //2.System.exit(0) 0表正常退出(关闭jvm) 非0表异常退出
        System.exit(0);
    }
}
