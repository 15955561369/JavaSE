package a_字符串;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ans=new int [7];
        while (sc.hasNextLine()) {
            //处理输入
            String str=sc.nextLine();
            String []strs=str.split("~");
            String ipAddress=strs[0];
            String ziMa=strs[1];
            String ipflag=cheekIp(ipAddress);
            boolean ziMaflag=cheekZiMa(ziMa);
            //是否需要跳过
            if(ipflag.equals("needContinue"))
                continue;
            //如果不合法
            if(ipflag.equals(" ")||!ziMaflag){
                ans[5]++;
                continue;
            }
            if(ipflag.equals("A")) ans[0]++;
            if(ipflag.equals("B")) ans[1]++;
            if(ipflag.equals("C")) ans[2]++;
            if(ipflag.equals("CF")) {ans[2]++;ans[5]++;}
            if(ipflag.equals("D")) ans[3]++;
            if(ipflag.equals("E")) ans[4]++;
            if(ipflag.equals("F")) ans[6]++;
        }
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    //检查ip地址是否合法并返回类型值
    private static String cheekIp(String ip){
        //取出ip地址的第一位和第二位
        String []ips=ip.split("\\.");
        //只要出现空，此ip不合法
        for(String s:ips)
            if(s==" ")
                return " ";
        String ipFst=ips[0];
        String ipSec=ips[1];
        if(ipFst.equals("0") || ipFst.equals("127")) return "needContinue";
        if(ipFst.equals("1")) return "A";
        if(ipFst.equals("128")) return "B";
        if(ipFst.equals("224")) return "D";
        if(ipFst.equals("240")) return "E";
        if(ipFst.equals("192")){
            if(ipSec.equals("168"))  return "CF";//F表私有
            else return "C";
        }
        if(ipFst.equals("10")) return "F";
        if(ipFst.equals("172")&&ipFst.equals("16")) return "F";
        return " ";//空表示不合法
    }
    //检查子网掩码是否合法
    private static boolean cheekZiMa(String code){
        String []codes=code.split("\\.");
        List<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<4;i++){
            //字符串转整型
            int c=Integer.parseInt(codes[i]);
            int []temp=new int [8];
            int k=0;
            //转二进制
            while(c!=0){
                temp[k++]=c%2;
                c/=2;
            }
            arrayList.add(1);
            //导入list
            for(int j=7;j>=0;j--){
                arrayList.add(temp[j]);
            }
        }
        boolean flag=false;
        for(int x:arrayList){
            if(x==0)
                flag=true;
            else{
                if(flag)
                    return false;
            }
        }
        return true;
    }
}