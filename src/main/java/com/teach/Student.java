package com.teach;

public class Student extends Teacher {
    String id;
    int grade;

    public Student(String name, int birthyear,  String id,int grade){
        super(name, birthyear);
        this.id=id;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return name+"\t"+birthyear+"\t"+id+"\t"+grade+"\t";
    }
}
