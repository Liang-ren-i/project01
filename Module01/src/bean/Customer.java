package bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Customer {
    public static void main(String[] args) {
        System.out.println("hallowed！qqq！!!");
        ArrayList list = new ArrayList<>();
        list.add(0, "第一个");
        System.out.println(list.get(0).toString());
        sss();

//        Secmod.Module
    }

    //成都市城市杀杀杀
    /*嗯嗯嗯*/
    public static void sss() {

        try {
            String ss = "";
            final String path = "F:/JAVA/GongCheng/xuexiXiangmu1/project01/src/diyigebao01/hello.txt";
            //1、得到数据文件
            File file = new File(path);


            String name;
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int length = 0;
            //循环读取文件内容，输入流中将最多buf.length个字节的数据读入一个buf数组中,返回类型是读取到的字节数。
            //当文件读取到结尾时返回 -1,循环结束。
            while ((length = fileInputStream.read(buf)) != -1) {

                System.out.println(new String(buf, 0, length));

            }

            //最后记得，关闭流
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
