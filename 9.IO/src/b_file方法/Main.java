package b_file方法;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        //创建文件
        File file = new File("C:\\Users\\15955\\Desktop\\IO\\Test.java");
        System.out.println(file.createNewFile());
        //创建文件夹/目录
        File file_ = new File("C:\\Users\\15955\\Desktop\\IO\\io\\");
        System.out.println(file_.mkdirs());
        //获取文件/文件夹名称
        System.out.println(file.getName());
        //判断是否为文件夹
        if(file.isDirectory()){
            System.out.println(file.getName()+"是文件夹");
        }
        //判断是否为文件
        if(file.isFile()){
            System.out.println(file.getName()+"是文件");
        }
        //判断文件是否存在
        if(file_.exists()){
            System.out.println(file_.getName()+"该文件/文件夹存在");
        }
        //获取文件/文件夹的绝对路径
        String absolutePath = file_.getAbsolutePath();
        System.out.println(file_.getName()+"的绝对路径："+absolutePath);
        //获取文件/文件夹的相对路径
        String path = file_.getPath();
        System.out.println(file_.getName()+"的相对路径："+path);
        //返回该文件夹下所有的文件(String类型)
        System.out.println("--------------------------------------------------");
        String[] list=file_.list();
        for(String s:list){
            System.out.println(s);
        }
        //返回该文件夹下所有的文件(File对象类型)
        System.out.println("--------------------------------------------------");
        File[] files=file_.listFiles();
        for(File f:files){
            System.out.println(f.getName());
        }
        //删除文件/文件夹
        File file1 = new File("IoTest.java");
        System.out.println(file1.createNewFile());
        System.out.println("是否删除成功"+file1.delete());//删除文件
        File file2 = new File("IoTest");
        System.out.println(file2.mkdirs());
        System.out.println("是否删除成功"+file2.delete());//删除文件夹前需要先删除文件夹里所有的文件
    }
}
