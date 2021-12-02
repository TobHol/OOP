package oop.practica.practicum6a;

import java.text.DecimalFormat;
import java.time.LocalDate;
public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam(){
        return this.naam;
    }

    public double huidigeWaarde(){
        double d;
        int currYear = LocalDate.now().getYear();
        d =  nieuwprijs * Math.pow((double)(1.0 - 30.0/100.0), (double)(currYear - releaseJaar));
        return d;
    }

//    public boolean equals(Game andereObject){
//        boolean x = false;
//        if (andereObject.naam.equals(this.naam) && andereObject.releaseJaar == this.releaseJaar){
//            x = true;
//        }
//        return x;
//    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false; // blijft false tenzij:
        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;
            if (this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString(){
        String euro = "\u20AC" ;
        String s = String.format("%s, uitgegeven in %d; nieuwprijs: %s%.2f nu voor: %s%.2f", naam, releaseJaar, euro, nieuwprijs, euro, huidigeWaarde());
        return s;
    }
}
