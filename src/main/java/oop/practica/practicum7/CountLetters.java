package oop.practica.practicum7;

import java.util.HashMap;

public class CountLetters implements OpmaakProces {

    @Override
    public String maakOp(String input){
        String s = input;
        HashMap<Character, Integer> amountLetters = new HashMap<Character, Integer>();
        for (int i = 0; i< s.length(); i++){
            if(amountLetters.containsKey(s.charAt(i))){
                char charKey = s.charAt(i);
                int placeHolder = (int)amountLetters.get(charKey);
                amountLetters.put(charKey,++placeHolder);
            }
            else{
                char charKey = s.charAt(i);
                amountLetters.put(charKey,1);
            }
        }
        s = s + amountLetters;
        return s;
    }
}
