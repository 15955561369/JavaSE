package f_split方法;

public class Main {
    public static void main(String[] args) {
        //split(" ");按""中的字符分割原字符串，返回String数组
        String str="zhangzi/yang/wu sheng";
        String []strs=str.split("/");
        for(String s:strs){
            System.out.println(s);
        }
    }
}
