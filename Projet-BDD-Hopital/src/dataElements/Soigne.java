/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataElements;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author thibault
 */
public class Soigne extends DataElement {
    //specific data
    private int numero_docteur;
    private int numero_malade;

    public int getNumero_docteur() {
        return numero_docteur;
    }

    public void setNumero_docteur(int numero_docteur) {
        this.numero_docteur = numero_docteur;
    }

    public int getNumero_malade() {
        return numero_malade;
    }

    public void setNumero_malade(int numero_malade) {
        this.numero_malade = numero_malade;
    }
    //Constructor
    public Soigne(int num_doc,int num_malad){
        numero_docteur = num_doc;
        numero_malade = num_malad;
    }
    public Soigne(String donnee){  
        List<String> donneeList = Arrays.asList(donnee.split(","));
        this.numero_docteur = Integer.parseInt( donneeList.get(0));
        this.numero_malade = Integer.parseInt( donneeList.get(1));
    }
    //Methods
    @Override
    public String getAddRequest(){
        String Request = "insert into soigne values ";
        Request += "(";
        Request += Integer.toString(getNumero_docteur()) + ',';
        Request += Integer.toString(getNumero_malade());
        Request += ");";
        return Request;
    }
}
