
package model;


//E X A M E N !

public class Direccion {
    
    private String calle;
    private String colonia;
    private String municipio;

    public Direccion() {
    }
    /**
     * Este constructor sirve para crear un direccion
     * @param calle El primer parametro es el valor de la calle
     * @param colonia El segundo parametro es el valor de la colonia
     * @param municipio Este parametro es el valor del municipio
     */

    public Direccion(String calle, String colonia, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
    }
    
    
    // MUTACION

    /**
     * @return Este metodo te regresa el valor que tiene el atributo calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle En este metodo debes de poner dentro del parentesis el valor que quieras o que desees que tenga
     * la calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
  
}