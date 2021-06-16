package com.listener;


import javax.swing.*;
import java.awt.*;

public class LambdaListener3 {
    int act=0;
    JFrame jf = new JFrame("Listener demonstration");
    JButton b1 = new JButton("1-add");
    JButton b2 = new JButton("2-sub");
    JLabel l3 = new JLabel("3-label demonstration",SwingConstants.CENTER);
    JButton b4 = new JButton("4-blue");
    JButton b5 = new JButton("5-yellow");

    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();

    Container ctp = jf.getContentPane();

    public static void main(String[] args) {
        LambdaListener3 test = new LambdaListener3();
    }
    public LambdaListener3(){
        b1.addActionListener(
                e -> {
                    act++;
                    jf.setTitle("Happen"+act+"button incidents");
                }
        );
        b2.addActionListener(
                e ->{
                    act--;
                    jf.setTitle("Happen"+act+"button incidents");
                }
        );

        b4.addActionListener(
                e ->{
                    jp2.setBackground(Color.BLUE);
                }
        );
        b5.addActionListener(
                e ->{
                    jp2.setBackground(Color.YELLOW);
                }
        );

        jp1.add(b1);
        jp1.add(b2);
        jp2.add(b4);
        jp2.add(b5);

        ctp.add(jp1,BorderLayout.NORTH);
        ctp.add(l3, BorderLayout.CENTER);
        ctp.add(jp2,BorderLayout.SOUTH );

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);
        jf.setVisible(true);
    }

}
