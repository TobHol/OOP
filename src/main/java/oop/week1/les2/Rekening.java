package oop.week1.les2;

import oop.week1.les1.Klant;

public class Rekening {
    private int number;
    private double balance;
    private Klant accountHolder;

    // standaard commentar
    /**
     * The constructor creates a new Rekening object
     * @param number this is the acount number
     */
    public Rekening(int number){
        this.number = number;
    }

    public int getNumber(){ return this.number; }
    public double getBalance(){ return this.balance; }
    public Klant getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(Klant accountHolder){
        this.accountHolder = accountHolder;
    }

    public void transaction(double transaction){
        this.balance += transaction;
    }

    public String toString(){
        String s = " Rekening: " + number + " heeft: " + String.format("%.2f", balance) + " And the account holder: ";  // % . 2 f (after . 2 decimals of a floating point
        if (accountHolder != null){
            s += accountHolder;
        }
        else{
            s += " not defined ";
        }
//      return accountHolder != null?  s + "not defined": s += accountHolder;
        return  s;
    }

}
