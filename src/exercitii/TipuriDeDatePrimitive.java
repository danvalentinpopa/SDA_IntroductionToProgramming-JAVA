package src.exercitii;

public class TipuriDeDatePrimitive {

    public static void main(String[] args) {

        // Tipuri de date întregi
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L; // Sufixul "L" indică un literal de tip long

        // Tipuri de date cu virgulă mobilă
        float floatValue = 3.14159f; // Sufixul "f" indică un literal de tip float
        double doubleValue = 2.71828;

        // Tipul de date caracter
        char charValue = 'A';

        // Tipul de date boolean
        boolean booleanValue = true;

        // Afișarea valorilor
        System.out.println("Tipuri de date întregi:");
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);

        System.out.println("\nTipuri de date cu virgulă mobilă:");
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        System.out.println("\nTipul de date caracter:");
        System.out.println("charValue: " + charValue);

        System.out.println("\nTipul de date boolean:");
        System.out.println("booleanValue: " + booleanValue);
    }
}

