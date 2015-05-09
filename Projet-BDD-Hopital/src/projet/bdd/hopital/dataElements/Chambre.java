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
 * @author Charles
 */
public class Chambre extends DataElement {
    //specific data
private int numero_chambre;
private String code_service;
private int num_surveillant;
private int nombre_lits;

    public int getNumero_chambre() {
        return numero_chambre;
    }

    public void setNumero_chambre(int numero_chambre) {
        this.numero_chambre = numero_chambre;
    }

    public String getCode_service() {
        return code_service;
    }

    public void setCode_service(String code_service) {
        this.code_service = code_service;
    }

    public int getSurveillant() {
        return num_surveillant;
    }

    public void setSurveillant(int surveillant) {
        this.num_surveillant = surveillant;
    }

    public int getNombre_lits() {
        return nombre_lits;
    }

    public void setNombre_lits(int nombre_lits) {
        this.nombre_lits = nombre_lits;
    }
  
    //Constructor
    public Chambre(String code_service,int numero_chambre,int num_surveillant,int nombre_lits){
        this.code_service = code_service;
        this.numero_chambre = numero_chambre;
        this.num_surveillant = num_surveillant;
        this.nombre_lits = nombre_lits;
    }
    
    public Chambre(int numero_chambre){
        this.numero_chambre = numero_chambre;
    }
    
    public Chambre(String donnee)
    {
    List<String> donneeList = Arrays.asList(donnee.split(","));
        this.code_service =donneeList.get(0);
        this.numero_chambre = Integer.parseInt( donneeList.get(1));
        this.num_surveillant = Integer.parseInt( donneeList.get(2));
        this.nombre_lits = Integer.parseInt( donneeList.get(3));
    }

    //Methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table + " values ";
        Request += "('";
        Request += getCode_service() + "',";
        Request += Integer.toString(getNumero_chambre()) + ',';
        Request += Integer.toString(getSurveillant()) + ',';
        Request += Integer.toString(getNombre_lits());
        Request += ")";
        return Request;
    }
}
