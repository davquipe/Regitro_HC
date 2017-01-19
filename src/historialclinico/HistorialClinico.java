/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historialclinico;

import java.util.Date;
import javax.swing.JOptionPane;




/**
 *
 * @author Grupo OEtec
 */
public class HistorialClinico {
    
    private int codigo;
    private Date fecha;
    private String idPaciente;
    private String idMedico;
    private String observasiones;

    public HistorialClinico(int codigo, Date fecha, String idPaciente, String idMedico, String observasiones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observasiones = observasiones;
    }
    
    
    
    
    public void verHistorialClinico(){
        JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n Fecha: "+fecha+" "
                + "\n idPaciente: "+idPaciente+"\n observacion: "+observasiones);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getObservasiones() {
        return observasiones;
    }

    public void setObservasiones(String observasiones) {
        this.observasiones = observasiones;
    }
    
    
}
