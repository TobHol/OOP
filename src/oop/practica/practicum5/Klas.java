package oop.practica.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kC){
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public ArrayList<Leerling> getDeLeerlingen(){
        return deLeerlingen;
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l: deLeerlingen){
            if (l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }
        }
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    public String toString(){
        String s;
        s = String.format("In klas %s zitten de volgende leerlingen:\n", klasCode);
        for(Leerling l: deLeerlingen){
            s += l.toString() + "\n";
        }
        return s;
    }
}
