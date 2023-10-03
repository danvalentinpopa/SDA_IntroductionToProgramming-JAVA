package src.AplicatieDeGestionatConturi;

public class CalculatorDobanda {

    public static double calculeazaDobanda(ContBancar cont){
        double rataDobanziiLunare = cont.getRataDobanziiAnuale() / 12 / 100;
        return  cont.getSumaPrincipala() * Math.pow(1 + rataDobanziiLunare, cont.getAni() * 12) - cont.getSumaPrincipala();
    }
}
