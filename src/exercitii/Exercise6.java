package src.exercitii;

/*
Write a program, which reads user input, but first print "Password please" on standard output.
Password should be displayed on screen.
If password equals to = 'secret' then print "Welcome to secret place", otherwise end the program.
 */


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Password please");

        String password = userInput.nextLine();

        System.out.println("Parola introdusa este urmatoare: " + password);

        if (password.equals("secret")){
            System.out.println("Welcome to secret place");
        }
    }
}
