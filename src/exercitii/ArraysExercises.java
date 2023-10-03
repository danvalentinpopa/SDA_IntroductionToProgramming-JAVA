package src.exercitii;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] array){

        System.out.println("Primul exercitiu:");
        int[] primulArray = new int[]{1, 3, 5, 8, 10, 20, 55, 63};
        System.out.println(primulArray[0]);
        System.out.println(primulArray[2]);
        System.out.println(primulArray[3]);
        System.out.println(primulArray[5]);
        System.out.println(primulArray[7]);


        System.out.println("Exercitiu 2:");
        String[] arrayString = new String[]{"Mere", "Pere", "Gutui", "Cirese", "Piersici"};
        System.out.println(arrayString[0]);
        System.out.println(arrayString[0]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[1]);

        System.out.println("Exercitiu 3:");
        int[] secondArray = new int[]{2, 5, 8, 6, 33, 45, 7, 100, 85};
        for (int i = 0; i < secondArray.length; i++){
            System.out.println(secondArray[i]);
        }

        System.out.println("Exercitiu 4:");
        int[] altArray = new int[]{4, 15, 82, 56, 323, 435, 75, 1060, 854};
        for(int variabila : altArray){
            System.out.println(variabila);
        }

        System.out.println("Exercitiu 5:");
        String splitString = "Azi facem modulul de Java";
        String[] arrayStringSecond = splitString.split("a");
        for (String split : arrayStringSecond){
            System.out.println(split);
        }


        String[] nume = {"Alex", "Dana", "Mircea"};
        int[] varsta = {20, 25, 35, 5};

        for (int i = 0, j = 0; i < nume.length || j < varsta.length; i++, j++){
            System.out.println( "Nume: " + nume[i] + ", varsta: " + varsta[j]);
        }

    }
}
