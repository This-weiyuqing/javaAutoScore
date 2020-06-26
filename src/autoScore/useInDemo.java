/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: asdf.java
 * @author: 魏遇卿@date: 2020/6/11 下午4:50@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package autoScore;

import java.util.Timer;
import java.util.TimerTask;

public class useInDemo {
    public static void main(String[] args) {
        userIn GUI=new userIn();
        //System.out.println(userIn.getStudentNumber());
        //add timetask to set user time
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("stop question");
                System.exit(0);
            }
        },10000);
    }
}
