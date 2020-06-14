/*
 * Copyright (c) 2020 魏遇卿 All Rights Reserved.
 * FileName: asdf.java
 * @author: 魏遇卿@date: 2020/6/11 下午4:50@version: 1.0
 * E-mail:358614401@qq.com
 * Code with UTF-8
 */

package autoScore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainGUI extends JFrame implements ActionListener {
    private JTextField question;
    private JButton A,B,C,D;
    Container c;//创建主容器
    //构造方法
    public mainGUI(){
        //创建窗口容器
        super("Auto score to exam");
       /* this.setBounds(100,100,100,100);*/
        //获取主容器并设置为网格组布局
        c=this.getContentPane();
        c.setLayout(null);
        this.setVisible(true);
        this.setSize(900,300);//设置窗口大小
        this.setResizable(false);//设置窗口固定大小
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作

        //网格组布局管理器

        //创建问题显示位置
        JLabel questionStudent = new JLabel("这是问题的位置andFuckJavaGUI");
        GridBagLayout questtionText = new GridBagLayout();
        questionStudent.setBounds(0,0,900,200);
        questionStudent.setText("fuckJavaGUI");//更改标签内容
        this.add(questionStudent);
        //字体
        questionStudent.setFont(new Font("微软雅黑",Font.BOLD,20));

       // setLayout(null);

        A = new JButton("A");
        A.addActionListener(this);
        this.add(A);
        A.setBounds(100, 200, 100, 50);

        B = new JButton("B");
        this.add(B);
        B.addActionListener(this);
        B.setBounds(300, 200, 100, 50);

        C = new JButton("C");
        this.add(C);
        C.addActionListener(this);
        C.setBounds(500, 200, 100, 50);

        D = new JButton("D");
        D.addActionListener(this);
        this.add(D);
        D.setBounds(700, 200, 100, 50);
    }

    /*private class panelABCD extends JPanel implements ActionListener{

    }*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("A")){
           // return "A";
        }
        if (e.getActionCommand().equals("B")){
           // return "B";
        }
        if (e.getActionCommand().equals("B")){
           // return "C";
        }
        if (e.getActionCommand().equals("B")){
           // return "D";
        }


    }
    /*public static void main(String[] args) {
        mainGUI mainGUI= new mainGUI();
    }*/
}

