package oop.week1.les2;

public class Main {
    public static void main(String[] args) {
        Rekening r1 = new Rekening(2000);
        r1.transaction(-300);
        r1.transaction(200);
        System.out.println(r1.toString());

        Rekening r2 = null;
//        System.out.println(r2.toString());  //gives null exception error
    }
}
