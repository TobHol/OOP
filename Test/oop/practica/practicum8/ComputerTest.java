package oop.practica.practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    private Computer c1;
    @BeforeEach
    public void init(){
        c1 = new Computer("acer", "AC1204", 20, 2018);
    }

    @Test
    public void testEqualsComputer(){
        Computer c2 = new Computer("acer", "AC1204", 20, 2018);
        assertEquals(c2, c1);
    }

    @Test
    public void testHuidigeWaarde(){
        assertEquals(4.32, c1.huidigeWaarde());
    }

}