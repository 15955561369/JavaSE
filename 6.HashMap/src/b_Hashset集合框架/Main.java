package b_Hashset集合框架;

import java.util.HashSet;
import java.util.Set;

/*
* HashSet基于HashMap
* 区别是不存储键值对,只存储一个元素。元素的值就是HashMap的Key
* 也是无序的
* */
public class Main {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        //添加元素
        hashSet.add("zzy");
        hashSet.add("ws");
        hashSet.add("xm");
        //Set不允许重复，自动去重
        hashSet.add("xm");
        System.out.println(hashSet);
    }
}
