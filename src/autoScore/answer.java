/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: answer.java
 * @author: 魏遇卿@date: 2020/6/16 下午2:46@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package autoScore;

import java.io.*;

public class answer {
    public static File answer(int i) {
        File srcFile = new File("D:\\WindowsCToD\\fire\\GeneticsMultipleChoice\\Answer");
        File[] fileArr = srcFile.listFiles();
        return fileArr[i];
    }

    public static char readFireAnswer(int q) throws FileNotFoundException, IOException {
        File filepath = answer(q);
        FileReader rader = new FileReader(filepath);
        StringBuilder sb = new StringBuilder();
        String s = "";
        BufferedReader br = new BufferedReader(new FileReader(filepath));

        while ((s = br.readLine()) != null) {
            sb.append(s);
        }

        br.close();
        String str = sb.toString();
        char ch[]=str.toCharArray();
        char answer = ch[0];
        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readFireAnswer(0));
    }
}