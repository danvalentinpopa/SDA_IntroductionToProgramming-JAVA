package src.clase;

import javax.sound.midi.Soundbank;

public class Persoana {

    private String nume;
    private int varsta;

    //Constructor cu doi parametri
    public Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    //Constructor fara parametri
    public Persoana(){
        this.nume = "Necunoscut";
        this.varsta = 0;
    }

    //getter pentru nume
    public String getNume(){
        return nume;
    }

    //setter pentru nume
    public void setNume(String nume){
        this.nume = nume;
    }

    //getter pentru varsta
    public int getVarsta(){
        return varsta;
    }

    //setter pentru varsta
    public void setVarsta(int varsta){
        if (varsta >= 0){
            this.varsta = varsta;
        } else {
            System.out.println("sunt acceptate doar numere pozitive!");
        }
    }

    void printeazaNumeSiVarsta(){
        System.out.println("Cei doi parametri din constructor sunt " + nume + " si " + varsta);
    }
}

class Om{
    public static void main(String[] args){

        Persoana persoana = new Persoana("Dan", 37);
        persoana.printeazaNumeSiVarsta();
        System.out.println(persoana.getNume());
        persoana.setNume("Daniel");
        System.out.println(persoana.getNume());


        Persoana persoana1 = new Persoana();
        persoana1.printeazaNumeSiVarsta();
        System.out.println(persoana1.getVarsta());
        persoana1.setVarsta(60);
        System.out.println(persoana1.getVarsta());
    }
}

