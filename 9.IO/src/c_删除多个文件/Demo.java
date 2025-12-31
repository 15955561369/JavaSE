package c_删除多个文件;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        File file = new File("IoTest");
        System.out.println(file.mkdirs());

        File file1=new File("IoTest\\IoTest.java");
        file1.createNewFile();
        File file2=new File("IoTest\\IoTest.txt");
        file2.createNewFile();

        //删除文件/文件夹
        deletes(file);
    }

    //方式一
    public static void deletes(File file){
        if(file.isDirectory()){//删文件夹前需要删除所有文件
            File[] files = file.listFiles();
            for(File f:files){
                System.out.println("删除文件:"+f.getAbsolutePath());
                f.delete();
            }
            file.delete();
            System.out.println("删除文件夹:"+file.getAbsolutePath());
        }else{
            System.out.println("删除文件:"+file.getAbsolutePath());
            file.delete();
        }
    }
}
