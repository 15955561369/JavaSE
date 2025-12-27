import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char []ans=new char [s.length()];
        Arrays.fill(ans,'中');
        char []s_=s.toCharArray();
        //先存非字母
        for(int i=0;i<s_.length;i++){
            int a=(int)s_[i];
            if(a>122 || a<65 || (a>90&&a<97)){
                ans[i]=s_[i];
            }
        }
        int j=0;
        for(int ascii=65;ascii<=90;ascii++){
            for(int i=0;i<s.length();i++){
                //获取当前ascii码
                int asc=(int)s.charAt(i);
                //如果是字母
                if((asc>=65 && asc<=90) || (asc>=97 && asc<=122)){
                    if(asc==ascii || asc==ascii+32){
                        while(ans[j] != '中') j++;
                        ans[j++]=s.charAt(i);
                    }
                }
            }

        }
        for(int i=0;i<s_.length;i++){
            System.out.print(ans[i]);
        }
        System.out.println(7/2);

    }
}