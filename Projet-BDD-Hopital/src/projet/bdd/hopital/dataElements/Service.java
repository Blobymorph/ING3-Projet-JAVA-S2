/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.bdd.hopital.dataElements;

/**
 *
 * @author Charles
 */
public class Service extends DataElement {
    //specific data
    private int code_service;
    private String nom;
    private String batiment;
    private String directeur;

    public int getCode_service() {
        return code_service;
    }

    public void setCode_service(int code_service) {
        this.code_service = code_service;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getDirecteur() {
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }
    //Constructor
    Service(int code)
    {
    code_service = code;
    this.ElementType = "Service";
    }
    //Methods
    
    
}
