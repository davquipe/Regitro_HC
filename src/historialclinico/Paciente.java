/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historialclinico;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo OEtec
 */
public class Paciente {
    
    private int identificacion;
    private String nombre;
    private int edad;
    private String genero;

    public Paciente(int identificacion, String nombre, int edad, String genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Paciente(String ide, String nom, int eda, int gen) {
        JOptionPane.showMessageDialog(null,"Identificacion: "+identificacion+"\n Nombre: "+nombre+" "
                + "\n Edad: "+edad+"\n Genero: "+genero);
    }    

    public Paciente(int codigo, String idpaciente, String idmedico, String observaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    public void verPaciente(){
        JOptionPane.showMessageDialog(null,"Identificacion: "+identificacion+"\n Nombre: "+nombre+" "
                + "\n Edad: "+edad+"\n Genero: "+genero);
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    
}
