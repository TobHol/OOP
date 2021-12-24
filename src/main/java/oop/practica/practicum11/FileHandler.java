package oop.practica.practicum11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandler {
    private static ArrayList<Character> illegalChars = new ArrayList<Character>();
    private static ArrayList<String> illegalNames = new ArrayList<String>();
    private static int startChar = 48; //ascii char for a
    private static int endChar = 122; // ascii char for Z

    public static void FileHandler(){
        List<Character> charList = Arrays.asList('\\', '%', '*', '[', ']', '{', '}', '&', '^', '|','#', '@', '<', '>', '?', '"');
        illegalChars.addAll(charList);
        List<String> namesList = Arrays.asList("CON", "PRN", "AUX", "NULL");
        for(int i = 1; i < 10; i++){
            namesList.add(String.format("COM%d", i));
            namesList.add(String.format("LPT%d", i));
        }
        illegalNames.addAll(namesList);
    }

    public static boolean validFileName(String fileName) throws IllegalCharsetNameException {
        boolean x = true;
        for (String names: illegalNames){
            if(fileName.contains(names)){
                x = false;
            }
        }
        for (int i = 0; i< fileName.length(); i++){
            if(illegalChars.contains(fileName.charAt(i))){
                char charKey = fileName.charAt(i);
                x = false;
                throw new IllegalCharsetNameException("Found illegal char: " + fileName.substring(i, i));
            }
            if(endChar < (int) fileName.charAt(i) && startChar > fileName.charAt(i)){
                x = false;
            }
        }
        return x;
    }

    public static Path createPath(String fileName){
        Path path;
        try{
            if(validFileName(fileName)){
                path = Path.of(fileName);
            }
            else{
                path = Path.of("");
            }
        }
        catch(IllegalCharsetNameException e){
            System.out.println(e.getCharsetName());
            path = Path.of("");
        }
        return path;
    }

    public static void overWriteFile(String fileName, List<String> text)throws IOException {
        Path path = createPath(fileName);
        if(path != Path.of("")){
            BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.CREATE);
            for(String line: text){
                out.write(line + "\n");
            }
            out.close();
        }
    }

    public static List<String> readFile(String fileName) throws IOException{
        List<String> text = new ArrayList<String>();
        Path path = createPath(fileName);
        if(path != Path.of("")){
            if(Files.exists(path)){
                BufferedReader br = Files.newBufferedReader(path);
                String line = br.readLine();
                while(line != null){
                    text.add(line);
                    line = br.readLine();
                }
                br.close();
            }
            else{
                throw new IOException();
            }
        }
        return text;
    }

}
