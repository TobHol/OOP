package oop.practica.practicum2b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String s) {
        this.naam = s;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen += 1;
        if (ch == 'g')
            aantalGelijk += 1;
        if (ch == 'v')
            aantalVerloren += 1;
    }

    public int aantalGespeeld(){
        int total = aantalGelijk + aantalGewonnen + aantalVerloren;
        return total;
    }

    public int aantalPunten(){
        int punten = aantalGewonnen *3 + aantalGelijk;
        return punten;
    }

    public String toString(){
        return naam + "\t" + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }

}
