package oop.practica.practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        this.aanschafPrijs = pr;
        this.type = tp;
        this.productieJaar = jr;
        this.macAdres = adr;
    }

    public boolean equals(Object object){
        boolean x = false;
        if (object instanceof Computer){
            Computer anderePC = (Computer) object;
            if(this.macAdres.equals(anderePC.macAdres)
                && this.productieJaar == anderePC.productieJaar
                && this.type.equals(anderePC.type)){
                x = true;
            }
        }
        return x;
    }

    public String toString(){
        String s ="";
        String euro = "\u20ac";
        s = String.format("Computer: %s met productiejaar: %d heeft een waarde van: %s%.2f", type, productieJaar, euro,this.huidigeWaarde());
        return s;
    }

    @Override
    public double huidigeWaarde(){
        double d;
        int currYear = LocalDate.now().getYear();
        double rente = 10.0;
        d =  aanschafPrijs * Math.pow((double)(1.0 - rente/100.0), (double)(currYear - this.productieJaar));
        return d;
    }
}
