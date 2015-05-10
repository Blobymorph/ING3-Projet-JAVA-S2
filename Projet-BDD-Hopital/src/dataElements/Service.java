/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataElements;

/**
 *
 * @author Charles
 */
public class Service extends DataElement {
    //specific data
    private String code_service;
    private String nom;
    private String batiment;
    private int directeur;

    public String getCode_service() {
        return code_service;
    }

    public void setCode_service(String code_service) {
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

    public int getDirecteur() {
        return directeur;
    }

    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }
    //Constructor
    public Service(String code_service)
    {
        this.code_service = code_service;
    }
    public Service(String code_service,String nom,String batiment,int directeur){
        this.code_service = code_service;
        this.nom = nom;
        this.batiment = batiment;
        this.directeur = directeur;
    }
    //Methods
    @Override
    public String getAddRequest(){
        String Request = "insert into service values ";
        Request += "('";
        Request += getCode_service() + "','";
        Request += getNom() + "','";
        Request += getBatiment() + "',";
        Request += Integer.toString(getDirecteur());
        Request += ");";
        return Request;
    }
}
