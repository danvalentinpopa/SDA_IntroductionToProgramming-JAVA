package src.exercitii;

/*
Write a program, which take an input from user.
Program should ask for password until user provide the correct password In case user provide correct password,
it should print "Correct password", otherwise,
password should be displayed on screen and user should have possibility to input password again.
 */


import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String password;
        String correctPassword = "secret password";

        while (true){

            System.out.println("Introduceti parola: ");
            password = scanner.nextLine();

            //validam daca parola este corecta
            if (password.equals(correctPassword)){
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Parola gresita, va rog reincercati:");
            }
        }
    }
}
