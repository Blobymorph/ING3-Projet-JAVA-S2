/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDD;
import projet.bdd.hopital.dataElements.*;

/**
 *
 * @author Charles
 */

public class Connexion {
    public String createAddElementRequest(DataElement Element){
        return Element.getAddRequest();
    }
}