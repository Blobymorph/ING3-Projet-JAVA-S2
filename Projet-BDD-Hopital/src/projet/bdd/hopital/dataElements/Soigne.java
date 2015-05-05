/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.bdd.hopital.dataElements;

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
    Soigne(int num_doc,int num_malad){
    numero_docteur = num_doc;
    numero_malade = num_malad;
    this.ElementType = "Soigne";
    }
    //Methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNumero_docteur()) + ',';
        Request += Integer.toString(getNumero_malade()) + ',';
        Request += ")";
        return Request;
    }
}
