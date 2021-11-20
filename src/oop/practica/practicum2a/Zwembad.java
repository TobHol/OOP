package oop.practica.practicum2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public static void main(String[] args) {

    }

    public Zwembad(double breedte, double lengte, double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){}

    public void setBreedte(double breedte){
        this.breedte = breedte;
    }

    public void setLengte(double lengte){
        this.lengte = lengte;
    }

    public void setDiepte(double diepte){
        this.diepte = diepte;
    }

    public double getBreedte(){
        return breedte;
    }
    public double getLengte(){
        return lengte;
    }
    public double getDiepte(){
        return diepte;
    }

    public double inhoud(){
        return lengte * diepte * breedte;
    }

    public String toString(){
        String s = String.format(" This swimmingpool is %.2f meters in width, %.2f meters in length and %.2f meters deep", this.breedte, this.lengte, this.diepte);
        return s;
    }

}
