package src.exercitii;

//Write a program, which print multiplication table, based on range provided by user.
// As an input program should take two integer values.


import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("Invalid number, The starting number must be less or equal to the ending number3");
            return;
        }

        //print multiplication table
        System.out.println("Multiplication table from" + firstNumber + " to " + secondNumber);
        for (int i = firstNumber; i <= secondNumber; i++){
            System.out.println("Multiplecation table for" + i + ":");
            for (int j = 1; j <= 10; j++){
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }

    }
}
