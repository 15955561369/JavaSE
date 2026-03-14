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

        //主要应用在Javaweb开发中http请求码
        s1.show();
        s2.show();

        //静态属性和静态方法 可以直接通过类名.属性/方法() 进行赋值/调用，也可以通过实例的方式进行赋值/调用，如上面s1.name但是不推荐。
        Student.school="东大村男子职业技术学校";
        //而非静态的属性和方法 只能通过实例化的方式调用。
        Student.a1();
    }
}
