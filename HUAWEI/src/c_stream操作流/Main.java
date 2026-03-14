package c_stream操作流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * stream()操作流：中间操作(可连续调用)+终止操作
 * */
public class Main {
    public static void main(String[] args) {
        /*
         * 创建stream操作流
         * 1.从集合创建
         * List: list.stream().中间操作..终止操作
         * Set: set.stream().中间操作..终止操作
         * 2.从数组创建
         * Arrays.stream(数组).中间操作..终止操作
         *
         * */
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        list.add(4);list.add(5);list.add(6);
        int[] ints = {1, 2, 3, 4, 5};
        /*
         * 中间操作：
         * 1.转换 map(lambda表达式)
         * 2.过滤 filter(lambda表达式)
         *
         * ...
         * */
        List<Integer> list1 = list.stream().map(n -> n + 1).collect(Collectors.toList());
        List<Integer> list2 = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
        Arrays.stream(ints).map(n -> n*n).forEach(x -> System.out.println("平方后的值:"+x));
        /*
         * 终止操作:
         * 1.收集到集合
         * .collect(Collectors.toList())
         * .collect(Collectors.toSet())
         * 2.统计
         * .count
         * 3.遍历每个元素
         * .forEach(n -> System.out.println(n))
         *
         * ...
         */
    }
}
