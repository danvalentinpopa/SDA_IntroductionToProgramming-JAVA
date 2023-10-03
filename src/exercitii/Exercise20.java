package src.exercitii;

//Write a calculator which as an input takes
//two numbers
//math operator (allowed +, -, *, /)
//And display the result of operation on standard output


import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti primult numar");
        double num1 = scanner.nextDouble();

        System.out.println("introduceri numarul doi");
        double num2 = scanner.nextDouble();

        System.out.println("ce operatie doriti");
        char operator = scanner.next().charAt(0);

        double rezultat = 0.0;

        switch (operator){
            case '+':
                rezultat = num1 + num2;
                break;
            case '-':
                rezultat = num1 - num2;
                break;
            case '*':
                rezultat = num1 * num2;
                break;
            case '/':
                rezultat = num1 / num2;
                break;
            default:
                System.out.println("Eroare, operatorul este invalid!");
                System.exit(1);
        }
        System.out.println("Rezultatul este " + rezultat);
    }
}
