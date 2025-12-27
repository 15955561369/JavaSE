package 案例_学生管理系统;

public class Student {
    /*学号*/
    private String id;
    /*姓名*/
    private String name;
    /*地址*/
    private String address;
    /*有参构造方法*/
    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "学号:"+id+"\t姓名:"+name+"\t地址:"+address;
    }

}
