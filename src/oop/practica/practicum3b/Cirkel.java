package oop.practica.practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel (int rad, int x, int y){
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter zijn dan 0") ;
        }
        this.xPositie = x;
        this.yPositie = y;
        this.radius = rad;
    }

    public String toString(){
        String s = String.format("Cirkel (%d,%d) met radius: %d", xPositie, yPositie, radius);
        return s;
    }

}
