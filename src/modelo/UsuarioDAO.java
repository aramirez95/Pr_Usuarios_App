
package modelo;
import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andresramirezamaya
 */
public class UsuarioDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        String sql="Select * from usuarios";
        List<Usuario> lista = new ArrayList<>();
        
        try{
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setEmail(rs.getString(3));
                usuario.setClave(rs.getString(4));
                usuario.setTipoUsuario(rs.getInt(5));
                usuario.setAreas(rs.getInt(6));
                usuario.setEstado(rs.getInt(7));
                lista.add(usuario);
            }
            
            
        }catch(SQLException e){
            System.out.println("Error al generar lista: " + e);
        }
        
        return lista;
        
    }//Fin Listar
    
    //Metodo Agregar
    public void Agregar(Usuario usuario){
        String sql = "Insert Into SENA.usuarios (Nombres, Email, Clave, Tipo_Usuario, Areas, Estado) Values (?,?,?,?,?,?)";
        try{
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getClave());
            ps.setInt(4, usuario.getTipoUsuario());
            ps.setInt(5, usuario.getAreas());
            ps.setInt(6, usuario.getEstado());
            ps.executeUpdate();

        }catch(SQLException e){
            System.out.println("Error al Crear Registro de Usuario " + e);
        }
        
    }//fin Agregar
    
    //Metodo Actualizar
    public void Actualizar(Usuario usuario){
        String sql = "Update SENA.usuarios set Nombres=?, Email=?, Clave=?, Tipo_Usuario=?, Areas=?, Estado=? where ID_Usuario=?";
        try{
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getClave());
            ps.setInt(4, usuario.getTipoUsuario());
            ps.setInt(5, usuario.getAreas());
            ps.setInt(6, usuario.getEstado());
            ps.setInt(7, usuario.getIdUsuario());
            ps.executeUpdate();

        }catch(SQLException e){
            System.out.println("Error al Actualizar Registro de Usuario " + e);
        }
        
    }//fin Actualizar
    
    //Metodo Borrar
    public void Borrar(int id){
        String sql = "delete from SENA.usuarios where ID_Usuario=" + id;
        try{
            con = conexion.ConectarBaseDeDatos();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        }catch(SQLException e){
            System.out.println("Error al Actualizar Registro de Usuario " + e);
        }
        
    }//fin Borrar
}
