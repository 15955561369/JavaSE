package a_file类;

/**
 * File类位于java.io包下
 * File()可以将文件(或目录)转化为一个实例对象,这个文件可以先不存在，操作过后自动创建
 * 核心API:
 * 1)createNewFile() 创建文件
 * 2)mkdirs() 创建文件夹/目录
 */
import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException{

        //File()创建对象
        //方式1:
        File file1 = new File("C:\\Users\\ZY\\Desktop");
        //方式2:
        File file2 = new File("C:\\Users\\ZY\\", "Desktop");
        //方式3:
        File file3 = new File("C:\\Users\\ZY\\");
        File file4 = new File(file3,"Desktop");

    }
}
