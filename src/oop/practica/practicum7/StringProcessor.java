package oop.practica.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<>();

    public void voegProcesToe(Object proces){
        if(proces instanceof OpmaakProces){
            OpmaakProces nieuwProces = (OpmaakProces) proces;
            processen.add(nieuwProces);
        }

    }

    public String verwerk(String input){
        String s = input;
        for(OpmaakProces p: processen){
            s = p.maakOp(s);
        }
        return s;
    }

}
