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
public class Infirmier extends Employe {
   
    private int code_service;
    private String rotation;
    //construcor
    Infirmier(int nume)
    {
    super(nume);
   
    }
    
}
