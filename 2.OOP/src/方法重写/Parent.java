package 方法重写;

public class Parent {

    //父类方法私有化时子类无法重写
    private void a1(){

    }
    //父类权限必须比子类低
    void a2(){

    }
    public void show(String name){
        System.out.println(name+"这里是父类方法");
    }
}
