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

///--- GENERIC ELEMENT OF DATABASE ---///
public class DataElement {
    protected String ElementType;
    public String getElementType(){return ElementType;}

    public String getAddRequest(String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}