package src.exercitii;


//Write a program, which takes an number from user and display it reversed:
//for 1234, program should return 4321
//for 654789, program should return 987456

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;
        int reversed = 0;

        System.out.println("Ce numar sa inversez:");
        num = scanner.nextInt();

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("numarul inversat este " + reversed);
    }
}
