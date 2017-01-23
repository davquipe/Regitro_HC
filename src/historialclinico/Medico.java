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
public class Medico {
    
    private int identificacion;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Medico(int identificacion, String nombre, String apellidos, String especialidad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }

   
    
    public void verMedico(){
        JOptionPane.showMessageDialog(null,"Identificacion: "+identificacion+"\n Nombre: "+nombre+" "
                + "\n Apellidos: "+apellidos+"\n Especialidad: "+especialidad);
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    

    
    
    
    
}
