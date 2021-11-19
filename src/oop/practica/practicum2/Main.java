package oop.practica.practicum2;

public class Main {
    public static void main(String[] args) {
        Swimmingpool s1 = new Swimmingpool(300.4424, 200.2532, 500.24524);
        System.out.println("INFORMATION SWIMMINGPOOL: " + s1.toString());
        System.out.println("VOLUME: " + s1.getVolume());
    }
}
