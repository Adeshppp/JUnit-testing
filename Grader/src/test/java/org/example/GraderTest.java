package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void negativeGradeShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        //lambda expression
        assertThrows(IllegalArgumentException.class,
                ()->{
                    grader.determineLetterGrade(-1);
                });
    }

    @Test
    void zeroShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(0));
    }

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }

    @Test
    void fiftyShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(50));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }
    @Test
    void sixtyShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }
    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }
    @Test
    void seventyShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }
    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(89));
    }
    @Test
    void eightyShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }
    @Test
    void ninetyShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }
}
