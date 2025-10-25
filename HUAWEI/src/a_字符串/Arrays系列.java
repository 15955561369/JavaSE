package a_字符串;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Arrays系列 {
    public static void main(String[] args) {
        String []str={"AaA","AaA","AAA","BBCC"};
        //1.排序:Arrays.sort(str)用字典序排序数组
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        //2.倒序:Arrays.sort(str,Collections.reverseOrder())
        Arrays.sort(str,Collections.reverseOrder());
        System.out.println(Arrays.toString(str));
        //3.长度排序:Arrays.sort(str,Comparator.comparingInt(String::length))用字符串长度排序
        Arrays.sort(str,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(str));
        //4.二分查找索引(必须先排序):Arrays.binarySearch(nums,8)
        Arrays.sort(str);
        int index=Arrays.binarySearch(str,"AaA");
        System.out.println(index);
        //5.获得最值:Arrays.stream(nums).max().getAsInt()
        int []nums={1,2,3,6,5,10,7,8,9,3};
        int max=Arrays.stream(nums).max().getAsInt();
        System.out.println(max);
        //6.把整个数组转换为字符串:Arrays.toString(nums)
        System.out.println(Arrays.toString(nums));
        //7.填充:Arrays.fill(nums,10)
        Arrays.fill(str,"zzy");
        System.out.println(Arrays.toString(str));
        //8.比较是否相等:Arrays.equals(nums1,nums2)
        int []num={1,2,3};
        System.out.println(Arrays.equals(num,nums));
        //9.数组切片:Arrays.copyOfRange(Original,1,3),左闭右开
        int []num2=Arrays.copyOfRange(nums,1,3);
        System.out.println(Arrays.toString(num2));

    }

}
