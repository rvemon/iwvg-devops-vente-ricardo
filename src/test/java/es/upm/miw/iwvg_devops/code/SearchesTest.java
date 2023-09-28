package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
public class SearchesTest {

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

}
