package c_迭代器next和hasNext;

import java.util.*;

public class Main {
    /*迭代器Iterator
    * Iterator是一个接口,用来遍历集合元素
    * 其Collection继承了Iterable接口
    * 所以在List和Set中都可以使用Iterator
    * */
    public static void main(String[] args) {
        /*创建arrayList*/
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        for(String s: arrayList){
            System.out.println(s);
        }

        System.out.println("---------------使用迭代器遍历-----------------");
        //创建迭代器
        Iterator<String> iterator = arrayList.iterator();

        //next访问集合中的元素，其底层为List的get(cnt++)
//        System.out.println(iterator.next());//访问第一个元素
//        System.out.println(iterator.next());//第二个
//        System.out.println(iterator.next());//第三个

        System.out.println("----------------使用hasNext()-----------------------");
        /*
        * hasNext()返回是否可以访问当前的元素
        * */
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
