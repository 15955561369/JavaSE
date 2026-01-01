package a_绝对路径和相对路径;
/*
* 绝对路径:硬盘上存在的路径,直接写死
* 相对路径:文件相对于当前文件夹的路径
* */

import java.io.File;
import java.io.IOException;

public class Path {
    public static void main(String[] args) throws IOException {
        //使用绝对路径创建文件
        File file1 = new File("C:\\Users\\15955\\Desktop\\IO"); //若此路径不存在会报错
        file1.createNewFile();

        //使用相对路径 好处:换一台电脑不会报错
        File file2 = new File("IoTest.java");//根据当前文件夹(项目文件夹)的位置动态调整路径
        file2.createNewFile();
    }
}
