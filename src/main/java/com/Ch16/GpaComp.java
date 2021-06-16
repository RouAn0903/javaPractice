package com.Ch16;

import java.util.Comparator;

public class GpaComp implements Comparator<Student2>{
    public int compare(Student2 o1, Student2 o2){
        if(o1.Gpa==o2.Gpa){
            return 0;
        }else if(o1.Gpa>o2.Gpa){
            return -1;
        }else{
            return 1;
        }
    }

}
