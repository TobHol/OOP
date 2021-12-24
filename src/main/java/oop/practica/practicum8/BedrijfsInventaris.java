package oop.practica.practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris{
    private ArrayList<Goed> alleGoederen = new ArrayList<>();
    private String bedrijfsnaam;
    private double budget;

    public BedrijfsInventaris(String nm, double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g)){
            if(budget >= g.huidigeWaarde()){
                budget -= g.huidigeWaarde();
                alleGoederen.add(g);
            }
        }
    }

    public String toString(){
        String s = String.format("Bedrijf: %s heeft een budget van: %.2f, en de artikelen:\n", bedrijfsnaam, budget);
        for(Goed g : alleGoederen){
            s += String.format("\tArtikel: %s\n", g.toString());
        }

        return s;
    }
}
