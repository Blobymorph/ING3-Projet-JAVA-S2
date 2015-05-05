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
public class Hospitalisation extends DataElement {
  //specific data
    private int numero_malade;
    private int code_service;
    private int numero_chambre;
    private int num_lit;
    //Constructor
    Hospitalisation(int num_mal,int code, int numero_ch)
    {
    numero_malade= num_mal;
    code_service = code;
    numero_chambre= numero_ch;
        
    }
    //Methods
}
