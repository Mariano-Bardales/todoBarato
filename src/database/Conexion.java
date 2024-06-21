package database;
//importar paquetes

import java.sql.Connection; //el paquete para conectar mysql con java
import java.sql.DriverManager;
import java.sql.SQLException; //clase de java para hacer excepciones de errores
import javax.swing.JOptionPane;

public class Conexion {

    //variable globales
    private final String DRIVER = "com.mysql.cj.jdbc.Driver"; //com.mysql.cj.jdbc.Driver
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "todobarato";
    private final String USER = "root";
    private final String PASSWORD = "";

    //variable propia de java
    public Connection cadena;
    public static Conexion instancia;
    
    //constructor
    public Conexion() {
        this.cadena=null;
    }
    

    //método tipo público
    public Connection conectar() {
        try {
            Class.forName(DRIVER);
            this.cadena=DriverManager.getConnection(URL+DB,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    //método para desconectar: método cuando termine la consulta  sql se termine la conexión
    public void desconectar(){
    
        try{
            //close es una palabra reservada de java
        this.cadena.close();
        }catch(SQLException e){
       JOptionPane.showMessageDialog(null, e.getMessage());
       // JOption: interfaces gráficas de java  //showMessageDialog : ventana emergente de java 
        }
    }
    
    //método conexión  en tiempo real
    
    public synchronized static Conexion getInstancia(){
        //synchronized - sincronizar  la bd en tiempo real
    if(instancia==null){
    instancia= new Conexion();
    }
    return instancia;
    }
    

}
