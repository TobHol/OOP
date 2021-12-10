package oop.practica.practicum4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    //test alleen maar tostring()
    // test ook de functies zelf
    AutoHuur ah1;
    @BeforeEach
    public void init(){
        ah1 = new AutoHuur();
    }

    @Test
    public void toStringGeenHuurderGeenAuto(){
        assertEquals("  er is geen auto bekend\n" +"  er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void toStringGeenHuurder(){
        Auto at = new Auto("Peugot", 120);
        ah1.setGehuurdeAuto(at);
        assertEquals("  autotype: Peugot met prijs per dag: 120,0\n" +"  er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void toStringGeenAuto(){
        Klant kt = new Klant("Jansen");
        kt.setKorting(20);
        ah1.setHuurder(kt);
        assertEquals("  er is geen auto bekend\n" +"  op naam van: Jansen (korting: 20,0%)\n" + "  aantal dagen: 0 en dat kost 0.0",ah1.toString());
    }

    @Test
    public void toStringTotaalAantalPrijsKortingKlant(){
        Klant kt = new Klant("Jansen");
        ah1.setHuurder(kt);
        Auto at1 = new Auto("Fiat", 20);
        ah1.setGehuurdeAuto(at1);
        ah1.setAantalDagen(2);
        assertEquals("  autotype: Fiat met prijs per dag: 20,0\n" +"  op naam van: Jansen (korting: 0,0%)\n" + "  aantal dagen: 2 en dat kost 40,0",ah1.toString());
    }

    @Test
    public void toStringTotaalAantalPrijsGeenAantalDagen(){
        Klant kt = new Klant("Jansen");
        ah1.setHuurder(kt);
        Auto at1 = new Auto("Fiat", 20);
        ah1.setGehuurdeAuto(at1);
        assertEquals("  autotype: Fiat met prijs per dag: 20,0\n" +"  op naam van: Jansen (korting: 0,0%)\n" + "  aantal dagen: 0 en dat kost 0,0",ah1.toString());
    }

    @Test
    public void getGehuurdeAutoGeenAuto(){
        assertEquals(null, ah1.getGehuurdeAuto());
    }

}