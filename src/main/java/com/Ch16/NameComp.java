package com.Ch16;

import java.util.Comparator;

public class NameComp  implements Comparator<Student2>{
    public int compare(Student2 o1, Student2 o2){
        return o2.name.compareTo(String.valueOf(o1));
    }

}
