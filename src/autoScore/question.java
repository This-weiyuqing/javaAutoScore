package autoScore;

import java.io.*;

public class question {
    public static File question(int i) {
        File srcFile = new File("D:\\WindowsCToD\\fire\\GeneticsMultipleChoice\\Question");
        File[] fileArr = srcFile.listFiles();
        //System.out.println(fileArr[i]);
        return fileArr[i];
    }

/*    public static void questiontext() {
        File fireName=question(0);
        InputStream in;
        InputStreamReader reader=new InputStreamReader(new FileInputStream(fireName));
    }*/
public static void readFile() {
     File pathname = question(0);
    try (FileReader reader = new FileReader(pathname);
         BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
    ) {
        String line;
        //网友推荐更加简洁的写法
        while ((line = br.readLine()) != null) {
            // 一次读入一行数据
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        question(0);
        System.out.println(question(0));
        readFile();
    }
}
