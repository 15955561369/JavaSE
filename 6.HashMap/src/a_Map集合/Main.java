package a_Map集合;

import java.util.Map;
import java.util.HashMap;
/*
* Map集合的特点:
* 1.键值对的形式,k=v
* 2.k不允许重复，否则值被修改，v可以重复
* 3.无序(比如HashMap)，存储顺序和访问顺序无关。LinkedHashMap有序.
* */
public class Main {
    public static void main(String[] args) {
        //Map是接口,hashMap是其中一个实现类，这是多态，适用绝大多数情况。后续可以快速更换其他实现类
        Map<String,String> hashMap=new HashMap<>();
        //使用HashMap引用也可以创建HashMap对象，适用于调用HashMap中的特定方法如.clone()。这是Map没有的(多态中成员方法的特点)
        HashMap<String,String> hashMap1=new HashMap<>();
        hashMap.put("编号1","zzy");
        hashMap.put("编号2","zy");
        hashMap.put("编号3","ws");
        hashMap.put("编号3","sw");
        System.out.println(hashMap);
    }
}
