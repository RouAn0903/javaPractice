package com.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class ShowImage extends JPanel {
    Image img = null;

    public ShowImage(String filename){
        img =getToolkit().getImage(filename);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        Dimension d =getSize();
        AffineTransform at = new AffineTransform();

        double sc =Math.min(d.width/(double)img.getWidth(null),d.height/(double)img.getHeight(null));
        at.scale(sc, sc);
        g2.drawImage(img, at, this);
    }

    public static void main(String[] args) {
        try{
            ShowImage dimg = new ShowImage(args[0]);
            JFrame f = new JFrame(args[0]);
            f.getContentPane().add(dimg);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(640,480);
            f.setVisible(true);

        }catch (Exception e){
            System.out.println("Java Image <Image Name>");
            System.exit(0);
        }
    }
}
