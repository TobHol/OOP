package oop.practica.practicum8;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    //default constructor
    public Voertuig(){
        this("", 0, 1970);
    }

    public Voertuig(String tp, double pr, int jr){
        this.nieuwprijs = pr;
        this.type = tp;
        this.bouwjaar = jr;
    }

    public String toString(){
        String s ="";
        String euro = "\u20ac";
        s = String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: %s%.2f", type, bouwjaar, euro, huidigeWaarde());
        return s;
    }

}