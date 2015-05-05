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

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    //constructor
    Employe(int num)
    {
   num_employe = num;
   this.ElementType = "Employe";
    }
    
    //methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNum_employe()) + ',';
        Request += getNom() + ',';
        Request += getPrenom() + ',';
        Request += getTel() + ',';
        Request += getAdresse() + ',';
        Request += Double.toString(getSalaire()) + ',';
        Request += ")";
        return Request;
    }
}
