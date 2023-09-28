package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
class SearchesTest {

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(2, new Searches().findFirstDecimalFractionByUserName("Ana")
                );
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName(){
        Fraction testFraction = new Searches().findFractionMultiplicationByUserFamilyName("López");
        assertEquals(12, testFraction.getNumerator());
        assertEquals(-240, testFraction.getDenominator());
    }

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(2.0,-0.2,0.5,(double)4/3),
                new Searches().findDecimalFractionByUserName("Ana").collect(Collectors.toList()));
    }

    @Test
    void testFindFractionSubtractionByUserName(){
        Fraction testFraction = new Searches().findFractionSubtractionByUserName("Ana");
        assertEquals(22, testFraction.getNumerator());
        assertEquals(60, testFraction.getDenominator());
    }

}
