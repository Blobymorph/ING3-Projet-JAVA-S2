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
   
    private int code_service;
    private String rotation;

    public int getCode_service() {
        return code_service;
    }

    public void setCode_service(int code_service) {
        this.code_service = code_service;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }
    //construcor
    Infirmier(int nume)
    {
    super(nume);
   this.ElementType = "Infirmier";
    }
    
}
