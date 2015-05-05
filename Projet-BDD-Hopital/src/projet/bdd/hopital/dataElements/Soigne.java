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
    //Constructor
    Soigne(int num_doc,int num_malad){
    numero_docteur = num_doc;
    numero_malade = num_malad;
    }
    //Methods
    
}
