import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyFrame {

    public void setjFrame(JFrame jFrame) {
        jFrame.setSize(600,400);
        jFrame.setTitle("骰子游戏");
        Container con = jFrame.getContentPane(); //生成一个容器
        con.setLayout(new GridLayout(2, 1));  //设置容器布局
        JButton buttonObj1=new JButton("开始游戏");
        JButton buttonObj2=new JButton("退出游戏");

        JPanel jPanel1=new JPanel();
        jPanel1.setSize(600,200);
        jPanel1.add(buttonObj1,BorderLayout.CENTER);
        jFrame.getContentPane().add(jPanel1);

        JPanel jPanel2=new JPanel();
        jPanel2.setSize(600,200);
        jPanel2.add(buttonObj2,BorderLayout.CENTER);
        jFrame.getContentPane().add(jPanel2);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        buttonObj1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                play(jFrame);
            }
        });
        buttonObj2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public void play(JFrame j){
        int a=0,b=0,sum=0;
        Random random=new Random();
        a=random.nextInt(5)+1;
        b=random.nextInt(5)+1;
        sum=a+b;
        JFrame jFrame=new JFrame();
        jFrame.setSize(600,400);
        jFrame.setTitle("骰子游戏");
        Container con = jFrame.getContentPane(); //生成一个容器
        con.setLayout(new GridLayout(4, 2));  //设置容器布局

        JPanel jPanel1=new JPanel();
        jPanel1.setSize(150,200);
        JLabel jLabel1=new JLabel();
        jLabel1.setText("第一个骰子点数："+a);
        jPanel1.add(jLabel1);
        con.add(jPanel1);

        JPanel jPanel2=new JPanel();
        jPanel2.setSize(150,200);
        JLabel jLabel2=new JLabel();
        jLabel2.setText("第二个骰子点数："+b);
        jPanel2.add(jLabel2);
        con.add(jPanel2);

        JPanel jPanel3=new JPanel();
        jPanel3.setSize(150,200);
        JLabel jLabel3=new JLabel();
        if(sum<7) {
            jLabel3.setText("两个骰子点数和为：" + sum + " 恭喜你游戏获胜");
        }else {
            jLabel3.setText("两个骰子点数和为：" + sum + " 很抱歉游戏失败");
        }
        jPanel3.add(jLabel3);
        con.add(jPanel3);

        JPanel jPanel4=new JPanel();
        jPanel4.setSize(150,200);
        JButton jButton1=new JButton();
        JButton jButton2=new JButton();
        jButton1.setText("再来一次");
        jButton2.setText("返回主界面");
        jPanel4.add(jButton1);
        jPanel4.add(jButton2);
        con.add(jPanel4);

        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a=0,b=0,sum=0;
                a=random.nextInt(5)+1;
                b=random.nextInt(5)+1;
                sum=a+b;

                jLabel1.setText("第一个骰子点数："+a);

                jLabel2.setText("第二个骰子点数："+b);


                if(sum<7) {
                    jLabel3.setText("两个骰子点数和为：" + sum + " 恭喜你游戏获胜");
                }else {
                    jLabel3.setText("两个骰子点数和为：" + sum + " 很抱歉游戏失败");
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                j.setVisible(true);
            }
        });
    }
}
