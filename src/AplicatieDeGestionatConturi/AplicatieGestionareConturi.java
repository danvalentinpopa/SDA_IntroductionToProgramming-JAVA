package src.AplicatieDeGestionatConturi;

import java.util.List;
import java.util.Scanner;

public class AplicatieGestionareConturi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerConturi managerConturi = new ManagerConturi();


        while (true) {

            System.out.println("1. Adauga cont bancar");
            System.out.println("2. Calculeaza dobanda pentru conturi");
            System.out.println("3. Iesire");
            System.out.println("Alegeti o optiune: ");
            int optiune = scanner.nextInt();
            scanner.nextLine();

            switch (optiune) {
                case 1:
                    System.out.println("Introduca numele clientului");
                    String numeClient = scanner.nextLine();
                    System.out.println("Introduceti suma principala");
                    double sumaPrincipala = scanner.nextDouble();
                    System.out.println("Introduceti rata dobanzii anuale (%)");
                    double rataDobanziiAnuale = scanner.nextDouble();
                    System.out.println("Introduceti perioada (ani)");
                    int perioadaAni = scanner.nextInt();

                    ContBancar contBancar = new ContBancar(numeClient, sumaPrincipala, rataDobanziiAnuale, perioadaAni);
                    managerConturi.adaugaCont(contBancar);
                    break;

                case 2:
                    List<ContBancar> conturi = managerConturi.getConturi();
                    for (ContBancar contBancar1 : conturi) {
                        double dobanda = CalculatorDobanda.calculeazaDobanda(contBancar1);
                        double sumaFinala = contBancar1.getSumaPrincipala() + dobanda;
                        Tranzactie tranzactie = new Tranzactie(contBancar1.getNumeClient(), contBancar1.getSumaPrincipala(), sumaFinala);
                        afisareTranzactie(tranzactie);
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Optiune invalida. Alegeti din nou.");
            }
        }

    }
    private static void afisareTranzactie(Tranzactie tranzactie){
        System.out.println("Nume client: " + tranzactie.getNumeClient());
        System.out.println("Suma initiala: " + tranzactie.getSumaInitiala());
        System.out.println("Suma finala: " + tranzactie.getSumaFinala());
        System.out.println();
    }
}
