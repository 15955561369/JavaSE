package 字符串;
import java.util.*;

/**
 dp[i][j]表示s的前i个字符是否能通配p的前j个字符
 1)s和p都是字母或其他字符且通配，dp[i][j]=dp[i-1][j-1]
 2)s的是?且p的为数字或字母,dp[i][j]=dp[i-1][j-1]
 3)s的是*,遍历到下一个其他字符
 */
public class 通配字符串_动态规划 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []s_=s.toCharArray();
        String p = sc.nextLine();
        char []p_=p.toCharArray();
        boolean [][]dp = new boolean [s_.length + 1][p_.length + 1];
        //初始化
        for (boolean []row : dp) Arrays.fill(row, false);
        dp[0][0] = true;
        //考虑特殊情况
        if(s_.length==0){
            for(int i=0;i<p_.length;i++)
                if(p_[i]!='*') {
                    System.out.print(false);
                    return;
                }
            System.out.print(true);
            return;
        }
        for (int i = 1; i <= s_.length; i++) {
            for (int j = 1; j <= p_.length; j++) {
                //s_中为字母或其他字符且通配
                if(s_[i-1]>='A'&&s_[i-1]<='Z'&&(p_[j-1]==s_[i-1]+32 || p_[j-1]==s_[i-1])){
                    dp[i][j]=dp[i-1][j-1];
                }
                if(s_[i-1]>='a'&&s_[i-1]<='z'&&(p_[j-1]==s_[i-1]-32 || p_[j-1]==s_[i-1])){
                    dp[i][j]=dp[i-1][j-1];
                }
                if(s_[i-1]==p_[j-1])
                    dp[i][j]=dp[i-1][j-1];
                //s_为?
                if(s_[i-1]=='?'&&((p_[j-1]>='0'&&p_[j-1]<='9')||(p_[j-1]>='A'&&p_[j-1]<='Z')||(p_[j-1]>='a'&&p_[j-1]<='z'))){
                    dp[i][j]=dp[i-1][j-1];
                }
                //s为*
                if(s_[i-1]=='*'){
                    if(dp[i-1][0]){
                        Arrays.fill(dp[i],true);
                        break;
                    }
                    if((p_[j-1]>='0'&&p_[j-1]<='9')||(p_[j-1]>='A'&&p_[j-1]<='Z')||(p_[j-1]>='a'&&p_[j-1]<='z')){
                        dp[i][j]=dp[i-1][j]||dp[i][j-1];
                    }
                }
            }
        }
        System.out.print(dp[s_.length][p_.length]);
    }
}