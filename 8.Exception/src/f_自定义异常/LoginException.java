package f_自定义异常;

//自定义一个编译阶段的异常，如果定义运行阶段的异常则需要继承RuntimeException
public class LoginException extends Exception{


    public LoginException(String message){
        super(message);//调用父类(Exception)有参构造方法即可,message为异常信息
    }
}
