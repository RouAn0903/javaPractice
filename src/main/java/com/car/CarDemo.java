package com.car;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CarDemo {
    private JPanel mainPanel;
    private JPanel northPanel;
    private JTextField CarID;
    private JButton Button;
    private JLabel JLabel;
    private JLabel Cost;

    public CarDemo() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input;
                String pay;
                input = CarID.getText();
                pay =calPrice(input);
                Cost.setText(pay);
            }
        });
    }

    public String calPrice(String CarID){
        int hsFee=30;
        int pay;
        String cost;

        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123", "07:30");
        Car c2 = new Car("xyz-123", "09:45");
        Car c3 = new Car("ghi-123", "10:30");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);

        Car car = cars.get(CarID);
        if (car == null) {
            return "Car no found";
        } else {
            Date now = new Date();
            long ms = now.getTime() - car.enter.getTime();
            int hs = (int) (ms / (1000 * 60 * 60));
            pay = hs * hsFee;
            cost = (CarID + " :須付費" + pay + "元");
            return cost;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Parking lot" );
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,400);
        //frame.setTitle("Parking lot");
        frame.setVisible(true);
    }
}
