package oop.practica.practicum9a;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Utils {
    public static String euroBedrag(double bedrag){
        String s = euroBedrag(bedrag, 2);
        return s;
    }
    public static String euroBedrag(double bedrag, int precise){
        String s = "";
        String precision = "#.";

        for(int i = 0; i < precise; i++){
            precision += "#";
        }
        DecimalFormat df = new DecimalFormat(precision);
        s = df.format(bedrag);
        if(s.substring(s.indexOf(',')).length() <= 2){
            s = s + "0";
            System.out.println(s);
        }
        System.out.println(s);
        s = "€" + s;
        return s;
    }
}
