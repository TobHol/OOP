package oop.practica.practicum7;

public class HoofdletterProces implements OpmaakProces{

    @Override
    public String maakOp(String input) {
        String s = input;
        s = s.toUpperCase();
        return s;
    }

    public HoofdletterProces(){

    }



}
