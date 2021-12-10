package oop.practica.practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FietsTest {
    Fiets f1;
    @BeforeEach
    public void init(){
        f1 = new Fiets("Batavus", 300, 2018, 88088);
    }

    @Test
    public void testHuidigeWaarde(){
        assertEquals(f1.huidigeWaarde(), 218.70);
    }

}