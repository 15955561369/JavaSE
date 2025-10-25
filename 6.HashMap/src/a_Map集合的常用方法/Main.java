package a_Map集合的常用方法;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        Map<String,String> hashMap =new HashMap<>();
        //添加键值对
        hashMap.put("1","zzy");
        hashMap.put("2","ws");
        System.out.println(hashMap);
        //删除键值对
        hashMap.remove("2");
        System.out.println(hashMap);
        //判断是否存在键
        System.out.println(hashMap.containsKey("1"));
        //判断是否存在值
        System.out.println(hashMap.containsValue("ws"));
        //清除Map
        hashMap.clear();
        System.out.println(hashMap);
        //判断是否为空
        System.out.println(hashMap.isEmpty());
    }
}
