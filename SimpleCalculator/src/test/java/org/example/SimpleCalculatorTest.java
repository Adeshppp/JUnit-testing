package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour(){
//        SimpleCalculator simpleCalculator= new SimpleCalculator();
        // java infer the type of variable
        var calculator= new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
        assertNotEquals(0,calculator.add(2,2));
        assertTrue(calculator.add(2,2)==4);
        assertFalse(calculator.add(2,2)==0);
    }

    @Test
    void twoPlusEightShouldEqualTen(){
//        SimpleCalculator simpleCalculator= new SimpleCalculator();
        // java infer the type of variable
        var calculator= new SimpleCalculator();
        assertEquals(10, calculator.add(2,8));
    }
}
