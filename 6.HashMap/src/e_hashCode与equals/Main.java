package e_hashCode与equals;

/*
* object类下的equals方法默认比较二者的 地址 是否相等
* 如果需要比较对象的值是否相等，需要重写equals方法
* 以下有两条规定
* 规定1:重写equals之后，如果二者equals相等(值相等),那么hashCode一定也要相等 ------->因此重写equals后，一定也要重写hashCode
* 规定2:如果hashCode相等，equals(值)不一定相等  ----->hash冲突问题
* */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("zy",22);
        Student s2 = new Student("zy",22);
        //未重写equals方法，地址不相等,返回false
        //System.out.println(s1.equals(s2));
        //重写equals方法，用于比较对象的值是否相等,返回ture
        System.out.println(s1.equals(s2));

        //重写hashCode之前,二者的地址不相等
        //System.out.println(s1.hashCode());
        //System.out.println(s2.hashCode());
        //重写hashCode后，满足规定1
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //规定2演示
        String a="a";
        Integer int97=97;
        //地址相同但值不同 ---hash冲突问题
        System.out.println(a.hashCode());
        System.out.println(int97.hashCode());
    }
}
