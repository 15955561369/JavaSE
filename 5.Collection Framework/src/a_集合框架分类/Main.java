package a_集合框架分类;

import java.util.*;

/*
* 集合框架就是官方JDK集成好的集合API,如Arraylist,HashMap,HashSet....
* 框架图:
*                                              集合
*                                   ↙                       ↘
*                       Collection(单列集合,接口)           Map(双列集合,接口)
*                           ↙继承             ↘继承                   ↓
*                 List(有序且可重复,接口)    Set(无序且不可重复,接口)    HashMap、HashTable....(实现类)
*                          ↓                ↓
*            ArrayList、LinkedList...     HashSet、TreeSet....(实现类)
* */
public class Main {

    public static void main(String[] args) {
        //集合ArrayList脱离了传统数组的长度限制
        List<String>  list = new ArrayList<>();
        list.add("a");
        List<String>  list2 = new LinkedList<>();

        Set<String> set = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new Hashtable<>();
    }

}
