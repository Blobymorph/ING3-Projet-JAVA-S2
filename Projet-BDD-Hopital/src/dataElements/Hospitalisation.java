/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataElements;

/**
 *
 * @author thibault
 */
public class Hospitalisation extends DataElement {
  //specific data
    private int numero_malade;
    private String code_service;
    private int numero_chambre;
    private int num_lit;

    public int getNumero_malade() {
        return numero_malade;
    }

    public void setNumero_malade(int numero_malade) {
        this.numero_malade = numero_malade;
    }

    public String getCode_service() {
        return code_service;
    }

    public void setCode_service(String code_service) {
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
    public Hospitalisation(int num_mal,String code, int numero_ch)
    {
        numero_malade= num_mal;
        code_service = code;
        numero_chambre= numero_ch;
    }
    
    public Hospitalisation(int numero_malade,String code_service,int numero_chambre,int num_lit)
    {
        this.numero_malade = numero_malade;
        this.code_service = code_service;
        this.numero_chambre = numero_chambre;
        this.num_lit = num_lit;
    }
    //Methods
    @Override
    public String getAddRequest(){
        String Request = "insert into hospitalisation values ";
        Request += "(";
        Request += Integer.toString(getNumero_malade()) + ",'";
        Request += getCode_service() + "',";
        Request += Integer.toString(getNumero_chambre()) + ',';
        Request += Integer.toString(getNum_lit());
        Request += ");";
        return Request;
    }
}
