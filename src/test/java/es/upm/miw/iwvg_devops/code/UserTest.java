package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTest {
    private User user;

    @BeforeEach
    void before(){
        user = new User("001", "Juan", "Perez");
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
}
