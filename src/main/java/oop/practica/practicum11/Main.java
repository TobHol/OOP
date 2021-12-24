package oop.practica.practicum11;

import oop.practica.practicum9a.Utils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    private static List<String> text = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Input file: ");
        Scanner keyboardScanner = new Scanner(System.in);
        String inputFileName = keyboardScanner.nextLine();

        try{
            text = FileHandler.readFile(inputFileName);
        }
        catch(IOException e){
            System.out.println("Can't find file");
        }
        catch(IllegalCharsetNameException e){
            System.out.println(e.getCharsetName());
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }

        List<String> newText = splitString(text);
        System.out.println("Output File: ");
        keyboardScanner = new Scanner(System.in);
        String outputFileName = keyboardScanner.nextLine();
        try{
            FileHandler.overWriteFile(outputFileName, newText);
        }
        catch(IOException e){
            System.out.println("Can't create file: " + outputFileName);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

    }


    public static List<String> splitString(List<String> text){
        List<String> newText = new ArrayList<String>();
        for (String rule: text){
            double priceDollar =  Double.parseDouble(rule.substring(rule.indexOf(":")+1, rule.length()));
            double priceEuros = Converter.Converter(priceDollar);
            String dollar = rule.substring(rule.indexOf(": ")+1, rule.length());
            String Euro = Utils.euroBedrag(priceEuros, 2);
            rule = rule.replace(dollar, Euro);
            newText.add(rule);
        }
        return newText;
    }



}
