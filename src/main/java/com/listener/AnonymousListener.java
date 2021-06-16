package com.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousListener extends JFrame {
   int act =0;

    public static void main(String[] args) {
        AnonymousListener test = new AnonymousListener();
    }
    public AnonymousListener(){
        setTitle("Listener Demonstration");
        JButton mybutton = new JButton("Change title");

        mybutton.addActionListener( e ->{
            act++;
            setTitle("It's "+act+" button incident");
                }

        );
        getContentPane().add(mybutton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }
}
