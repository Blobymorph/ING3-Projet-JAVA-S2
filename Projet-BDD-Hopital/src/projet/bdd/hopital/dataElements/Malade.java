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
    public Malade(int num)
    {
        numero_malade = num;
    }
    public Malade(String donnee)
    {   
    List<String> donneeList = Arrays.asList(donnee.split(","));
        this.numero_malade = Integer.parseInt( donneeList.get(0));
        this.nom = donneeList.get(1);
        this.prenom = donneeList.get(2);
        this.tel = donneeList.get(3);
        this.tel = donneeList.get(4);
        this.mutuelle = donneeList.get(5);
    }

    //Methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNumero_malade()) + ',';
        Request += getNom() + ',';
        Request += getPrenom() + ',';
        Request += getTel() + ',';
        Request += getAdresse() + ',';
        Request += getMutuelle();
        Request += ");";
        return Request;
    }
}
