package oop.practica.practicum8;

public class Main {

    public static void main(String[] args) {
        BedrijfsInventaris b1 = new BedrijfsInventaris("Koopjes.com", 30000);

        Computer c1 = new Computer("Acer", "2021.0215.52", 234.54, 2018);
        Computer c2 = new Computer("Acer", "2021.0215.52", 234.54, 2018);
        Computer c3 = new Computer("Lenovo", "1025.50215.52", 22.54, 2009);
        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(c3);

        Auto a1 = new Auto("Porsche", 300, 2020, "88088");
        Auto a2 = new Auto("Porsche", 300, 2020, "88088");
        Auto a3 = new Auto("Ford", 250, 2019, "88066");
        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);

        Fiets f1 = new Fiets("Batavus", 300, 2020, 88088);
        Fiets f2 = new Fiets("Batavus", 300, 2020, 88088);
        Fiets f3 = new Fiets("Gazelle", 10, 2019, 66088);
        b1.schafAan(f1);  //not enough budget to buy f1
        b1.schafAan(f2);  //not enough budget to buy f1
        b1.schafAan(f3);  //not enough budget to buy f1

        System.out.println(a1.toString());
        System.out.println(c1.toString());
        System.out.println(f1.toString());
        System.out.println(b1);
    }

}
