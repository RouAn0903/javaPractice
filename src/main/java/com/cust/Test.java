package com.cust;

public class Test {
    public static void main(String[] args) {
        Customer cust=new Customer("0001",800);
        System.out.println(cust.id+"\t"+cust.amount+"\t"+cust.getTotal());

        SilverCustomer Andy =new SilverCustomer("Andy",1500);
        System.out.println(Andy.id+"\t"+Andy.amount+"\t"+Andy.getTotal());
    }
}
