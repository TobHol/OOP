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

    public boolean equals(Object obj){
        boolean x = false;
        if (obj instanceof Voertuig){
            Voertuig anderVoertuig = (Voertuig) obj;
            if(this.type.equals(anderVoertuig.type) &&
               this.nieuwprijs == anderVoertuig.nieuwprijs &&
               this.bouwjaar == anderVoertuig.bouwjaar){
                x = true;
            }
        }
        return x;
    }

    public String toString(){
        String s ="";
        String euro = "\u20ac";
        // kan alleen huidigewaarde aanroepen omdat het een abstracte klasse is en weet dat de objecten hiervan wel deze methode zullen hebben.
        s = String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: %s%.2f", type, bouwjaar, euro, huidigeWaarde());
        return s;
    }

}