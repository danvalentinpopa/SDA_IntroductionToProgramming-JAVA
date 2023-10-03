package src.clase;

public class Animal {

    private String numeAnimal;

    public Animal(String numeAnimal){
        this.numeAnimal = numeAnimal;
    }
    public void sunet(){
        System.out.println("Animalul " + numeAnimal + " face zgomot");
    }

}
