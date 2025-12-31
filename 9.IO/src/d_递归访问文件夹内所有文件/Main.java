package d_递归访问文件夹内所有文件;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File ioTest = new File("IOTest");//相对路径
        ioTest.mkdirs();
        //访问IOTest内所有的文件和文件夹
        //findAllFiles(ioTest);
        deleteAll(ioTest);
    }

    /**
     * 递归访问file内所有的文件和文件夹
     * @param file
     */
    public static void findAllFiles(File file){
        System.out.println(file.getAbsolutePath());

        File[] files=file.listFiles();
        if(files==null){
            return;
        }
        for(File f:files){
            if(f.isDirectory()){
                findAllFiles(f);
            }else{
                System.out.println(f.getAbsolutePath());
            }
        }

    }

    /**
     * 递归删除file内所有的文件和文件夹
     * @param file
     */
    public static void deleteAll(File file){
        System.out.println("发现文件夹:"+file.getAbsolutePath());
        File[] files=file.listFiles();
        if(files==null){
            return;
        }
        for(File f:files){
            if(f.isDirectory()){
                deleteAll(f);
            }else{
                System.out.println("发现文件:"+f.getAbsolutePath());
                System.out.println("正在删除文件:"+f.getAbsolutePath()+" "+f.delete());
            }
        }
        System.out.println("文件夹:"+file.getAbsolutePath()+"内所有的文件删除成功,删除此文件夹"+file.delete());
    }
}
