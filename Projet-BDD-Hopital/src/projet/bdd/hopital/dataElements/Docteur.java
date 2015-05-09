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
    
    //methods
    @Override
    public String getAddRequest(){
        String Request = "insert into docteur values ";
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
