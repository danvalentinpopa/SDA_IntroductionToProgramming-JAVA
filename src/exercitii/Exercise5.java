package src.exercitii;


/*
Write a code, which takes two integer number as an input and then perform math operations

addition
subtraction
multiplication
division
raising to a power (in that case first argument will be a number raised to power, second argument will be a power number.
The result of operation should be assigned to newly initialized variable of correct type.

Result should be displayed in correct way on the screen

addition -> "a = A, b = B, results is C"
subtraction -> "a = A, b = B, results is C"
multiplication -> "a = A, b = B, results is C"
division -> "a = A, b = B, results is C"
raising to a power -> "a = A, raised to power B, gives us C"
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        //Read first integer value
        System.out.println("Input first integer:");
        int firstInteger = userInput.nextInt();

        //Read second integer value
        System.out.println("Input second integer:");
        int secondInteger = userInput.nextInt();

        //adunare
        int rezultatAdunare = firstInteger + secondInteger;
        System.out.println("Adunare: " + rezultatAdunare);

        //scadere
        int rezultatScadere = firstInteger - secondInteger;
        System.out.println("Scadere :" + rezultatScadere);

        //inmultire
        int rezultatInmultire = firstInteger * secondInteger;
        System.out.println("Inmultire :" + rezultatInmultire);

        //division
        int resultatImpartire = firstInteger / secondInteger;
        System.out.println("Impartire : " + resultatImpartire);

        //ridicare la putere
        double rezultatRidicareLaPutere = Math.pow(firstInteger, secondInteger);
        System.out.println("Ridicare la putere: " + rezultatRidicareLaPutere);


    }
}
