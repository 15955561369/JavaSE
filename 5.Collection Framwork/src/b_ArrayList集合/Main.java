package b_ArrayList集合;

import java.util.*;
/*
* 总结:
* 1.add()添加元素
* 2.set()修改元素
* 3.remove()删除元素
* 4.get()获取元素
* 5.size()获取大小
* 6.toArray(数组)转数组
* */
public class Main {
    public static void main(String[] args) {
        /*
        * ArrayList返回动态的数组，解除了原始数组的长度限制
        * <泛型> 泛型为 引用类型 或者基本数据类型的 包装类，如Integer、Character
        * */
        List<String> arrayList=new ArrayList<>();
        //add()添加元素
        arrayList.add("zzy");
        arrayList.add("ws");
        arrayList.add("xm");
        arrayList.add(3,"wx");//指定位置添加元素

        //size()获取元素个数
        for(int i=0;i<arrayList.size();i++){
            //get()方法访问数组元素,get方法在List中(多态)
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------------------------------------");
        //set()方法修改数据
        arrayList.set(0,"zzy1");
        //remove()方法删除数据
        arrayList.remove(1);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));

        // toArray(*)转为数组
        String[] str=arrayList.toArray(new String[arrayList.size()]);
        System.out.println(Arrays.toString(str));
        }
    }
}
