package ie.atu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerFailTests {

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "Allyn", 12343, 87715580, 21);});
        assertEquals("Title must be Mr, Mrs, or Ms", exMessage.getMessage());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Al", 12343, 87715580, 21);});
        assertEquals("Name must have at least 3 characters", exMessage.getMessage());
    }

    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", -12343, 87715580, 21);});
        assertEquals("Id must be a positive integer", exMessage.getMessage());
    }

    @Test
    void testFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", 12343, 877155890, 21);});
        assertEquals("Phone number must have 8 digits", exMessage.getMessage());
    }

    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "Allyn", 12343, 87715580, 2);});
        assertEquals("Passenger must be at least 16 years old", exMessage.getMessage());
    }
}
