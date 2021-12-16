package oop.practica.practicum4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int leeftijd){
        this.naam = nm;
        this.leeftijd = leeftijd;
    }

    public String toString(){
        String s = String.format("%s; leeftijd %d jaar", naam, leeftijd);
        return s;
    }

}
