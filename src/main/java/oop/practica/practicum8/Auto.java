package oop.practica.practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    @Override
    public double huidigeWaarde(){
        double d;
        int currYear = LocalDate.now().getYear();
        double rente = 30.0;
        d =  nieuwprijs * Math.pow((double)(1.0 - rente/100.0), (double)(currYear - this.bouwjaar));

        //for rounding
        d = d * 100;
        d = Math.round(d);
        d = d / 100;

        return d;
    }

    public boolean equals(Object obj){
        boolean x = false;
        if (obj instanceof Auto){
            Auto andereAuto = (Auto) obj;
            if (this.kenteken.equals(andereAuto.kenteken)
                    && super.equals(andereAuto)){
                x = true;
            }
        }
        return x;
    }


}
