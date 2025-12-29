package 案例_学生管理系统;
import java.util.*;
public class StudentManage {
    //ArrayList存储学生信息
    static List<Student>stus=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("------------学生管理系统-------------");
            System.out.println("1.添加学生信息");
            System.out.println("2.修改学生信息");
            System.out.println("3.删除学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.退出系统");
            System.out.println("请输入[1,5]");
            int num=sc.nextInt();
            sc.nextLine();//清除缓存中的换行符
            switch(num){
                case 1://添加
                    Student newStu=addStudent();
                    if(newStu!=null) {
                        stus.add(newStu);
                        System.out.println("添加成功!");
                    }
                    else System.out.println("添加失败!该学号已经存在,请检查输入");
                    break;
                case 2://修改
                    updateStudent();
                    break;
                case 3://删除
                    deleteStudent();
                    break;
                case 4://查询
                    for(Student s:stus)
                        System.out.println(s.toString());
                    break;
                case 5://退出
                    /*
                    * 方式1:return
                    * 方式2:System.exit(0)
                    * */
                    System.out.println("感谢使用!");
                    System.exit(0);
            }
        }


    }
    /*检查集合中是否存在该学生的信息,如果存在返回该学生对象，不存在返回null*/
    private static Student cheek(String id){
        /*遍历集合stus*/
        for(Student stu:stus){
            /*查询到此人*/
            if(stu.getId().equals(id)){
                return stu;
            }
        }
        return null;
    }
    /*添加学生，返回添加的学生对象*/
    private static Student addStudent(){
        System.out.println("开始添加...");
        System.out.println("输入学号");
        String id=sc.nextLine();
        System.out.println("输入姓名");
        String name=sc.nextLine();
        System.out.println("输入地址");
        String address=sc.nextLine();
        /*集合中不存在该学生*/
        if(cheek(id)==null) return new Student(id,name,address);
        return null;
    }

    /*修改学生信息,输入被修改学生的id*/
    private static void updateStudent(){
        System.out.println("输入你要修改的学生的学号");
        String id=sc.nextLine();
        if(cheek(id)!=null){
            System.out.println("输入修改后的姓名");
            String name=sc.nextLine();
            System.out.println("输入修改后的地址");
            String address=sc.nextLine();
            /*将查询到的学生对象的属性进行修改*/
            cheek(id).setName(name);
            cheek(id).setAddress(address);
            System.out.println("修改完成");
            /*修改完成就返回，不执行下面的语句*/
            return;
        }
        /*该学生不存在，直接返回*/
        System.out.println("该学生不存在!请检查输入");
    }
    /*删除某个学生的信息,返回值void*/
    private static void deleteStudent(){
        System.out.println("输入你要删除的学生的学号");
        String id=sc.nextLine();
        Student stu=cheek(id);
        if(stu!=null){
            stus.remove(stu);
            System.out.println("学号为"+stu.getId()+"姓名为"+stu.getName()+"的学生已被删除");
            /*直接返回*/
            return;
        }
        System.out.println("该学生不存在!请检查输入");
    }
}
