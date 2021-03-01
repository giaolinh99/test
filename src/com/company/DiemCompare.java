package com.company;

import java.util.Comparator;

public class DiemCompare implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getDiemTB() == s2.getDiemTB())
            return 0;
        else if(s1.getDiemTB() < s2.getDiemTB())
            return 1;
        else
            return -1;

    }



}
