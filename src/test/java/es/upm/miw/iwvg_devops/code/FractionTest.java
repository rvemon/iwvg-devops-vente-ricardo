package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
