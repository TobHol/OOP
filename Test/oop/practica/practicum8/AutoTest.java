package oop.practica.practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Auto a1;
    @BeforeEach
    public void init(){
       a1 = new Auto("Mercedes", 100, 2019, "55-55-21");
    }

    @Test
    public void testEqual(){
        Auto a2 = new Auto("Mercedes", 100, 2019, "55-55-21");
        assertEquals(a1,a2);
    }

    @Test
    public void testCurrentPrice(){
        assertEquals(a1.huidigeWaarde(), 49);
    }

}