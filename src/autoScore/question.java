/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: a.java
 * @author: 魏遇卿@date: 2020/6/19 下午8:02@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */
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
    public static String readFile(int q) throws FileNotFoundException,IOException{
        /*File pathname = question(q);
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File filepath=question(q);
        FileReader rader = new FileReader(filepath);
        StringBuilder sb = new StringBuilder();
        String s = "";
        BufferedReader br = new BufferedReader(new FileReader(filepath));

        while ((s = br.readLine()) != null) {
            sb.append(s );
        }

        br.close();
        String str = sb.toString();
        return str;
    }
//java读取文件返回字符串
   /* public static String readFile(String filepath) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        String s = "";
        BufferedReader br = new BufferedReader(new FileReader(filepath));

        while ((s = br.readLine()) != null) {
            sb.append(s + "\n");
        }

        br.close();
        String str = sb.toString();
        return str;
    }*/

    /*public static void main(String[] args) {
        //question(0);
        // System.out.println(readFile(4));
        readFile(0);
        //System.out.println();

    }*/
}
