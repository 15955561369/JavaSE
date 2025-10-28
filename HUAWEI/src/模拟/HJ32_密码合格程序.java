package 模拟;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ32_密码合格程序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

            String str=sc.nextLine();
            if(str.length()<=8){
                System.out.println("NG");
                return;
            }
            int cnt=0;
            //检查是否有大写字母
            for(char ch:str.toCharArray()){
                if(ch>='A' && ch<='Z'){
                    cnt++;
                    break;
                }
            }
            //检查是否有小写字母
            for(char ch:str.toCharArray()){
                if(ch>='a' && ch<='z'){
                    cnt++;
                    break;
                }
            }
            //检查是否存在数字
            for(char ch:str.toCharArray()){
                if(ch>='0' && ch<='9'){
                    cnt++;
                    break;
                }
            }
            //检查是否存在特殊字符
            for(char ch:str.toCharArray()){
                if((ch>57 && ch<65)||ch<48||(ch>90&&ch<97)||ch>122){
                    cnt++;
                    break;
                }
            }
            System.out.println(cnt);
            if(cnt<3){
                System.out.println("NG");
                return;
            }
            //验证子串是否满足要求
            boolean flag=false;
            //左指针
            for(int i=0;i<str.length()-2&&!flag;i++){
                //右指针
                for(int j=str.length();j>=i+2&&!flag;j--){
                    //截取当前子串
                    String str_=new String(Arrays.copyOfRange(str.toCharArray(),i,j+1));
                    //能够找到一样的子串
                    if(str.indexOf(str_,j+1)!=-1){
                        System.out.println(str_);
                        System.out.println("NG");
                        return;
                        //flag=true;
                    }
                }

            }
        System.out.println("OK");
    }
}