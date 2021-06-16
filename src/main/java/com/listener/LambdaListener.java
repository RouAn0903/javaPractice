package com.listener;

import javax.swing.*;
import java.awt.*;

public class LambdaListener {
  int act =0;
  JFrame jf = new JFrame();

    public static void main(String[] args) {
        LambdaListener test = new LambdaListener();
    }
    public LambdaListener(){
        jf.setTitle("Listener demonstration");
        JButton mybutton1 = new JButton("Button1");
        JButton mybutton2 = new JButton("Button2");
        JButton mybutton3 = new JButton("Button3");
        JButton mybutton4 = new JButton("Button4");
        JButton mybutton5 = new JButton("Button5");

        mybutton1.addActionListener(e ->{
            act++;
            jf.setTitle("Happen "+act+" button incidents");
        });

        Container ct = jf.getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(mybutton1);
        ct.add(mybutton2);
        ct.add(mybutton3);
        ct.add(mybutton4);
        ct.add(mybutton5);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,400);
        jf.setVisible(true);
    }
}
