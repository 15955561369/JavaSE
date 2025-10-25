package 练习1;

public class Main {
    public static void main(String[] args) {
        //创建学生对象
        Student st=new Student();
        //赋值
        st.age=15;
        st.name="张三";
        st.avScore=93.5;
        //调用类方法
        st.score(st.name,st.age,st.avScore);
    }
}
