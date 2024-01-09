package com.assignment;

import java.util.Comparator;

class StudentRankingCamparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
