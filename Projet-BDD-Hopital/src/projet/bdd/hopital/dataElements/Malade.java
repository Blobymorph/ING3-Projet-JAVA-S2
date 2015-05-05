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
public class Malade extends DataElement {
    //specific data
    private int numero_malade;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String mutuelle;
    //Constructor
    Malade(int num)
    {
    numero_malade = num;
    
    }
    //Methods
}
