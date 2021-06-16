package com.Ch16;

import java.util.*;

public class StudentList2 {
    public static void main(String[] args) {
        //Comparator<Student2> c = new NameComp();
        Comparator<Student2> c = new GpaComp();

        TreeSet<Student2> sts= new TreeSet<>(c);
        sts.add(new Student2("Mike", 4, 5.5));
        sts.add(new Student2("Rose", 3, 2.1));
        sts.add(new Student2("Lily", 6, 5.6));

        for (Student2 s2:sts) {
            System.out.println(s2.toString());
        }
    }

}
