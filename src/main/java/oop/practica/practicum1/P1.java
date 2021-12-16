package oop.practica.practicum1;

public class P1 {

    public static void main(String[] args){
        randomNumber();
        forLoop();
        whileLoop();
        countNumber();
        sawteethPattern();
    }

    public static void forLoop(){
        for( int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void whileLoop(){
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(i);
        }
    }

    public static void randomNumber(){
        for( int i = 0; i < 10; i++){
            System.out.println(Math.random());
        }
    }

    public static void countNumber(){
        int total =0;
        for(int i = 0; i <=39; i++){
            total += i;
        }
        System.out.println(total);
    }

    public static void sawteethPattern(){
        for(int i = 0; i <10; i++){
            if (i % 2 == 0){
                System.out.println("s");
            }
            else {
                System.out.println("ss");
            }
        }
    }

}




