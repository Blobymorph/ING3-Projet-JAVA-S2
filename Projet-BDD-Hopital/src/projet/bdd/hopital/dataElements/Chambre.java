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
public class Chambre extends DataElement {
    //specific data
private int numero_chambre;
private int code_service;
private String surveillant;
private int nombre_lits;

    public int getNumero_chambre() {
        return numero_chambre;
    }

    public void setNumero_chambre(int numero_chambre) {
        this.numero_chambre = numero_chambre;
    }

    public int getCode_service() {
        return code_service;
    }

    public void setCode_service(int code_service) {
        this.code_service = code_service;
    }

    public String getSurveillant() {
        return surveillant;
    }

    public void setSurveillant(String surveillant) {
        this.surveillant = surveillant;
    }

    public int getNombre_lits() {
        return nombre_lits;
    }

    public void setNombre_lits(int nombre_lits) {
        this.nombre_lits = nombre_lits;
    }
  
    //Constructor
    Chambre(int nume){
    numero_chambre = nume;
    }
    //Methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNumero_chambre()) + ',';
        Request += Integer.toString(getCode_service()) + ',';
        Request += getCode_service() + ',';
        Request += Integer.toString(getNombre_lits());
        Request += ")";
        return Request;
    }
}
