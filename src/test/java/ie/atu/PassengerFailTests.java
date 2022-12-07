package ie.atu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerFailTests {

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "Allyn", 12343, 87715580, 21);});
        assertEquals("Invalid title", exMessage.getMessage());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Al", 12343, 87715580, 21);});
        assertEquals("Invalid name", exMessage.getMessage());
    }

    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", -12343, 87715580, 21);});
        assertEquals("Invalid id", exMessage.getMessage());
    }

    @Test
    void testFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", 12343, 877155890, 21);});
        assertEquals("Invalid phone no", exMessage.getMessage());
    }

    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", 12343, 87715580, 2);});
        assertEquals("Invalid age", exMessage.getMessage());
    }
}
