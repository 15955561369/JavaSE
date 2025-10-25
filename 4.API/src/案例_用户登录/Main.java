package 案例_用户登录;

import  java.util.*;
/**
 *用户输入账户和密码进行匹配，共有3次机会
 */


public class Main {
    public static void main(String[] args) {

        int pwdCount=3;
        for(int i=1;i<=pwdCount;i++){
            if(login()){
                System.out.println("密码输入正确 登录成功");
                break;
            }else{
                if(i==pwdCount) {
                    System.out.println("次数已经用完，账户被冻结");
                    break;
                }
                System.out.println("密码输入错误，登录失败"+"。剩余"+(pwdCount-i)+"次");
            }
        }

    }
    //main为静态方法，静态方法中只能调用静态方法，除非创建对象
    private static boolean login(){
        //账户名称
        String username="zzy";
        //账户密码
        String password="zhang";

        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的用户名和密码\nusername: ");
        String user=sc.nextLine();
        System.out.println("password: ");
        String pwd=sc.nextLine();
        return  username.equals(user) && password.equals(pwd);
    }
}
