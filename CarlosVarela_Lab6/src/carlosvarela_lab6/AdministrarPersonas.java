/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab6;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author carlo
 */
public class AdministrarPersonas {
    
    private ArrayList<Persona> personas = new ArrayList();
    private File Archivo;
    
    public AdministrarPersonas(){
    
    }
    
    public AdministrarPersonas(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> lista) {
        this.personas = lista;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    //Extra Mutador
    public void setPersonas(Persona persona){
        personas.add(persona);
    }
    
    //Metodos de administracion
    
    public void crearCarpeta(String n) throws IOException{
        FileWriter fw;
        BufferedWriter bw;
        //Crea directorio
        File archivo = new File("./usuarios/"+n);
        archivo.mkdir();
        //Creando archivos
        fw = new FileWriter("./usuarios/"+n+"/"+"Leidos"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Noleidos"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Spam"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Eliminados"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Enviados"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Importantes"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw = new FileWriter("./usuarios/"+n+"/"+"Borradores"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        fw.close();
        bw.close();
    }
    
    public void escribirEnviados(String descripcion, String destinatario, Persona usuario) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File ("./usuarios/"+usuario.getNombre()+"/"+"Enviados"+".txt"); //Tener el archivo
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write(destinatario+";");
            bw.write(descripcion+";\n");
            bw.flush();
        } catch (Exception e) {
        }
        fw.close();
        bw.close();
    }
    
    public void escribirNoleidos(String descripcion, String mando, Persona usuario) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File ("./usuarios/"+usuario.getNombre()+"/"+"Noleidos"+".txt"); //Tener el archivo
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write(mando+";");
            bw.write(descripcion+";\n");
            bw.flush();
        } catch (Exception e) {
        }
        fw.close();
        bw.close();
    }
}
