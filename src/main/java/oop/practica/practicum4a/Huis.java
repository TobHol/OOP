package oop.practica.practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        this.bouwjaar = bwjr;
        this.adres = adr;
    }

    public void setHuisbaas(Persoon hb){
        this.huisbaas = hb;
    }

    public Persoon getHuisbaas(){
        return this.huisbaas;
    }

    public String toString(){
        String s = String.format("Huis %s is gebouwd in %d", adres, bouwjaar);
        if(huisbaas != null){
            s += " en heeft huisbaas " + huisbaas.toString();
        }
        return s;
    }
}
