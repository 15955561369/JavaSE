package h_字节流实现拷贝文件;
/*
* 在工程文件夹下创建Test文件夹，并将9.IO文件夹内所有的文件都拷贝到Test中
* */

import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        //首先再Test中创建9.IO中所有的文件和文件夹的副本，然后再将每个文件的内容依次拷贝
        File file = new File("9.IO");
        getAllFileAndFolder(file);
        //拷贝文件夹
        System.out.println("-----------拷贝文件夹---------------");
        for (String fs : folderArray) {
            //目标路径
            String goal_path="拷贝Test"+fs.substring(27);
            File f = new File(goal_path);
            f.mkdirs();
            System.out.println("文件夹:"+fs+"拷贝完成");
        }
        //拷贝文件
        System.out.println("-------------拷贝文件-----------------");
        for (String fs : fileArray) {
            FileInputStream input = new FileInputStream(fs);
            //目标路径
            String goal_path="拷贝Test"+fs.substring(27);
            FileOutputStream output = new FileOutputStream(goal_path);
            int by;
            while((by=input.read())!=-1){
                output.write(by);
            }
            System.out.println("文件:"+goal_path+"拷贝完成");
        }
    }

    //获取9.IO所有的文件和文件夹夹
    static ArrayList<String> fileArray = new ArrayList<>();
    static ArrayList<String> folderArray = new ArrayList<>();

    public static void getAllFileAndFolder(File f) {
        String path=f.getAbsolutePath();
        if (f.isFile()) {//如果是文件,获取其绝对路径add到ArrayList中
            System.out.println("检测到文件:" + path);
            fileArray.add(path);
            return;
        }
        System.out.println("文件夹:"+path);
        folderArray.add(path);
        File[] files = f.listFiles();
        for (File file : files) {//递归文件夹里的文件/文件夹
            getAllFileAndFolder(file);
        }
    }
}
