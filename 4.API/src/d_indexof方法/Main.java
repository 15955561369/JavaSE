package d_indexof方法;

public class Main {
    public static void main(String[] args) {
        //indexof("ws")返回字符串"ws"开始时的索引，不存在时返回-1
        String str="zzywszhangziyangwss";
        System.out.println(str.indexOf("wss"));
        //若有多个"ws"，后面参数fromindex表示从哪个索引开始
        System.out.println(str.indexOf("wss",17));
    }
}
