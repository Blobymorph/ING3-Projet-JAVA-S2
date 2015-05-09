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
public class Infirmier extends Employe {
   
    private String code_service;
    private String rotation;
    private double salaire;

    public String getCode_service() {
        return code_service;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setCode_service(String code_service) {
        this.code_service = code_service;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }
    //construcor
    public Infirmier(int num)
    {
        super(num);
    }
    
    public Infirmier(int num, String nom, String prenom, String adresse, String tel,String code_service,String rotation,double salaire)
    {
        super(num,nom,prenom,adresse,tel);
        this.code_service = code_service;
        this.rotation = rotation;
        this.salaire = salaire;
    }
    //methods
    @Override
    public String getAddRequest(){
        String Request = "insert into infirmier values ";
        Request += "(";
        Request += Integer.toString(getNum_employe()) + ",'";
        Request += getNom() + "','";
        Request += getPrenom() + "','";
        Request += getTel() + "','";
        Request += getAdresse() + "','";
        Request += getCode_service() + "','";
        Request += getRotation() + "',";
        Request += Double.toString(getSalaire());
        Request += ");";
        return Request;
    }
}
