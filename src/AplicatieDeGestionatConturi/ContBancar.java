package src.AplicatieDeGestionatConturi;

public class ContBancar {

    private String numeClient;

    private double sumaPrincipala;

    private double rataDobanziiAnuale;

    private int ani;

    public ContBancar(String numeClient, double sumaPrincipala, double rataDobanziiAnuale, int ani){
        this.numeClient = numeClient;
        this.sumaPrincipala = sumaPrincipala;
        this.rataDobanziiAnuale = rataDobanziiAnuale;
        this.ani = ani;
    }

    public String getNumeClient(){
        return numeClient;
    }

    public double getSumaPrincipala(){
        return sumaPrincipala;
    }

    public double getRataDobanziiAnuale(){
        return rataDobanziiAnuale;
    }

    public int getAni(){
        return ani;
    }
}
