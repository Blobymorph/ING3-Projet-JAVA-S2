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
public class Employe extends DataElement {
    private int num_employe;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String adresse;
    protected double salaire;
    //constructor
    Employe(int num)
    {
   num_employe = num;
    }
    
}
