package src.AplicatieDeGestionatConturi;

import java.util.ArrayList;
import java.util.List;

public class ManagerConturi {

    private List<ContBancar> conturi = new ArrayList<>();

    //Metoda pentru adaugarea unui cont bancar in lista
    public void adaugaCont(ContBancar cont){
        conturi.add(cont);
    }

    //Metoda pentru obtinerea listei de conturi bancare
    public List<ContBancar> getConturi(){
        return conturi;
    }
}
