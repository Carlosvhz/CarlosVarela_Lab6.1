/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab6;

/**
 *
 * @author carlo
 */
public class Mensaje {
    
    private String descripcion, emisor;

    public Mensaje() {
    }

    public Mensaje(String descripcion, String emisor) {
        this.descripcion = descripcion;
        this.emisor = emisor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }
    
    
}
