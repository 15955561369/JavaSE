package b_反射机制;

/**
 * 测试类，用于反射
 */
public class User {
    public String name;
    public Integer age;
    private String address;

    //无参构造方法
    public User(){
        System.out.println("User的无参构造方法");
    }
    //有参构造方法
    public User(String name,Integer age,String address){
        System.out.println("User的有参构造方法");
        this.name=name;
        this.age=age;
        this.address=address;
    }

    //成员方法
    public String show1(String str){
        return "成员方法1"+str;
    }
    private String show2(String str){
        return "成员方法2"+str;
    }

    @Override
    public String toString() {
        return "name:"+name+" age:"+age+" address:"+address;
    }
}
