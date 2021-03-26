package com.teach;

public class Teacher {
    String name;
    int birthyear;
    String subject;

    public Teacher(String name, int birthyear, String subject){
        this.name=name;
        this.birthyear=birthyear;
        this.subject=subject;
    }

    public Teacher(String name, int birthyear) {
        this.name=name;
        this.birthyear=birthyear;
    }

    @Override
    public String toString() {
        return name+"\t"+birthyear+"\t"+subject;
    }
}
