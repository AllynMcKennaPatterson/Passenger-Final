package ie.atu;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerSuccessTests {
    private Passenger myPassenger;

    @BeforeEach
    void setUp(){
        myPassenger = new Passenger("Mr", "Allyn", 1453, 87715580, 21);
    }

    @Test
    void testTitle(){
        assertEquals("Mr", myPassenger.getPassengerTitle());
    }

    @Test
    void testName(){
        assertEquals("Allyn", myPassenger.getPassengerName());
    }

    @Test
    void testId(){
        assertEquals(1453, myPassenger.getPassengerId());
    }

    @Test
    void testPhone(){
        assertEquals(87715580, myPassenger.getPassengerPhone());
    }

    @Test
    void testAge(){
        assertEquals(21, myPassenger.getPassengerAge());
    }

}
