/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import dataElements.*;
import GUI.*;
/**
 *
 * @author Charles
 */
public class ProjetBDDHopital {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ProjetBDDHopital Projet = new ProjetBDDHopital();
        //Projet.basicInterface();
        Projet.standardInterface();
    }
    
    public static void standardInterface(){
        // lance module de login : à faire requete avec les champs 
        // lance le menu et se ferme (ça c'est dans GUI_login)
        //si ça marche pas ou pour faire des tests changer les commentaire de place en dessous 
        //GUI_Hospital ghosto = new GUI_Hospital();
        //ghosto.setVisible(true);
        GUI_login glog = new GUI_login();
        glog.setVisible(true);
    }
    
    public static void basicInterface(){
        System.out.println("Test requêtes : ");
        //DataElement element = new Chambre("ARG",104,65,2);
        //DataElement element = new Employe(27,"Bernard","Charles","12 rue de la fistiniere","0665150566");
        //DataElement element = new Docteur(27,"Bernard","Charles","12 rue de la coloscopie","0665150566","Proctologie");
        //DataElement element = new Infirmier(27,"Bernard","Charles","12 rue de la coloscopie","0665150566","PRO","Jour",2453.41);
        //DataElement element = new Malade(27,"Bernard","Charles","12 rue de la coloscopie","0665150566","Maif");
        //DataElement element = new Hospitalisation(27,"PRO",143,4);
        //DataElement element = new Service("PRO","Proctologie","P",42);
        //DataElement element = new Soigne(24,97);
        //System.out.println(element.getAddRequest());
    }
}
