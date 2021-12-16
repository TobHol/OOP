package oop.practica.practicum4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        this.prijsPerDag = prPd;
        this.type = tp;
    }

    public String toString(){
        String s = String.format("%s met prijs per dag: %.1f", type, prijsPerDag);
        return s;
    }

    public double getPrijsPerDag(){
        return this.prijsPerDag;
    }

    public void setPrijsPerDag(double prPd){
        this.prijsPerDag = prPd;
    }

}
