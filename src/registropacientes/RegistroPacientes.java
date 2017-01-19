/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropacientes;

import historialclinico.HistorialClinico;
import historialclinico.Medico;
import historialclinico.Paciente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo OEtec
 */
public class RegistroPacientes {
    
    
public static List<Paciente> listap=new LinkedList<Paciente>();  
public static List<Medico> listam=new LinkedList<Medico>();  


    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        listap.add(new Paciente(32,"peres",12,"femenino"));
        
        int opt=0;
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos al Menu \n"
                    + "1.- GESTIONAR PACIENTE \n"
                    + "2.- GESTIONAR MEDICOS \n"
                    + "3.- GESTIONAR HISTORIAL CLINICO \n"
                    + "4.- Salir"));
            switch(opt){
                case 1: paciente();break;
                case 2: medicos();break;
                case 3: historial();break;
                case 4: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
    }

    private static void paciente() {
        // TODO code application logic here
        
        int opt=0;
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog("....Menu..Paciente....\n"
                    + "1 -Registrar- -Paciente-\n"
                    + "2 -Mostrar- -Paciente-\n"
                    + "3 -Modificar- -Paciente-\n"
                    + "4 -Eliminar- -Paciente-\n"
                    + "5 -Atras-"));
            switch(opt){
                case 1: registrarp();break;
                case 2: mostrarp();break;
                case 3: modificarp();break;
                case 4: eliminarp();break;
                case 5: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
    }

    private static void medicos() {
        // TODO code application logic here
        
        int opt=0;
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog("....Menu..Medicos....\n"
                    + "1 -Registrar- -Medicos-\n"
                    + "2 -Mostrar- -Medicos-\n"
                    + "3 -modificar- -Pacientes-\n"
                    + "4 -Eliminar- -Medicos-\n"
                    + "5 -Atras-"));
            switch(opt){
                case 1: registrarm();break;
                case 2: mostrarm();break;
                case 3: modificarm();break;
                case 4: eliminarm();break;
                case 5: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
    }

    private static void historial() {
        // TODO code application logic here
        
        int opt=0;
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog("....Menu..Historial....\n"
                    + "1 -Registrar- -Historial- \n"
                    + "2 -Mostrar- -Historial- \n"
                    + "3 -modificar- -Historial-\n"
                    + "4 -Eliminar- -Historial-\n"
                    + "5 -Atras-"));
            switch(opt){
                case 1: registrarh();break;
                case 2: mostrarh();break;
                case 3: modificarh();break;
                case 4: eliminarh();break;
                case 5: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
    }

    private static void registrarp() {
        int ide=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Identificacion: "));
        String nom=JOptionPane.showInputDialog("Ingrese Nombre: ");
        int eda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad: "));
        String gen=JOptionPane.showInputDialog("Ingrese Genero: ");

        listap.add(new Paciente(ide,nom,eda,gen));
        
    }

    private static void mostrarp() {
        //insercion();
        for(int i=0;i<listap.size();i++){
            listap.get(i).verPaciente();
        }
        System.out.println("paciente"+listap);
        
    }

    private static void modificarp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void eliminarp() {
      int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Paciente a ELIMINAR: "));
      listap.remove(elemento);
      mostrarp();
    }

    private static void registrarm() {
        String ide2=JOptionPane.showInputDialog("Ingrese Identificacion: ");
        String nom2=JOptionPane.showInputDialog("Ingrese Nombre: ");
        String apw2=JOptionPane.showInputDialog("Ingrese Apellido: ");
        String esp2=JOptionPane.showInputDialog("Ingrese Especialidad: ");

        listam.add(new Medico(ide2,nom2,apw2,esp2));
        
    }

    private static void mostrarm() {
        
        for(int i=0;i<listam.size();i++){
            listam.get(i).verMedico();
        }
        System.out.println("Medico: "+listam);
    }

    private static void modificarm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void eliminarm() {
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminar"));
      listam.remove(elemento);
      mostrarm();
    }
}

   
    
