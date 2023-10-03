package src.AplicatieDeGestionatConturi;

public class Tranzactie {

    private String numeClient;

    private double sumaInitiala;

    private double sumaFinala;

    public Tranzactie(String numeClient, double sumaInitiala, double sumaFinala){
        this.numeClient = numeClient;
        this.sumaInitiala = sumaInitiala;
        this.sumaFinala = sumaFinala;
    }

    public String getNumeClient(){
        return numeClient;
    }

    public double getSumaInitiala(){
        return sumaInitiala;
    }

    public double getSumaFinala(){
        return sumaFinala;
    }
}
