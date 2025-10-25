package e_hashCode与equals;

public class Student {
    public  String name;
    public Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写equals
    @Override
    public boolean equals(Object o){
        //如果二者内存地址相同，直接返回true
        if(this == o) return true;
        //强转类型
        Student o_ = (Student) o;
        //String下的equals默认比较值相等
        if(o_!=null && o_.name.equals(name) && o_.age == age) return true;
        return false;
    }

    //重写hashCode
    @Override
    public int hashCode(){
        //String下的hashCode已经重写过了,可以直接用
        return this.name.hashCode()+this.age.hashCode();
    }
}
