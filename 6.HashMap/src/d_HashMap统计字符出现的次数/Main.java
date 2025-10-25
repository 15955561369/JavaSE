package d_HashMap统计字符出现的次数;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入字符串
        String str=sc.nextLine();
        //转为字符型数组
        char []str_arr=str.toCharArray();
        //创建HashMap存储 字符-次数 键值对
        //泛型不可使用基本数据类型，使用包装类
        Map<Character,Integer> hashMap=new HashMap<>();
        //存入hashMap
        for(char ch:str_arr){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        //循环输出次数
        Set<Map.Entry<Character,Integer>> set=hashMap.entrySet();
        for(Map.Entry<Character,Integer> cnt:set){
            System.out.println("字符"+cnt.getKey()+"，次数:"+cnt.getValue());
        }
    }

}
