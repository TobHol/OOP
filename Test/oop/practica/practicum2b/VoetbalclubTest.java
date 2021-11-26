package oop.practica.practicum2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    Voetbalclub v1;


    @Test
    void checkClubnaamNull() {
        v1 = new Voetbalclub("");
        assertEquals("FC", v1.getNaam());
    }

    @Test
    void testFoutiveInvoer() {
        v1 = new Voetbalclub("Tobias");
        v1.verwerkResultaat('3');
        assertEquals(0, v1.aantalGespeeld());
    }

    @Test
    void testVerwerkResultaat() {
        v1 = new Voetbalclub("Tobias");
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        assertEquals(4, v1.aantalPunten());

    }

    @Test
    void checkToString() {
        v1 = new Voetbalclub("Tobias");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        assertTrue(v1.toString().contains("3 1 0"));
    }

    @Test
    void checkAantalGespeeld() {
        v1 = new Voetbalclub("Tobias");
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('g');
        assertEquals(5, v1.aantalGespeeld());
    }


}