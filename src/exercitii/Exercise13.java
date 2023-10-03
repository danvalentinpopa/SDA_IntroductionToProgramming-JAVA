package src.exercitii;

/*
Write a program which creates the array for 10 values, integer type.
Program should populate values in array with a random numbers from [-10..10]. Then:

print array and it's values
print minimum value from array
print maximum value from array
 */


import java.util.Random;

public class Exercise13 {
    public static void main(String[] args){

        int[] numbers = new int[10];

        Random random = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(21) - 10;
        }

        //print array and it's values
        System.out.println("Array values: ");
        for (int numere : numbers){
            System.out.println(numere);
        }

        //print minimum value from array
        System.out.println("Valoare minima");

        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Valoarea minima este " + min);

        //print maximum value from array
        System.out.println("Valoare maxima");

        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Valoarea maxim este " + max);
    }
}
