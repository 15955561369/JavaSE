package b_HashSet集合遍历方法;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zzy");
        hashSet.add("ws");
        //HashSet没有get方法，因为基于HashMap，HashMap是无序的，根本没有提供索引值.
        //不能用索引访问HashSet
        //使用增强for循环
        for(String str : hashSet) {
            System.out.println(str);
        }
    }
}
