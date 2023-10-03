package src.exercitii;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {


        int[] numereIntregi = {1, 2, 3, 4, 5};

        System.out.println("Elementele array-ului sunt urmatoarele:");
        for (int k : numereIntregi) {
            System.out.print(k + " ");
        }

        System.out.println("for each");
        for(int j : numereIntregi){
            System.out.println(j);
        }
















//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j++;
//        } while (j <= 5);
//
//
//        int i = 0;
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }











//        //Outer loop:
//        for(int i = 1; i <= 2; i++){
//            System.out.println("Outer loop: " + i); //executat de 2 ori
//
//            //Inner loop:
//            for (int j = 1; j <= 3; j++){
//                System.out.println("Inner loop: " + j); //executat de 6 ori
//            }
//        }

















//        for(int i = 1; i <= 5; i++){
//            System.out.println("numarul este: " + i);
//        }


//        int ziuaSaptamanii = 7;
//        String numeZi;
//
//        switch (ziuaSaptamanii) {
//            case 1:
//                numeZi = "Luni";
//                break;
//            case 2:
//                numeZi = "Marti";
//                break;
//            case 3:
//                numeZi = "Miercuri";
//                break;
//            case 4:
//                numeZi = "Joi";
//                break;
//            default:
//                numeZi = "Zi necunoscuta";
//                break;
//        }
//        System.out.println(numeZi);

//        int numar = 5;
//
//        switch (numar){
//            case 1:
//                System.out.println("este egal cu 1");
//                break;
//            case 5:
//                System.out.println("este egal cu 5");
//                break;
//            case 7:
//                System.out.println("este egal cu 7");
//                break;
//            default:
//                System.out.println("este executata varianta default");
//                break;
//        }


//        int numar1 = 5;
//
//        if (numar1 > 6){
//            System.out.println("Am intrat in 'if'");
//        } else if(numar1 == 8){
//            System.out.println("Am intrat in 'else if'");
//        } else if(numar1 == 5){
//            System.out.println("Am intrat in 'else if' nr 2");
//        } else {
//            System.out.println("Am intrat in 'else'");
//        }


//        String a = "Exemplu";
//        String b = "Exempluz";
//
//        boolean suntEgale = (a.equals(b));
//        System.out.println(suntEgale);


//        String textCuLitereMari = "Bucuresti";
//
//        System.out.println(textCuLitereMari.toUpperCase());
//        System.out.println(textCuLitereMari.toLowerCase());
//        System.out.println(textCuLitereMari.indexOf(1));
//        System.out.println(textCuLitereMari.replace('s', 'S'));
//
//        if (textCuLitereMari.length() == 90) {
//            System.out.println("textul are 9 caractere");
//        }


//        int intNumber = 8;
//        double numarCuZecimale = 5.8;
//        String text = "java curs";
////        String text2 = new String("java curs");
//        char caracter = 'A';
//        boolean variabileBooleana = false;
//        String unStringMaiLung = "Modulul de introducere in programare - JAVA";
//        final double PI = 3.14159;
//        final String PAROLA_SECRETA = "1234qwer";
//
//        int numar = 5;
//
//        if (!variabileBooleana){
//            System.out.println("este adevarat " + variabileBooleana);
//        }else {
//            System.out.println("nu este adevarat " + variabileBooleana);
//        }
//
//        System.out.println(intNumber);
//        intNumber--;
//        System.out.println(intNumber);
//        System.out.println(numarCuZecimale);
//        System.out.println(text);
//        System.out.println(caracter);
//        System.out.println(variabileBooleana);
//        System.out.println("Modulul curent este " + unStringMaiLung);
//        System.out.println("Variabile finala este " + PI );
//        System.out.println("Parola secreta" + PAROLA_SECRETA);


        int primulNumar = 4;
        int numarulDoi = 8;

//       System.out.println(adunare(primulNumar, numarulDoi));

    }

    public static int adunare(int primulNumar, int numarulDoi) {
        return primulNumar + numarulDoi;
    }

}
