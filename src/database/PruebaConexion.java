/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion();
        con.conectar();
        if(con.cadena!=null){
            JOptionPane.showMessageDialog(null, "Conectado");
        }else{
            JOptionPane.showMessageDialog(null, "Desconectado");
        }
    }
    
}
