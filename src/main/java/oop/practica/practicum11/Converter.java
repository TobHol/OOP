package oop.practica.practicum11;

import java.util.List;

public class Converter {
    static final double usdToEuro = 0.918720;

    public static double Converter(double dollars){
        double euros = Converter(dollars, usdToEuro);
        return euros;
    }

    public static double Converter(double dollars, double course){
        double euro = dollars * course;
        return euro;
    }


}
