package f_自定义异常;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入账号:");
        String user=sc.nextLine();
        System.out.println("输入密码:");
        String pwd=sc.nextLine();
        //异常处理
        try{
            login(user,pwd);
        }catch(LoginException e){
            System.out.println(e.getMessage());
        }

    }

    public static void login(String user,String pwd) throws LoginException{
        if(!("zzy".equals(user)&&"12345".equals(pwd))){
            //创建异常对象
            LoginException loginException = new LoginException("登录失败");
            System.out.println("输入的账号或密码不正确");
            //抛出异常对象
            throw loginException;
        }
        System.out.println("登录成功");

    }
}
