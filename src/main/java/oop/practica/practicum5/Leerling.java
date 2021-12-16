package oop.practica.practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        this.naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public double getCijfer(){
        return cijfer;
    }

    public void setCijfer(double c){
        this.cijfer = c;
    }

    public String toString(){
        String s;
        s = String.format("%s heeft cijfer: %.1f", naam, cijfer);
        return s;
    }

}
