
package vista;

import controlador.ControladorUsuario;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 * @author andresramirezamaya
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNombre = new java.awt.TextField();
        TxtCorreo = new java.awt.TextField();
        TxtClave = new java.awt.TextField();
        BtnBorrar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        LstEstado = new java.awt.TextField();
        LstTipoUs = new java.awt.TextField();
        LstAreas = new java.awt.TextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Lista de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Nombre: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Area:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Clave:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 220, -1));

        TxtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 220, -1));

        TxtClave.setBackground(new java.awt.Color(255, 255, 255));
        TxtClave.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        getContentPane().add(TxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, -1));

        BtnBorrar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BtnBorrar.setText("Borrar");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 120, -1));

        BtnAgregar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BtnAgregar.setText("Crear");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 120, -1));

        BtnActualizar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 120, -1));

        BtnLimpiar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Manejo de Usuarios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        TblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TblUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 690, 120));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        LstEstado.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LstEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 220, -1));

        LstTipoUs.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LstTipoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 150, 220, -1));

        LstAreas.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LstAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarActionPerformed


    public static void main(String args[]) {
/*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });*/

        Interfaz vista = new Interfaz();
        ControladorUsuario controlador = new ControladorUsuario(vista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnLimpiar;
    private java.awt.TextField LstAreas;
    private java.awt.TextField LstEstado;
    private java.awt.TextField LstTipoUs;
    private javax.swing.JTable TblUsuarios;
    private java.awt.TextField TxtClave;
    private java.awt.TextField TxtCorreo;
    private java.awt.TextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnActualizar() {
        return BtnActualizar;
    }

    public JButton getBtnAgregar() {
        return BtnAgregar;
    }

    public JButton getBtnBorrar() {
        return BtnBorrar;
    }

    public JButton getBtnLimpiar() {
        return BtnLimpiar;
    }

    public TextField getLstAreas() {
        return LstAreas;
    }

    public TextField getLstEstado() {
        return LstEstado;
    }

    public TextField getLstTipoUs() {
        return LstTipoUs;
    }

    public JTable getTblUsuarios() {
        return TblUsuarios;
    }

    public TextField getTxtClave() {
        return TxtClave;
    }

    public TextField getTxtCorreo() {
        return TxtCorreo;
    }

    public TextField getTxtNombre() {
        return TxtNombre;
    }

    //agregar getter
    
}
