/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab6;

import java.util.*;
/**
 *
 * @author carlo
 */
public class Persona {
    
    private String nombre, apellido, correo, pais, contraseña;
    private Date fecha;
    private int numero_telefonico;
    private ArrayList<Mensaje> Spam = new ArrayList();
    private ArrayList<Mensaje> Borradores = new ArrayList();
    private ArrayList<Mensaje> Enviados = new ArrayList();
    private ArrayList<Mensaje> Eliminados = new ArrayList();
    private ArrayList<Mensaje> Importantes = new ArrayList();
    private ArrayList<Mensaje> leidos = new ArrayList();
    private ArrayList<Mensaje> Noleidos = new ArrayList();
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, String pais, String contraseña, Date fecha, int numero_telefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pais = pais;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.numero_telefonico = numero_telefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(int numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public ArrayList<Mensaje> getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList<Mensaje> leidos) {
        this.leidos = leidos;
    }

    public ArrayList<Mensaje> getNoleidos() {
        return Noleidos;
    }

    public void setNoleidos(ArrayList<Mensaje> Noleidos) {
        this.Noleidos = Noleidos;
    }

    public ArrayList<Mensaje> getSpam() {
        return Spam;
    }

    public void setSpam(ArrayList<Mensaje> Spam) {
        this.Spam = Spam;
    }

    public ArrayList<Mensaje> getBorradores() {
        return Borradores;
    }

    public void setBorradores(ArrayList<Mensaje> Borradores) {
        this.Borradores = Borradores;
    }

    public ArrayList<Mensaje> getEnviados() {
        return Enviados;
    }

    public void setEnviados(ArrayList<Mensaje> Enviados) {
        this.Enviados = Enviados;
    }

    public ArrayList<Mensaje> getEliminados() {
        return Eliminados;
    }

    public void setEliminados(ArrayList<Mensaje> Eliminados) {
        this.Eliminados = Eliminados;
    }

    public ArrayList<Mensaje> getImportantes() {
        return Importantes;
    }

    public void setImportantes(ArrayList<Mensaje> Importantes) {
        this.Importantes = Importantes;
    }

    
    
    
    
}
