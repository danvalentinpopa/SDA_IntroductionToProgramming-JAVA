package src.exercitii;


//Modify code from previous exercise, user should have possibility to input number of messages displayed on the screen

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        System.out.println("How many messages to be printed: ");

        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++){
            System.out.println("This is message in loop, loop number is: " + i);
        }
    }
}
