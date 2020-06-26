/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: a.java
 * @author: 魏遇卿@date: 2020/6/19 下午8:02@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */
package autoScore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class score {
    public static int getScore(int score, char choose, char answer) {
        if (choose == answer) {
            score++;
            return score;
        } else {
            return score;
        }
    }

    public static void scoreToTxt(String name,int score) throws IOException {
        File writename = new File("D:\\WindowsCToD\\fire\\GeneticsMultipleChoice\\Score\\output.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
        writename.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
        out.write("studentID: "+name+" score: " + score + "\r\n"); // \r\n即为换行
        out.flush();
        out.close();
    }

    /*public static void main(String[] args) throws IOException {
        scoreToTxt(5);
    }*/
}

