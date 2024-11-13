
package controlador;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.Interfaz;

/**
 * @author andresramirezamaya
 */
public class ControladorUsuario implements ActionListener {
    
    private int idUsuario;
    private String nombre;
    private String email;
    private String clave;
    private int tipoUs;
    private int area;
    private int estado;
    
    //Lista de Variables Globales
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Interfaz vista = new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    
    
    public ControladorUsuario(Interfaz _vista){
        this.vista = _vista;
        vista.setVisible(true);
        
        AgregarEventos();
        listarTabla();
        
    }
    
    private void AgregarEventos(){
        //Activa acciones onclick
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
        vista.getTblUsuarios().addMouseListener(new MouseAdapter(){
            //crear metodo
            public void mouseClicked(MouseEvent e){
                llenarCampos(e);
            }
        });
    }
    
    private void listarTabla(){
        String[] titulos = new String[] {"Id_Usuario","Nombre","Email","Clave","Id_Tipo_Usuario","Id_Area","Id_Estado"};
        modeloTabla = new DefaultTableModel(titulos, 0);
        List<Usuario> listaUsuarios = usuarioDAO.listar();
        
        for(Usuario usuario : listaUsuarios){
            modeloTabla.addRow(new Object[]{
                usuario.getIdUsuario(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getClave(),
                usuario.getTipoUsuario(),
                usuario.getAreas(),
                usuario.getEstado()
                
            });
        }
        
        vista.getTblUsuarios().setModel(modeloTabla);
        vista.getTblUsuarios().setPreferredSize(new Dimension(350, modeloTabla.getRowCount() * 16));
    }
    
    private void llenarCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        idUsuario = (int) vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 0);
        vista.getTxtNombre().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTxtCorreo().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTxtClave().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 3).toString());
        vista.getLstTipoUs().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 4).toString());
        vista.getLstAreas().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 5).toString());
        vista.getLstEstado().setText(vista.getTblUsuarios().getModel().getValueAt(target.getSelectedRow(), 6).toString());
    }
    
    //Validar Campos Vacios
    private boolean validarDatos(){
        if("".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtCorreo().getText()) || "".equals(vista.getTxtClave().getText())){
            JOptionPane.showMessageDialog(null, "Los Campos no pueden quedar vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    //Valida el tipo de los campos
    private boolean cargarDatos(){
        try{
            nombre = vista.getTxtNombre().getText();
            email = vista.getTxtCorreo().getText();
            clave = vista.getTxtClave().getText();
            tipoUs = Integer.parseInt(vista.getLstTipoUs().getText());
            area = Integer.parseInt(vista.getLstAreas().getText());
            estado = Integer.parseInt(vista.getLstEstado().getText());
            return true;
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Los Campos Tipo Usuario, Area y Estado deben ser Numericos", "Error", JOptionPane.ERROR);
            System.out.println("Error al registrar el Usuario: " + e);
            return false;
        }
    }
    
    //Limpiar Campos
    private void limpiarCampos(){
        vista.getTxtNombre().setText("");
        vista.getTxtCorreo().setText("");
        vista.getTxtClave().setText("");
        vista.getLstTipoUs().setText("");
        vista.getLstAreas().setText("");
        vista.getLstEstado().setText("");
        idUsuario = 0;
        nombre = "";
        email = "";
        clave = "";
        tipoUs = 0;
        area = 0;
        estado = 0;
    }
    
    //Crear Usuario
    private void agregarUsuario(){
        try{
            if(validarDatos()){
                if(cargarDatos()){
                    Usuario usuario = new Usuario(nombre,email,clave,tipoUs,area,estado);
                    usuarioDAO.Agregar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Existosamente");
                    limpiarCampos();
                }
            }
        }catch (HeadlessException e){
            System.out.println("Error al registrar el Usuario");
        } finally {
            listarTabla();
        }
    }
    
    //Actualizar Usuario
    private void actualizarUsuario(){
        try{
            if(validarDatos()){
                if(cargarDatos()){
                    Usuario usuario = new Usuario(idUsuario,nombre,email,clave,tipoUs,area,estado);
                    usuarioDAO.Actualizar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario Actualizado Existosamente");
                    limpiarCampos();
                }
            }
        }catch (HeadlessException e){
            System.out.println("Error al actualizar el Usuario");
        } finally {
            listarTabla();
        }
    }
    
    //Borrar Usuario
    private void borrarUsuario(){
        try{
            if(idUsuario != 0){
     
                    usuarioDAO.Borrar(idUsuario);
                    JOptionPane.showMessageDialog(null, "Usuario Borrado Existosamente");
                    limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione el usaurio a borrar");
                limpiarCampos();
            }

        }catch (HeadlessException e){
            System.out.println("Error al actualizar el Usuario");
        } finally {
            listarTabla();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        if(ae.getSource() == vista.getBtnAgregar()){
            agregarUsuario();
        }
        if(ae.getSource() == vista.getBtnActualizar()){
            actualizarUsuario();
        }
        if(ae.getSource() == vista.getBtnBorrar()){
            borrarUsuario();
        }
        if(ae.getSource() == vista.getBtnLimpiar()){
            limpiarCampos();
        }
    }
    
    
}
