package oop.practica.practicum4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public void setKorting(double kP){
        this.kortingsPercentage = kP;
    }

    public String toString(){
        String s = String.format("  op naam van: %s (korting: %.1f%%)" , naam, kortingsPercentage);
        return s;
    }

}
