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
public class Hospitalisation extends DataElement {
  //specific data
    private int numero_malade;
    private int code_service;
    private int numero_chambre;
    private int num_lit;

    public int getNumero_malade() {
        return numero_malade;
    }

    public void setNumero_malade(int numero_malade) {
        this.numero_malade = numero_malade;
    }

    public int getCode_service() {
        return code_service;
    }

    public void setCode_service(int code_service) {
        this.code_service = code_service;
    }

    public int getNumero_chambre() {
        return numero_chambre;
    }

    public void setNumero_chambre(int numero_chambre) {
        this.numero_chambre = numero_chambre;
    }

    public int getNum_lit() {
        return num_lit;
    }

    public void setNum_lit(int num_lit) {
        this.num_lit = num_lit;
    }
    //Constructor
    Hospitalisation(int num_mal,int code, int numero_ch)
    {
    numero_malade= num_mal;
    code_service = code;
    numero_chambre= numero_ch;
    }
    //Methods
    @Override
    public String getAddRequest(String Table){
        String Request = "insert into " + Table;
        Request += "(";
        Request += Integer.toString(getNumero_malade()) + ',';
        Request += Integer.toString(getCode_service()) + ',';
        Request += Integer.toString(getNumero_chambre()) + ',';
        Request += Integer.toString(getNum_lit());
        Request += ");";
        return Request;
    }
}
