package oop.practica.practicum9a;

import java.text.DecimalFormat;

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
        return s;
    }
}
