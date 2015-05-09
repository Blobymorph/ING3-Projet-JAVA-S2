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
public class Malade extends DataElement {
    //specific data
    private int numero_malade;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String mutuelle;

    public int getNumero_malade() {
        return numero_malade;
    }

    public void setNumero_malade(int numero_malade) {
        this.numero_malade = numero_malade;
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

    public String getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }
    //Constructor
    public Malade(int numero_malade)
    {
        this.numero_malade = numero_malade;
    }
    public Malade(int num,String nom,String prenom,String adresse,String tel,String mutuelle){
        this.numero_malade = numero_malade;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.mutuelle = mutuelle;
    }
    //Methods
    @Override
    public String getAddRequest(){
        String Request = "insert into malade values ";
        Request += "('";
        Request += Integer.toString(getNumero_malade()) + "','";
        Request += getNom() + "','";
        Request += getPrenom() + "','";
        Request += getTel() + "','";
        Request += getAdresse() + "','";
        Request += getMutuelle();
        Request += "');";
        return Request;
    }
}
