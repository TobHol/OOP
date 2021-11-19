package oop.week1.les2;

public class Rekening {
    private int number;
    private double balance;

    public Rekening(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public void transaction(double transaction){
        this.balance += transaction;
    }

    public String toString(){
        return " Rekening: " + number + " heeft: " + balance;
    }

}
