/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.bdd.hopital;
import projet.bdd.hopital.dataElements.*;

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
        ProjetBDDHopital.basicInterface();
    }
    
    public static void basicInterface(){
        System.out.println("Test requêtes : ");
        //DataElement element = new Chambre("ARG",104,65,2);
        //DataElement element = new Employe(27,"Bernard","Charles","12 rue de la bite","0665150566");
        DataElement element = 
        System.out.println(element.getAddRequest("Aucune Table"));
    }
}
