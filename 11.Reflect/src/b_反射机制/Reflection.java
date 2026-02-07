package b_反射机制;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 反射机制:
* 类加载器将.class文件加载到JVM程序内存中后，就可通过 反射机制 获取到此class信息，可用于动态创建对象。
* ps:Class.forName("")此反射方式会默认加载一下class，故不需要先new 出对象将class加载到JVM
*
* 动态创建对象：所谓的动态创建对象是指在运行时根据实际需要动态调整需要创建的对象，而不是在编译阶段用new写死。
*            举例: new User()在编译阶段就已将对象的类型User写死，而Class.forName("包名.User")在运行阶段才会创建User对象，并且其类型User可以随时用其他字符串来替换
*
* 使用场景:
* 1)Jdbc中注册MySQL驱动 Class.forName("驱动地址")
* 2)Spring底层
* 3)手写第三方框架
*
* 核心API:
* 1)getConstructor 用于创建对象时访问User的有参构造方法
* 2)getDeclaredFields 获取User所有的属性字段
* 3)getDeclaredMethod 获取User所有的成员方法
* */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取class信息的方式
        //1.类名.class (没必要，因为已经知道了类名)
        System.out.println(User.class);
        //2.new 出对象,调用getClass()方法 (不必要,同理)
        User user = new User();
        Class<?> aCLass= user.getClass(); // <?>表示泛型通配符，未知其数据类型，所以也不能手动添加任何的具体对象，只能添加null。比如ArrayList<?> stuList= new ArrayList<>()就只能添加null
        System.out.println(aCLass);
        //3.Class.forName("包名.类名")   最常用
        Class<?> aClass1 = Class.forName("b_反射机制.User");
        System.out.println(aClass1);


        //一、反射机制动态创建对象
        Class<?> aClass2 = Class.forName("b_反射机制.User");
        Object o1=aClass2.newInstance();//默认访问无参构造方法
        System.out.println(o1);
        //若要访问有参构造方法，需要一个构造器
        Constructor<?> constructor=aClass2.getConstructor(String.class,Integer.class,String.class);
        Object o2=constructor.newInstance("zzy",23,"shanxi");
        System.out.println(o2);

        //二、反射机制给动态对象属性赋值
        Class<?> aClass3 = Class.forName("b_反射机制.User");
        Field[] fields=aClass3.getDeclaredFields();//获取所有的属性字段，返回列表
        for(Field field:fields){
            System.out.println(field);
        }
        //只给单个属性赋值
        Field userNameField=aClass3.getDeclaredField("name");
        //参数一 对象，参数二 赋值
        Object o3=aClass3.newInstance();//创建对象
        userNameField.set(o3,"张子阳");
        System.out.println(o3);
        //如果要赋值的属性为private，需要先设置权限，如下
        Field userAddressField=aClass3.getDeclaredField("address");
        userAddressField.setAccessible(true);//先设置权限
        userAddressField.set(o3,"西安");//再赋值
        System.out.println(o3);

        //三、反射机制调用动态对象的方法
        Class<?> aClass4 = Class.forName("b_反射机制.User");
        Method[] methods=aClass4.getDeclaredMethods();//获取所有的方法，返回列表
        for(Method method:methods){
            System.out.println(method);
        }
        //只调用单个方法
        Method show1Method=aClass4.getDeclaredMethod("show1",String.class);
        Object o4=aClass4.newInstance();//创建对象
        String result= show1Method.invoke(o4,"zzy").toString();//调用show1方法,返回result
        System.out.println(result);
        //如果方法为private,也需要先设置权限
        Method show2Method=aClass4.getDeclaredMethod("show2",String.class);
        show2Method.setAccessible(true);
        String result2= show2Method.invoke(o4,"张子阳").toString();
        System.out.println(result2);
    }
}
