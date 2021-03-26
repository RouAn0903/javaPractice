package com.teach;

public class Info {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Lura",1900,"english");
        System.out.println(t1.toString());

        Student s1 = new Student("Mark",2001,"1234",12);
        System.out.println(s1.toString());
    }
}
