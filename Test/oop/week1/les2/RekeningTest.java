package oop.week1.les2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {
    Rekening r1;

    @BeforeEach                                 // will run before running EACH test
    public void initi(){
        r1 = new Rekening(20);
    }

    @Test                                       // Annotation
    void testPositiveBalanceFunction(){
        r1.transaction(200);
        assertEquals(200, r1.getBalance(), "Not expected value returned");
    }

    @Test
    public void testNegativeBalanceFunction(){
        r1.transaction(-200);
        assertEquals(0, r1.getBalance(), "Not expected value returned");
    }

}