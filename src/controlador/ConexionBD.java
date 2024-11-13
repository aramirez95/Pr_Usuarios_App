package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;

/**
 * @author andresramirezamaya
 */

public class ConexionBD {

    Connection con;
    String bd = "SENA";
    String url = "jdbc:mysql://localhost:3306/" + bd + "?useUnicode=true&use" + "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + "serverTimezone=UTC";
    String usuario = "root";
    String pwd = "Camila.95";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    //metodo
    public Connection ConectarBaseDeDatos(){
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, usuario, pwd);
            System.out.println("Conexion establecida con exito con la base de datos: " + bd);
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("No se logro establecer comunicacion con la base de datos: " + bd);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void main(String[]args){
        ConexionBD conexion = new ConexionBD();
        conexion.ConectarBaseDeDatos();
    }

}
