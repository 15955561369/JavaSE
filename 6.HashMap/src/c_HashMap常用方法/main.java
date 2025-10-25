package c_HashMap常用方法;
import java.util.*;

public class main {
    public static void main(String[] args) {
        //泛型不可使用基本数据类型，使用包装类Character,Integer等
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("1.",20);
        hashMap.put("2.",21);
        hashMap.put("3.",22);
        hashMap.put("4.",23);
        //获取key对应的Value
        System.out.println(hashMap.get("1."));
        System.out.println(hashMap.get("2."));
        //提取所有的键的集合，返回单列(不重复)集合Set
        Set<String> keys= hashMap.keySet();
        System.out.println(keys);
        //提取所有的值的集合，返回单列集合Collection
        Collection<Integer> values=hashMap.values();
        System.out.println(values);
        //将Collection的values转成Int数组
        Integer []values_=values.toArray(new Integer[values.size()]);
        System.out.println(Arrays.toString(values_));
        //获取所有键值对象的集合,用于遍历HashMap
        Set<Map.Entry<String,Integer>> entrySet=hashMap.entrySet();
        System.out.println(entrySet);
        //增强for循环进行遍历
        for(Map.Entry<String,Integer> str:entrySet){
            System.out.println(str+" "+str.getKey()+" "+str.getValue());
        }
    }
}
