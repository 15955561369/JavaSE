package d_HashMap存放学生对象;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/*
* HashMap存放学生对象,key为学号，value为学生对象(姓名，年龄)
* */
public class Main {
    public static void main(String[] args) {
        Map<String,Student> studentMap=new HashMap<>();
        studentMap.put("001",new Student("张子阳",22));
        studentMap.put("002",new Student("吴胜",28));
        studentMap.put("003",new Student("小薇",18));
        //遍历studentMap
        Set<Map.Entry<String,Student>> entrySet=studentMap.entrySet();
        for(Map.Entry<String,Student> s : entrySet){
            System.out.println("学号:"+s.getKey()+"信息:"+s.getValue());
        }
    }

}
