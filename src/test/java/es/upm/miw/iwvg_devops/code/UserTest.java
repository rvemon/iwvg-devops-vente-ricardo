package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTest {
    private User user;

    private List<Fraction> fractions;

    @BeforeEach
    void before(){
        this.fractions = new ArrayList<>();
        this.user = new User("001", "Juan", "Perez", fractions);
    }

    @Test
    void testUserId(){
        assertEquals("001", user.getId());
    }
    @Test
    void testUserName(){
        assertEquals("Juan", user.getName());
    }
    @Test
    void testUserFamilyName(){
        assertEquals("Perez", user.getFamilyName());
    }

    @Test
    void testFullName(){
        assertEquals("Juan Perez", user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("J.", user.initials());
    }

    @Test
    void testSetValues(){
        user = new User();
        user.setName("Jose");
        user.setFamilyName("Lopez");
        assertEquals("Jose", user.getName());
        assertEquals("Lopez", user.getFamilyName());
    }

    @Test
    void testAddFraction(){
        Fraction fraction = new Fraction();
        List<Fraction> listFractions = new ArrayList<>();
        listFractions.add(fraction);

        user.addFraction(fraction);
        assertEquals(listFractions,user.getFractions());
    }

    @Test
    void testSetFractions(){
        Fraction fraction = new Fraction(1,2);
        List<Fraction> listFractions = new ArrayList<>();
        listFractions.add(fraction);

        user.setFractions(listFractions);
        assertEquals(listFractions,user.getFractions());
    }
}
