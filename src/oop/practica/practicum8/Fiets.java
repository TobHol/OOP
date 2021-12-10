package oop.practica.practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{

    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fn){
        super(tp, pr, jr);
        this.framenummer = fn;
    }

    public boolean equals(Object obj){
        boolean x = false;
        if(obj instanceof Fiets){
            Fiets andereFiets = (Fiets) obj;
            if(this.framenummer == andereFiets.framenummer
                && this.bouwjaar == andereFiets.bouwjaar
                && this.nieuwprijs == andereFiets.nieuwprijs){
                x = true;
            }
        }
        return x;
    }

    @Override
    public double huidigeWaarde(){
        double d;
        int currYear = LocalDate.now().getYear();
        double rente = 10.0;
        d =  nieuwprijs * Math.pow((double)(1.0 - rente/100.0), (double)(currYear - this.bouwjaar));

        //for rounding
        d = d * 100;
        d = Math.round(d);
        d = d / 100;
        return d;
    }

}
