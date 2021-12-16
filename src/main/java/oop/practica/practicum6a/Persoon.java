package oop.practica.practicum6a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();


    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public String getNaam(){
        return this.naam;
    }

    public double getBudget(){
        return this.budget;
    }

    public boolean verkoop(Game gm, Persoon p){
        boolean b = false;
        if(mijnGames.contains(gm)) {
            if (p.koop(gm)) {
                this.budget += gm.huidigeWaarde();
                //dit kan alleen omdat remove gebruikt ook equals
                // equals is overriden in game
                this.mijnGames.remove(gm);
                b = true;
                return b;
            }
        }
        return b;
    }

    public boolean koop(Game g){
        boolean b = false;
        if(!mijnGames.contains(g)){
            if (budget >= g.huidigeWaarde()) {
                        budget -= g.huidigeWaarde();
                        mijnGames.add(g);
                        b = true;
                    }
                }
        return b;
    }

    public String toString(){
        String euro = "\u20AC" ;
        String s = String.format("%s heeft een budget van %s%.2f en bezit de volgende games:", naam, euro, budget);
        for(Game g: mijnGames){
            s+= "\n";
            s += g.toString();
        }
        return s;
    }

}
