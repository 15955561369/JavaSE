package static静态关键字;

public class Demo {
    public static void main(String[] args) {
        //创建s1 和 s2对象
        Student s1=new Student();
        Student s2=new Student();
        s1.name="张子阳";
        s2.name="吴胜";

        //因为school是静态属性,所以s1和s2的school共同指向同一个school
        s1.school="西北工业大学";//此时s2.school也被赋值为“西北工业大学”

        //也可以用类名.进行访问，没必要创建对象
        //主要应用在Javaweb开发中http请求码
        Student.school="东大村男子职业技术学校";
        s1.show();
        s2.show();
    }
}
