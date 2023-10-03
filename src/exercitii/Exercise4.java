package src.exercitii;

/*
Write a code, which take integer number from user and print it to standard output.
Following message should be displayed "User input X" - where X is the value of number provided by user.
Expect that user should input only integer values

Handle user input with Scanner library.
Perform testing, how the program behaves for data types other than integer.
 */


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){

        //Citim din consola un integer
        //Creem un obiect din clasa Scanner

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input integer number: ");

        //aici introducem un numar in consola
        int input = userInput.nextInt();

        System.out.println("User input " + input);
    }
}
