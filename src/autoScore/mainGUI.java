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
import java.io.IOException;

import static autoScore.answer.readFireAnswer;
import static autoScore.question.readFile;
import static autoScore.score.getScore;

public class mainGUI extends JFrame implements ActionListener {
    // public static JTextField questionStudent;
    JTextField questionStudent = new JTextField("问题的位置");
    //GridBagLayout questionText =new GridBagLayout();
    // questionStudent.setLineWrap(true);
    int score;
    Container c;//创建主容器
    private JTextArea question;
    private JButton A;
    private JButton B;
    private JButton C;
    private JButton D;

    //构造方法
    public mainGUI() throws IOException {
        //创建窗口容器
        super("Auto score to exam");
        /* this.setBounds(100,100,100,100);*/
        //获取主容器并设置为网格组布局
        c = this.getContentPane();
        c.setLayout(null);
        this.setVisible(true);
        this.setSize(900, 300);//设置窗口大小
        this.setResizable(false);//设置窗口固定大小
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作

        //网格组布局管理器

        //创建问题显示位置
        //JTextArea questionStudent = new JTextArea("这是问题的位置andFuckJavaGUI");
        // questionStudent
        //GridBagLayout questtionText = new GridBagLayout();
        questionStudent.setBounds(0, 0, 900, 200);
        questionStudent.setText(readFile(0));//更改标签内容
        //questionStudent.setLineWrap(true);
        questionStudent.setEditable(false);
       /* JTextField textAreaOutput = new JTextField();
        questionStudent.add(new JScrollPane(textAreaOutput));*/
        questionStudent.cut();
        questionStudent.copy();
        this.add(questionStudent);

        //pack();
        //字体
        questionStudent.setFont(new Font("微软雅黑", Font.BOLD, 20));

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
        //int用来存储现在是第几题
        int whatQuestionW = 0;
        if (whatQuestionW < 20) {


            //int whatQuestionW =0;
            String str = new String();
            if (e.getActionCommand().equals("A")) {
                str = "A";
                chooseDo(str, whatQuestionW);
            }
                /*str = "A";
                char ch[] = str.toCharArray();
                char answer = ch[0];

                try {
                    getScore(score, answer, readFireAnswer(whatQuestionW));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                whatQuestionW++;
                System.out.println(whatQuestionW);
                try {
                    questionStudent.setText(readFile(1));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }*/
            if (e.getActionCommand().equals("B")) {
                str = "B";
                chooseDo(str, whatQuestionW);
//                System.out.println(whatQuestionW);
            }
            if (e.getActionCommand().equals("C")) {
                str = "C";
                chooseDo(str, whatQuestionW);
            }
            if (e.getActionCommand().equals("D")) {
                str = "D";
                chooseDo(str, whatQuestionW);
            }
            whatQuestionW++;
        } else {
            //这里写最后结果被写入文件夹啊
        }

    }

    //按键之后要做的事
    public void chooseDo(String str, int whatQuestionW) {
        //str = "A";
        char ch[] = str.toCharArray();
        char answer = ch[0];

        try {
            getScore(score, answer, readFireAnswer(whatQuestionW));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        whatQuestionW++;
        System.out.println(whatQuestionW);
        try {
            questionStudent.setText(readFile(1));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        //mainGUI=new mainGUI();
        //actionPerformed(ActionEvent e);
    }
}
    /*public clstatic void main(String[] args) throws IOException {
        mainGUI mainGUI= new mainGUI();
    }*/


