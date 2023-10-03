package src.exercitii;

/*
Write a program, which take an input from user - positive, integer number.
Then program should display all odd numbers not greater than number provided by user.
 */


import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        int number;
        int remainder;

        System.out.println("Input a positive number");
        number = userInput.nextInt();

        for (int i = 1; i < number; i++){
            remainder = i % 2;
            if (remainder > 0){
                System.out.println("Odd number " + i);
            }
        }
    }
}
