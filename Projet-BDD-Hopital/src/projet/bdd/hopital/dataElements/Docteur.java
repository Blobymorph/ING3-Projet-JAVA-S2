/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.bdd.hopital.dataElements;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author thibault
 */
public class Docteur extends Employe {
    
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    //constructor
    Docteur(int num)
    {
        super(num);
    }
    public Docteur(int num, String specialite){
        super(num);
        this.specialite = specialite;
    }
    
    public Docteur(int num, String nom, String prenom, String adresse, String tel, String specialite){
        super(num,nom,prenom,adresse,tel);
        this.specialite = specialite;
    }
    
    public Docteur(String donnee)
     {
        super(donnee);
        List<String> donneeList = Arrays.asList(donnee.split(","));
        int pb = Integer.parseInt( donneeList.get(0));
        this.nom = donneeList.get(1);
        this.prenom = donneeList.get(2);
        this.tel = donneeList.get(3);
        this.adresse = donneeList.get(4);
        this.specialite = donneeList.get(5);
    }

    
    //methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNum_employe()) + ",'";
        Request += getNom() + "','";
        Request += getPrenom() + "','";
        Request += getTel() + "','";
        Request += getAdresse() + "','";
        Request += getSpecialite();
        Request += "');";
        return Request;
    }
}
