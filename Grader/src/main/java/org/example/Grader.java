package org.example;

public class Grader {
    public char determineLetterGrade(int numberGrade){
        if(numberGrade<0) throw new IllegalArgumentException("Number grade can not be negative.");
//        if(numberGrade<0) return 'F';// failing case
        if(numberGrade<60) return 'F';
        if(numberGrade<70) return 'D';
        if(numberGrade<80) return 'C';
        if(numberGrade<90) return 'B';
        return 'A';

    }
}
