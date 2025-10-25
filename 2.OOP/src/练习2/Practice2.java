package 练习2;

public class Practice2 {
    //成员变量
    private String a;
    private int b=0;
    private String s;

    //无参构造方法
    public Practice2() {
        System.out.println("这里是无参构造");
    }

    //有参构造
    public Practice2(String a,int b,String s) {
        this.a=a;
        this.b=b;
        this.s=s;
    }
    public String toString(){
        return a+"-"+b+"-"+s;
    }

    //set方法赋值
    public void setA(String a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setS(String s) {
        this.s = s;
    }
    //get获取值
    public String getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public String getS() {
        return s;
    }


}
