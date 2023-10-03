package src.exercitii;


/*
Write a program which convert temperature provided by user:

from Celsius to Fahrenheit (degrees in Fahrenheit = 1.8 * degrees in Celsius + 32)
from Fahrenheit to Celsius (degrees in Celsius = (degrees in Fahrenheit - 32 / 1.8))
from Celsius to Kelvin (degrees in Kelvin = degrees in Celsius + 273.15)
from Kelvin to Celsius (degrees in Celsius = degrees in Kelvin - 273.15)
from Kelvin to Fahrenheit (degrees in Fahrenheit = (degrees in Kelvin - 273.15) * 1.8 + 32)
from Fahrenheit to Kelvin (degrees in Kelvin = ((degrees in Fahrenheit - 32/1.8) + 273.15)

Write every convert operation in separate method, which will be executed in main method.

 */

import java.util.Scanner;

public class Exercise8 {

    public static double celsiusToFahrenheit(double celsius){
        return 1.8 * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32 / 1.8);
    }

    public static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin){
        return  kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 1.8 + 32;
    }

    public static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit - 32/1.8) + 273.15;
    }



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program de conversie temperaturi!");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Fahrenheit to Kelvin");

        System.out.println("Enter your choice 1-6:");
        int alegere = scanner.nextInt();

        double temperatura;

        switch (alegere){

            case 1:
                System.out.println("Introdu temperatura in Celsius: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + celsiusToFahrenheit(temperatura));
                break;
            case 2:
                System.out.println("Introdu temperatura in Fahrenheit: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + fahrenheitToCelsius(temperatura));
                break;
            case 3:
                System.out.println("Introdu temperatura in Celsius: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + celsiusToKelvin(temperatura));
                break;
            case 4:
                System.out.println("Introdu temperatura in Kelvin: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + kelvinToCelsius(temperatura));
                break;
            case 5:
                System.out.println("Introdu temperatura in Kelvin: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + kelvinToFahrenheit(temperatura));
                break;
            case 6:
                System.out.println("Introdu temperatura in Fahrenheit: ");
                temperatura = scanner.nextDouble();
                System.out.println("Temperatura este urmatoare: " + fahrenheitToKelvin(temperatura));
                break;
            default:
                System.out.println("Selectie invalida!");
        }

        scanner.close();
    }
}
