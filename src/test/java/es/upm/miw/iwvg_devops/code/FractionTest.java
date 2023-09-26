package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before(){
        fraction = new Fraction(1,2);
    }

    @Test
    void testNumerator(){
        assertEquals(1,fraction.getNumerator());
    }

    @Test
    void testDenominator(){
        assertEquals(2,fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals((double)1/2, fraction.decimal());
    }

    @Test
    void testModifyFractionNoParameters(){
        fraction = new Fraction();
        fraction.setNumerator(3);
        fraction.setDenominator(5);
        assertEquals(3,fraction.getNumerator());
        assertEquals(5,fraction.getDenominator());
    }

    @Test
    void testIsProper(){
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper(){
        assertFalse(fraction.isImproper());
    }

    @Test
    void testEquivalent(){
        Fraction testFraction = new Fraction(3,6);
        assertTrue(fraction.isEquivalent(testFraction));
    }

    @Test
    void testMultiplication(){
        Fraction testFraction = new Fraction(3,6);
        fraction.multiply(testFraction);

        assertEquals(3,fraction.getNumerator());
        assertEquals(12,fraction.getDenominator());
    }

    @Test
    void testDivision(){
        Fraction testFraction = new Fraction(3,6);
        fraction.divide(testFraction);

        assertEquals(6,fraction.getNumerator());
        assertEquals(6,fraction.getDenominator());
    }

    @Test
    void testAddition(){
        Fraction testFraction = new Fraction(3,6);
        fraction.add(testFraction);

        assertEquals(12,fraction.getNumerator());
        assertEquals(12,fraction.getDenominator());
    }
}
