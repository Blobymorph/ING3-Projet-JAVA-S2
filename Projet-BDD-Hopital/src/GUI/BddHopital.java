/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BDD.*;
/**
 *
 * @author Axel
 */
public class BddHopital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // lance module de login : à faire requete avec les champs 
        // lance le menu et se ferme (ça c'est dans GUI_login)
        //si ça marche pas ou pour faire des tests changer les commentaire de place en dessous 
        GUI_Hospital ghosto = new GUI_Hospital();
        ghosto.setVisible(true);
        //GUI_login glog = new GUI_login();
        //glog.setVisible(true);
        
    }
    
}
