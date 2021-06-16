package com.Ch16;

public class Student2 {
   String name;
   int studentID=0;
   double Gpa=0.0;

    public Student2(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.Gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", Gpa=" + Gpa +
                '}';
    }
}
