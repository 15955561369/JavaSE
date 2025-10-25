package f_HashMap常见面试题;

import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        //1.HashMap的key和value能否为对象------可以
        Map<Student,String> hashMap=new HashMap<>();
        hashMap.put(new Student(),"123");
        //2.HashMap存储数据有序还是无序------无序，LinkedHashMap有序
        //3.HashMap的key是否可以为null------可以，存放在index=0处
    }
}
