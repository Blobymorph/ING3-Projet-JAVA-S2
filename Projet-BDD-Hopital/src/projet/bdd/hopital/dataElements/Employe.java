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

    public int getNum_employe() {
        return num_employe;
    }

    public void setNum_employe(int num_employe) {
        this.num_employe = num_employe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    //constructor
    public Employe(int num_employe)
    {
        this.num_employe = num_employe;
    }
    
    public Employe(int num_employe, String nom, String prenom, String adresse, String tel)
    {
        this.num_employe = num_employe;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
    }
    //methods
    @Override
    public String getAddRequest(){
        String Request = "insert into employe values ";
        Request += "(";
        Request += Integer.toString(getNum_employe()) + ",'";
        Request += getNom() + "','";
        Request += getPrenom() + "','";
        Request += getTel() + "','";
        Request += getAdresse();
        Request += "');";
        return Request;
    }
}
